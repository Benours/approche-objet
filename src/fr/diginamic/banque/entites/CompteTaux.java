package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	private int tauxRemuneration;
	
	public CompteTaux(int numeroCompte, int soldeCompte, int tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return super.toString() + "\ntaux de rémunération : " + tauxRemuneration;
	}
	
	
}
