package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	private String contrat;
	private double salaire;
	
	public Salarie(String nom, String prenom, String contrat, double salaire) {
		super(nom, prenom);
		this.contrat = contrat;
		this.salaire = salaire;
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
