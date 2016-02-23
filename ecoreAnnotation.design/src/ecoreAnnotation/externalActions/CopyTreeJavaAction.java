package ecoreAnnotation.externalActions;
import ecoreAnnotation.AnnotationClass;
import ecoreAnnotation.AnnotationModel;

import java.util.Collection;

import org.eclipse.emf.ecoretools.design.service.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import ecoreAnnotation.AnnotationModel;

public class CopyTreeJavaAction implements IExternalJavaAction {




//public class CopyRequiredProperties 

	public CopyTreeJavaAction() {
		
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
		List<EAttribute> attribut = (List<EAttribute>) parameters.get("attributs");
		
		List<EClass> classes = new ArrayList<EClass>();
		// Collection<EClass> classes = new ArrayList<EClass>();
		int k=0;
		  Copier copier = new Copier();
			for(int i=0; i< attribut.size(); i++) {
				//tmp = EcoreUtil.copy(attribut.get(i));
				EAttribute tmp = EcoreFactory.eINSTANCE.createEAttribute();
				tmp.setName(attribut.get(i).getName());
				tmp.setEType(attribut.get(i).getEType());
				//EAttribute tmp = attribut.get(i);
				int j=0;
				boolean x = false;
				
				while(j<classes.size() && (!x)){
					//(EClass) attribut.get(i).eContainer()).getEReferences().get(0).getEOpposite().eContainmentFeature()
					if(((EClass) attribut.get(i).eContainer()).getName() == classes.get(j).getName()){
						classes.get(j).getEStructuralFeatures().add(tmp);
						x=true;
					}
					j++;
				}
				
				if(!x){
					EClass clazz = EcoreFactory.eINSTANCE.createEClass();
					clazz.setName(((EClass) attribut.get(i).eContainer()).getName());
					clazz.getEStructuralFeatures().add(tmp);
					classes.add(k, clazz);
					k++;
				}
			}
			
			
			int j=0;
			DesignServices designServices = new DesignServices();
			
			while(j<attribut.size()){
				EClass tmp = (EClass) attribut.get(j).eContainer();
				
				for(int i=0; i<tmp.getEReferences().size();i++){
					//EClass tmp = EcoreUtil.copy(classes.get(j));
					for(int n=0; n<classes.size(); i++){
						if(tmp.getEReferences().get(i).getEOpposite().eContainmentFeature().getName() == classes.get(n).getName()){
							EReference ref = EcoreFactory.eINSTANCE.createEReference();
							ref = (EReference) EcoreUtil.copy(tmp.getEReferences().get(i));
							//classes.
							//ref.setName(tmp.getEReferences().get(i).getName());
							//ref.set
						}
					}

			//	containerView.getRepresentationElements().removeAll(classes);

			designServices.paste(model, tmp, containerView, containerView);
			j++;
			}
			}
			/*int j=0;
			while(j<k){
				System.out.print(classes.size() + "\n");
				System.out.print(classes.indexOf(classes.get(j)) + "   " + classes.get(j).getName() +"\n"); 
				j++;
			}*/
	//designServices.paste(model, tmp, containerView, containerView);
	
	
	//DesignServices.createView(classes.get(0), containerView, SessionManager.INSTANCE.getSession(model), "containerView");
	//EList<EObject> tmp= containerView.eContents();

			
}
}

