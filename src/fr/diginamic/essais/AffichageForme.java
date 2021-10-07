package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
	public static void afficher(Forme forme) {
		System.out.println("- Surface : " + forme.calculerSurface() + "\n"
				+ "- Perimetre : " + forme.calculerPerimetre());
	}
}
