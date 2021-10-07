package fr.diginamic.formes;

public class Rectangle extends Forme {
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return longueur * largeur;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2 * longueur + 2 * largeur;
	}

}
