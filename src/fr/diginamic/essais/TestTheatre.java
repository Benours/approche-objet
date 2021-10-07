package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre comedy = new Theatre("Salle Molière", 360);

		comedy.inscrire(365, 9.8);
		comedy.inscrire(200, 5.6);
		System.out.println("Nom de la salle : " + comedy.getNom() + "\n"
				+ "Nombre de place max : " + comedy.getMaxPlace() + "\n"
				+ "Nombre total de clients : " + comedy.getTotalClients() + "\n"
				+ "Recette totale : " + comedy.getRecetteTotale());
	}
}
