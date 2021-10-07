package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie salarie = new Salarie("Paul", "Jean", "CDI", 2500);
		Pigiste pigiste = new Pigiste("Pierre", "Marc", 21, 103);

		System.out.println("Salaire du salarié " + salarie.getNom() + " : " + salarie.getSalaire());
		System.out.println("Salaire du pigiste " + pigiste.getNom() + " : " + pigiste.getSalaire());
		System.out.println(salarie.afficherDonnees());
		System.out.println(pigiste.afficherDonnees());
	}

}
