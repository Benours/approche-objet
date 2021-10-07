package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	private String contrat;
	private double salaire;
	
	public Salarie(String nom, String prenom, String contrat, double salaire) {
		super(nom, prenom);
		this.contrat = contrat;
		this.salaire = salaire;
	}

	@Override
	public String afficherDonnees() {
		// TODO Auto-generated method stub
		return super.afficherDonnees() + "Type de contrat : " + contrat + "\nSalaire : " + salaire;
	}

	public String getContrat() {
		return contrat;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaire;
	}

}
