package ecoreAnnotation.externalActions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertResultToInstance {

	public static void main(String[] argv) throws Exception{

		File fichier = new File("/home/kahina/Plateformes/runtime-EclipseApplication/Students_Diplomas/PDV_models/Resultbis.xmi");

		fichier.createNewFile(); 
		FileWriter fw = new FileWriter("/home/kahina/Plateformes/runtime-EclipseApplication/Students_Diplomas/PDV_models/Resultbis.xmi", true);
		
		// le BufferedWriter output auquel on donne comme argument le FileWriter fw cree juste au dessus
		BufferedWriter output = new BufferedWriter(fw);
		
		//on marque dans le fichier ou plutot dans le BufferedWriter qui sert comme un tampon(stream)
		output.write("<?xml version=\"1.0\" encoding=\"ASCII\"?>");
		//on peut utiliser plusieurs fois methode write
		output.write("<diplomaPrintingPDV:Result xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:diplomaPrintingPDV=\"http://wwww.diplomaPrintingPDV.com\" xsi:schemaLocation=\"http://wwww.diplomaPrintingPDV.com diplomaPrintingPDV.ecore\"/>");
		
		output.flush();
		//ensuite flush envoie dans le fichier, ne pas oublier cette methode pour le BufferedWriter
		
		output.close();
		//et on le ferme
		System.out.println("fichier créé");
	
	}

}
