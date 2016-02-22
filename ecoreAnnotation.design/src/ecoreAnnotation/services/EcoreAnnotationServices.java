package ecoreAnnotation.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.emf.ecore.resource.Resource;

import ecoreAnnotation.AnnotationClass;
import ecoreAnnotation.AnnotationModel;
import ecoreAnnotation.EcoreAnnotationPackage;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class EcoreAnnotationServices {

private List<EObject> allValidSessionElements(EObject cur, Predicate<EObject> validForClassDiagram) {
        Session found = SessionManager.INSTANCE.getSession(cur);
        List<EObject> result = Lists.newArrayList();
        if (found != null) {
            for (Resource res : found.getSemanticResources()) {
                if (res.getURI().isPlatformResource() || res.getURI().isPlatformPlugin()) {
                    Iterators.addAll(result, Iterators.filter(res.getAllContents(), validForClassDiagram));
                }
            }
        }
        return result;
    }
 public List<EObject> getValidsForDiagram_ModelAnnotation(final EObject element, final DSemanticDecorator containerView) {
        Predicate<EObject> validForClassDiagram = new Predicate<EObject>() {

            public boolean apply(EObject input) {
                return input instanceof ecoreAnnotation.AnnotationModel || (input instanceof EClassifier && !(input instanceof AnnotationClass)) || input instanceof EAttribute;
            }
        };
        return allValidSessionElements(element, validForClassDiagram);
    }
 
 
 public Collection<EObject> allRoots(EObject any) {
     Resource res = any.eResource();
     if (res != null && res.getResourceSet() != null) {
         Collection<EObject> roots = new ArrayList<EObject>();
         for (Resource childRes : res.getResourceSet().getResources()) {
             roots.addAll(childRes.getContents());
         }
         return roots;
     } else {
         return Collections.emptySet();
     }
 }

 public LinkedHashSet<AnnotationModel> rootAnnotationModels(EObject any) {
     return Sets.newLinkedHashSet(Iterables.filter(allRoots(any), ecoreAnnotation.AnnotationModel.class));
 }

 
public LinkedHashSet<EClass> rootClasses(EObject any) {
    return Sets.newLinkedHashSet(((AnnotationModel)any).getClasses());
}

public LinkedHashSet<EObject> rootAttributes(EObject any) {
	LinkedHashSet<EObject> list = new LinkedHashSet<EObject>();
	for (EClass clazz: ((AnnotationModel)any).getClasses() ) {
		list.add(clazz);
		list.addAll(clazz.getEAttributes());
	}
    return list;
}

public TreeMap<EObject, EList<EAttribute>> rAttributes(EObject any) {
	TreeMap<EObject,  EList<EAttribute>> list = new TreeMap<EObject,  EList<EAttribute>>();
	for (EClass clazz: ((AnnotationModel)any).getClasses() ) {
		list.put(clazz, clazz.getEAttributes());
	}
    return list;
}
 
 
 public Boolean isEClass_Annotation(EObject any) {
     return any instanceof AnnotationClass;
 }
 
public Boolean isEAttribute(EObject any) {
     return any instanceof EAttribute;
 }

}
