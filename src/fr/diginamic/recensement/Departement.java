package fr.diginamic.recensement;

public class Departement {
	private String codeDepart;
	private Region region;
	
	public Departement(String codeDepart, Region region) {
		this.codeDepart = codeDepart;
		this.region = region;
	}

	public String getCodeDepart() {
		return codeDepart;
	}

	public void setCodeDepart(String codeDepart) {
		this.codeDepart = codeDepart;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return codeDepart + ", region= " + region.toString();
	}
	
	
}
