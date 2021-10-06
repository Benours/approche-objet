package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit c1 = new Credit("Mardi", 250);
		Credit c2 = new Credit("Jeudi", 20);
		Debit d1 = new Debit("Lundi", 100);
		Debit d2 = new Debit("Samedi", 10);
		
		Operation[] tableau = {c1, c2, d1, d2};
		
		int total = 0;
		
		for(int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i].toString());
			System.out.println(tableau[i].getType());
			if (tableau[i].getType() == "CREDIT") {
				total += tableau[i].getOperation();
			}
			else if (tableau[i].getType() == "DEBIT") {
				total -= tableau[i].getOperation();	
			}
		}
		System.out.println("Le montant total est de " + total);
	}

}
