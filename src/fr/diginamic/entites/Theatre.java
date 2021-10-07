package fr.diginamic.entites;

public class Theatre {
	private String nom;
	private int maxPlace;
	private int totalClients;
	private double recetteTotale;
	
	public Theatre(String nom, int maxPlace) {
		this.nom = nom;
		this.maxPlace = maxPlace;
	}
	
	public void inscrire(int nombreClients, double prixPlace) {
		if (nombreClients < maxPlace) {
			totalClients = nombreClients;
			recetteTotale = nombreClients * prixPlace;
		}
		else {
			System.err.println("Capacité maximale atteinte!");
		}
	}

	public String getNom() {
		return nom;
	}

	public int getMaxPlace() {
		return maxPlace;
	}

	public int getTotalClients() {
		return totalClients;
	}

	public double getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(double recetteTotale) {
		this.recetteTotale = recetteTotale;
	}
}
