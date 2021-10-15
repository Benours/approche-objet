package listes;

public class Ville implements Comparable<Ville>{
	private String nom;
	private int nombreHabitant;
	
	public Ville(String nom, int nombreHabitant) {
		this.nom = nom;
		this.nombreHabitant = nombreHabitant;
	}
	
	public Ville() {}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getNombreHabitant() {
		return nombreHabitant;
	}
	
	public void setNombreHabitant(int nombreHabitant) {
		this.nombreHabitant = nombreHabitant;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nombreHabitant=" + nombreHabitant + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (!(obj instanceof Ville))
			return false;
		Ville other = (Ville) obj;
		return nom.equals(other.getNom()) && nombreHabitant == other.getNombreHabitant();
	}

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		if (this.nombreHabitant > o.getNombreHabitant())
			return 1;
		if (this.nombreHabitant < o.getNombreHabitant())
			return -1;
		return 0;
	}
	
	
}
