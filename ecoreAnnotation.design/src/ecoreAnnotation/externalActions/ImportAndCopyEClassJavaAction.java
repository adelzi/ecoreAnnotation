package ecoreAnnotation.externalActions;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

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
	
		AnnotationModel model = (AnnotationModel) parameters.get("annotationModel");
		List<EClass> classes = (List<EClass>) parameters.get("classes");
		
		model.getClasses().add(EcoreUtil.copy(classes.get(0)));
		
		//DSemanticDiagramSpec containerView = (DSemanticDiagramSpec) parameters.get("containerView");
	}
}
