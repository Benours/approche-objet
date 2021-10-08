package fr.diginamic.jdr;



public class Creature {
	private int force;
	private int pointVieMax;
	private int pointVie;
	private int score;
	private String type;

	public Creature() {
		int monstre = (int) (Math.random() * 3) + 1;

		switch (monstre) {
		case 1:
			this.force = (int) (Math.random() * 5) + 3;
			this.pointVieMax = (int) (Math.random() * 5) + 5;
			this.pointVie = this.pointVieMax;
			this.score = 1;
			this.type = "Loup";
			break;
		case 2:
			this.force = (int) (Math.random() * 5) + 5;
			this.pointVieMax = (int) (Math.random() * 5) + 10;
			this.pointVie = this.pointVieMax;
			this.score = 2;
			this.type = "Gobelin";
			break;
		case 3:
			this.force = (int) (Math.random() * 5) + 10;
			this.pointVieMax = (int) (Math.random() * 10) + 20;
			this.pointVie = this.pointVieMax;
			this.score = 5;
			this.type = "Troll";
			break;

		default:
			break;
		}
	}
	
	public int attaque() {
		return this.getForce() + (int) (Math.random() * 10);
	}
	
	public void afficher() {
		System.out.println("Il a " + this.getForce() + " de Force et " + this.getPointVie() + " PV sur " + this.getPointVieMax() + " PV");
	}

	public String getType() {
		return type;
	}

	public int getPointVieMax() {
		return pointVieMax;
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
