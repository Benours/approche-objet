package fr.diginamic.essais;

import fr.diginamic.formes.*;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle = new Cercle(3.14);
		Rectangle rectangle = new Rectangle(14, 13);
		Carre carre = new Carre(12.9);

		System.out.println("Cercle :");
		AffichageForme.afficher(cercle);
		System.out.println("Rectangle :");
		AffichageForme.afficher(rectangle);
		System.out.println("Carre :");
		AffichageForme.afficher(carre);
	}

}
