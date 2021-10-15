package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS(1, "Printemps"),
	ETE(2, "Ete"),
	AUTOMNE(3, "Automne"),
	HIVER(4, "Hiver");
	
	private String libelle;
	private int nombre;
	
	private Saison(int i, String nom) {
		this.libelle = nom;
		this.nombre = i;
	}
	
	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public String getNom() {
		return libelle;
	}
	
	public void setNom(String nom) {
		this.libelle = nom;
	}
	
	public static Saison getInstance(String libelle) {
		for (Saison saison : Saison.values()) {
			if (saison.getNom().equals(libelle)) {
				return saison;
			}
		}
		return null;
	}
}
