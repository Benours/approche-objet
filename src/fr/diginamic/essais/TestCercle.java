package fr.diginamic.essais;

import fr.diginamic.entites.*;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c1 = new Cercle((Math.random() * 20));
		Cercle c2 = new Cercle((Math.random() * 20));
		
		Cercle[] tableau = {c1, c2};
		
		for(int i = 0; i < tableau.length; i++) {
			System.out.println("Perimetre : " + tableau[i].perimetre() + "\nSurface : " + tableau[i].surface());
		}
	}

}
