package fr.diginamic.essais;

import fr.diginamic.operations.*;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nb1 = (Math.random() * 100);
		double nb2 = (Math.random() * 100);
		double resultat;
		resultat = Operations.calcul(nb1, nb2, '+');
		System.out.println("Addition : " + resultat);
		resultat = Operations.calcul(nb1, nb2, '-');
		System.out.println("Soustraction : " + resultat);
		resultat = Operations.calcul(nb1, nb2, '*');
		System.out.println("Multiplication : " + resultat);
		resultat = Operations.calcul(nb1, nb2, '/');
		System.out.println("Division : " + resultat);
		resultat = Operations.calcul(nb1, nb2, 'd');
		System.err.println("Erreur : " + resultat);
	}

}
