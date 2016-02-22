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
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import ecoreAnnotation.AnnotationModel;

public class CopyRequiredProperties implements IExternalJavaAction {

	public CopyRequiredProperties() {
		
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
		
			for(int i=0; i< attribut.size(); i++) {
				//tmp = EcoreUtil.copy(attribut.get(i));
				EAttribute tmp = EcoreFactory.eINSTANCE.createEAttribute();
				tmp.setName(attribut.get(i).getName());
				tmp.setEType(attribut.get(i).getEType());
				//EAttribute tmp = attribut.get(i);
				int j=0;
				boolean x = false;
				
				while(j<classes.size() && (!x)){
					if(((EClass) attribut.get(i).getEContainingClass()).getName() == classes.get(j).getName()){
						classes.get(j).getEStructuralFeatures().add(tmp);
						x=true;
					}
					j++;
				}
				
				if(!x){
					EClass clazz = EcoreFactory.eINSTANCE.createEClass();
					clazz.setName(((EClass) attribut.get(i).getEContainingClass()).getName());
					clazz.getEStructuralFeatures().add(tmp);
					classes.add(k, clazz);
					k++;
				}
			}
		/*	int j=0;
			while(j<classes.size()){
			EClass tmp = EcoreUtil.copy(classes.get(j));	
			//	containerView.getRepresentationElements().removeAll(classes);
			DesignServices designServices = new DesignServices();
			designServices.paste(model, tmp, containerView, containerView);
			j++;
			}*/
			int j=0;
			while(j<k){
				System.out.print(classes.size() + "\n");
				System.out.print(classes.indexOf(classes.get(j)) + "   " + classes.get(j).getName() +"\n"); 
				j++;
			}
	//designServices.paste(model, tmp, containerView, containerView);
	
	
	//DesignServices.createView(classes.get(0), containerView, SessionManager.INSTANCE.getSession(model), "containerView");
	//EList<EObject> tmp= containerView.eContents();

			
}
}
