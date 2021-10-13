package sets;

public class Pays {
	private String nom;
	private int nombreHabitant;
	private int pib;
	public Pays(String nom, int nombreHabitant, int pIB) {
		this.nom = nom;
		this.nombreHabitant = nombreHabitant;
		this.pib = pIB;
	}
	
	public Pays() {}

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

	public int getPib() {
		return pib;
	}

	public void setPib(int pib) {
		this.pib = pib;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nombreHabitant=" + nombreHabitant + ", pib=" + pib + "]";
	}
	
	
	
}
