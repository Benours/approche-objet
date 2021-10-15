package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (Saison saison : Saison.values()) {
			if (saison.equals(Saison.ETE)) {
				System.out.println(saison.getNombre());
			}
			else {
				System.out.println(saison.getNom());
			}
		}
		Saison hiver = Saison.getInstance("Hiver");
		System.out.println(hiver);
	}
}
