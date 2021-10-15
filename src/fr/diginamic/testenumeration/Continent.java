package fr.diginamic.testenumeration;

public enum Continent {
	EUROPE("Europe"),
	ASIE("Asie"),
	OCEANIE("Océanie"),
	AFRIQUE("Afrique"),
	AMERIQUE("Amerique");
	
	private String libelle;

	Continent(String string) {
		// TODO Auto-generated constructor stub
		libelle = string;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
