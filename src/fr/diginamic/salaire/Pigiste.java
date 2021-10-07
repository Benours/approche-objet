package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	private int jourTravail;
	private double salaireJournalier;

	public Pigiste(String nom, String prenom, int jourTravail, double salaireJournalier) {
		super(nom, prenom);
		this.jourTravail = jourTravail;
		this.salaireJournalier = salaireJournalier;
	}

	@Override
	public String afficherDonnees() {
		// TODO Auto-generated method stub
		return super.afficherDonnees() + "Nombre de jour de travail : " + jourTravail + "\n"
				+ "Salaire journalier : " + salaireJournalier;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return jourTravail * salaireJournalier;
	}

}
