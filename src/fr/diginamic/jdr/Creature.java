package fr.diginamic.jdr;

public abstract class Creature {
	private int force;
	private int pointVieMax;
	private int pointVie;
	private int score;

	public Creature(int force, int pointVie, int score) {
		this.force = force;
		this.pointVieMax = pointVie;
		this.pointVie = this.pointVieMax;
		this.score = score;
	}
	
	public int getForce() {
		return force;
	}

	public int getPointVie() {
		return pointVie;
	}

	public void degat(int degat) {
		this.pointVie -= degat;
	}

	public int getScore() {
		return score;
	}	
}
