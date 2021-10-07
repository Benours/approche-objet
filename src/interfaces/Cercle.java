package interfaces;

public class Cercle implements ObjetGeometrique {
	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return rayon * Math.PI * 2;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(rayon, 2.0);
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "CERCLE";
	}

}
