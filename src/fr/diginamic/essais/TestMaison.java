package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maison maison = new Maison();
		Cuisine cuisine = new Cuisine(20, 0);
		Salon salon = new Salon(35, 0);
		WC wc1 = new WC(5, 0);
		Chambre chambre1 = new Chambre(12, 1);
		Chambre chambre2 = new Chambre(15, 1);
		SalleDeBain salleDeBain = new SalleDeBain(10, 1);
		WC wc2 = new WC(5, 1);
		Salon erreur = new Salon(-20, 0);

		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(wc1);
		maison.ajouterPiece(chambre1);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(salleDeBain);
		maison.ajouterPiece(wc2);
		maison.ajouterPiece(null);

		System.out.println("La superficie de la maison fait " + maison.superficieTotale() + "m²\n"
				+ "Le rez-de-chaussée fait " + maison.superficieEtage(0) + "m²\n"
				+ "Et le premier étage fait " + maison.superficieEtage(1) + "m²\n"
				+ "La maison comporte " + maison.getPieces().length + " pièces\n"
				+ "Il y a " + maison.nombrePiecesType("Chambre") + " qui ont une superficie totale de " + maison.superficiePieces("Chambre") + "m²");
		
	}

}
