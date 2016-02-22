package ecoreAnnotation.presentation;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;


public class EcoreAnnotationProjectIWizard extends BasicNewResourceWizard implements
INewWizard, IExecutableExtension {

	private WizardNewProjectCreationPage wizardPage;
	private IConfigurationElement config;
	private IProject project;


	/**
	 * 
	 */
	public EcoreAnnotationProjectIWizard() {
		super();
	}

	/**
	 * 
	 */
	public void addPages() {
		wizardPage = new WizardNewProjectCreationPage("NewEcoreAnnotationProject");
		wizardPage.setDescription("Create a new Ecore Annotation Project.");
		wizardPage.setTitle("New Ecore Annotation Project");
		addPage(wizardPage);
	}

	/**
	 * 
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		// setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(EcoreAnnotationEditorPlugin.INSTANCE.getImage("full/wizban/NewEscm")));

	}

	/**
	 * 
	 */
	@Override
	public boolean performFinish() {
		if (project != null) {
			return true;
		}

		final String projectName = wizardPage.getProjectName();
		final IPath locationPath = wizardPage.getLocationPath();
		final IProject projectHandle = wizardPage.getProjectHandle();
		

		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
			protected void execute(IProgressMonitor monitor)
					throws CoreException {
				ModelingProjectManager.INSTANCE.createNewModelingProject(projectName, locationPath, true, monitor);			
			}
		};

		try {
			getContainer().run(true, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error",
					realException.getMessage());
			return false;
		}

		project = projectHandle;

		if (project == null) {
			return false;
		}

		WorkspaceModifyOperation op2 = new WorkspaceModifyOperation() {
			protected void execute(IProgressMonitor monitor)
					throws CoreException {
				monitor.beginTask("Nature, Folders and Files", 4000);
				// Add Nature
				addNature(project, new NullProgressMonitor());

				// adding folders 
				List<String> baseFolders = new ArrayList<String>();
				baseFolders.add("ontologies");
				baseFolders.add("generalDomain_models");
				baseFolders.add("annotated_models");
				baseFolders.add("enriched_models");
				baseFolders.add("PDV_models");
				baseFolders.add("view_models");
				for (String folder : baseFolders) {
					addFolderToProject(project, folder, new SubProgressMonitor(
							monitor, 100));
				}
				monitor.done();
			}
		};

		try {
			getContainer().run(true, true, op2);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			return false;
		}
		

		BasicNewProjectResourceWizard.updatePerspective(config);
		BasicNewProjectResourceWizard.selectAndReveal(project, getWorkbench()
				.getActiveWorkbenchWindow());

		return true;
	}

	@Override
	/**
	 * 
	 */
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		this.config = config;

	}


	/**
	 * 
	 * @param pProject
	 * @param monitor
	 * @throws CoreException
	 * @throws OperationCanceledException
	 */
	private static void addNature(IProject pProject, IProgressMonitor monitor)
			throws CoreException, OperationCanceledException {
		monitor.beginTask("Adding Nature", 100);
		if (!pProject.hasNature(EcoreAnnotationNature.NATURE_ID)) {
			IProjectDescription description = pProject.getDescription();
			String[] prevNatures = description.getNatureIds();
			String[] newNatures = new String[prevNatures.length + 1];
			System.arraycopy(prevNatures, 0, newNatures, 1, prevNatures.length);
			newNatures[0] = EcoreAnnotationNature.NATURE_ID;
			description.setNatureIds(newNatures);
			pProject.setDescription(description, monitor);
		}
		monitor.done();
	}
	
	  /**
     * Create a folder structure with a parent root, overlay, and a few child
     * folders.
     * 
     * @param newProject
     * @param paths
     * @throws CoreException
     */
    private static void addFolderToProject(IProject newProject, String path, IProgressMonitor monitor) throws CoreException, OperationCanceledException {
    		monitor.beginTask("Adding folder " + path, 100);
    		IFolder etcFolders = newProject.getFolder(path);
            createFolder(etcFolders);
            monitor.done();
    }
    
    private static void createFolder(IFolder folder) throws CoreException {
        IContainer parent = folder.getParent();
        if (parent instanceof IFolder) {
            createFolder((IFolder) parent);
        }
        if (!folder.exists()) {
            folder.create(false, true, null);
        }
    }

}
