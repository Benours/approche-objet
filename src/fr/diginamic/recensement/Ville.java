package fr.diginamic.recensement;

public class Ville {
	private int codeVille;
	private String nomVille;
	private int pop;
	private Departement dep;
	
	public Ville(int codeVille, String nomVille, int pop, Departement dep) {
		this.codeVille = codeVille;
		this.nomVille = nomVille;
		this.pop = pop;
		this.dep = dep;
	}

	public int getCodeVille() {
		return codeVille;
	}

	public void setCodeVille(int codeVille) {
		this.codeVille = codeVille;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public int getPop() {
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}

	public Departement getDep() {
		return dep;
	}

	public void setDep(Departement dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return codeVille + ", nom= " + nomVille + ", population= " + pop + ", dep= " + dep.toString();
	}
	
	
	
}
