package fr.diginamic.chaines;

import fr.diginamic.entites.*;
import java.lang.Double;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère : " + premierCaractere + "\n"
				+ "Longueur de la chaine : " + chaine.length() + "\n"
				+ "Première apparition ';' : " + chaine.indexOf(';') + "\n"
				+ "Nom de famille : " + chaine.substring(0, chaine.indexOf(';')) + "\n"
				+ "- en majuscule : " + chaine.substring(0, chaine.indexOf(';')).toUpperCase() + "\n"
				+ "- en minuscule : " + chaine.substring(0, chaine.indexOf(';')).toLowerCase());
		String[] chaineSplit = chaine.split(";");
		for (int i = 0; i < chaineSplit.length; i++) 
			System.out.println(chaineSplit[i]);
		chaineSplit[2] = chaineSplit[2].replace(" ", "");
		Salarie salarie = new Salarie(chaineSplit[0], chaineSplit[1], Double.parseDouble(chaineSplit[2]));
		System.out.println("Nom : " + salarie.getNom() + "\n"
				+ "Prenom : " + salarie.getPrenom() + "\n"
				+ "Salaire : " + salarie.getSalaire());
	}
}
