package interfaces;

public class Rectangle implements ObjetGeometrique {
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2 * longueur + 2 * largeur;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return longueur * largeur;
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "RECTANGLE";
	}

}
