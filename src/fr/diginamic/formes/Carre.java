package fr.diginamic.formes;

public class Carre extends Rectangle {
	private double longueur;

	public Carre(double longueur) {
		super(longueur, longueur);
		this.longueur = longueur;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return Math.pow(longueur, 2.);
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 4 * longueur;
	}
}
