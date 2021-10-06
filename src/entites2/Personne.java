package entites2;

import entites.AdressePostale;

public class Personne {
	private String nom;
	private String prenom;
	private AdressePostale adresse;
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse.toString() + "]";
	}
	
}
