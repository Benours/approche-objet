package entites;

public class AdressePostale {
	private int numeroRue;
	private String libelleRue;
	private int codePostal;
	private String ville;
	
	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public AdressePostale() {}

	@Override
	public String toString() {
		return numeroRue + " " + libelleRue + " " + codePostal
				+ " " + ville;
	};
	
	
}
