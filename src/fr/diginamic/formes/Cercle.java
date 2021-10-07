package fr.diginamic.formes;

public class Cercle extends Forme {
	private double rayon;
	

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(rayon, 2.);
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * rayon;
	}

}
