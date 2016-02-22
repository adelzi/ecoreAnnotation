package ecoreAnnotation.externalActions;

import java.util.Collection;
import org.eclipse.emf.ecoretools.design.service.*;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import ecoreAnnotation.AnnotationModel;

public class ImportAndCopyEClassJavaAction implements IExternalJavaAction {

	public ImportAndCopyEClassJavaAction() {
		
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		DSemanticDiagramSpec containerView = (DSemanticDiagramSpec) parameters.get("containerView");
		AnnotationModel model = (AnnotationModel) parameters.get("annotationModel");
		List<EClass> classes = (List<EClass>) parameters.get("classes");
		
		//model.getClasses().add(EcoreUtil.copy(classes.get(0)));
		
	//EClass tmp = EcoreUtil.copy((classes.get(0)).eContainer().);
	EClass tmp = EcoreUtil.copy(classes.get(0));	
	//	containerView.getRepresentationElements().removeAll(classes);
	DesignServices designServices = new DesignServices();
	designServices.paste(model, tmp, containerView, containerView);
	
	
	//DesignServices.createView(classes.get(0), containerView, SessionManager.INSTANCE.getSession(model), "containerView");
	//EList<EObject> tmp= containerView.eContents();

			
	}
}
