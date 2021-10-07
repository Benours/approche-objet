package fr.diginamic.essais;

import fr.diginamic.entites.*;
import fr.diginamic.utils.*;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c1 = new Cercle((Math.random() * 20));
		Cercle c2 = new Cercle((Math.random() * 20));
				
		Cercle c3 = CercleFactory.creerCercle(13);

		Cercle[] tableau = {c1, c2, c3};
		
		for(int i = 0; i < tableau.length; i++) {
			System.out.println("Perimetre : " + tableau[i].perimetre() + "\nSurface : " + tableau[i].surface());
		}
	}

}
