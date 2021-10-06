package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte c1 = new Compte(180697, 13000);
		CompteTaux t1 = new CompteTaux(180698, 1560, 5);
		
		Compte[] tableau = {c1, t1};
		for(int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i].toString());
		}
	}

}
 