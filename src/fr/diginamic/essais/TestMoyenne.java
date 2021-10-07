package fr.diginamic.essais;

import fr.diginamic.operations.*;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculMoyenne c = new CalculMoyenne();
		c.ajout(1);
		c.ajout(2);
		c.ajout(3);
		c.ajout(4);
		c.ajout(5);
		c.ajout(6);
		c.ajout(7);
		c.ajout(8);
		c.getTableau();
		System.out.print("Tableau : ");
		for(int i = 0; i < c.getTableau().length; i++) {
			System.out.print(c.getTableau()[i] + " ");
		}
		System.out.println();
		System.out.println("Moyenne : " + c.moyenne());
	}

}
