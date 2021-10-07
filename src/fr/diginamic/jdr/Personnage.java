package fr.diginamic.jdr;

public class Personnage {
	private int force;
	private int pointVieMax;
	private int pointVie;
	private int score;
	
	public Personnage() {
		this.force = (int) (Math.random() * 6) + 12;
		this.pointVieMax = (int) (Math.random() * 30) + 20;
		this.pointVie = this.pointVieMax;
		this.score = 0;
	}

	public int getForce() {
		return force;
	}

	public int getPointVie() {
		return pointVie;
	}
	
	public void degat(int degat) {
		System.out.println("\n\n\n");
		System.out.println("Ouch! Tu as recu " + degat + " de dégat!");
		this.pointVie -= degat;
	}

	public void repos() {
		System.out.println("\n\n\n");
		if (this.pointVie <= this.pointVieMax && this.pointVie >= this.pointVieMax - 5) {
			System.out.println("Tu es au max! Tu as " + this.pointVie + " PV");
			this.pointVie = this.pointVieMax;
		}
		else {
			this.pointVie += 5;
			System.out.println("Tu t'es bien reposé! Tu as " + this.pointVie + " PV (max " + this.pointVieMax + " PV)");
		}
	}

	public int getPointVieMax() {
		return pointVieMax;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score += score;
	}
	
	
	
}
