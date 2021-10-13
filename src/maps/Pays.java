package maps;

public class Pays {
	private String nom;
	private int nombreHabitant;
	private String continent;
	public Pays(String nom, int nombreHabitant, String continent) {
		this.nom = nom;
		this.nombreHabitant = nombreHabitant;
		this.continent = continent;
	}
	public Pays() {
	}
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
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nombreHabitant=" + nombreHabitant + ", continent=" + continent + "]";
	}
	
}
