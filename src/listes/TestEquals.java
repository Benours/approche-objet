package listes;

import fr.diginamic.testenumeration.Continent;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville a = new Ville("Montpellier", 100000, Continent.EUROPE);
		Ville b = new Ville("Montpellier", 100000, Continent.EUROPE);
		
		if (a.equals(b))
			System.out.println("Equals");
		
		if (a == b) 
			System.out.println("==");
		
		if (a.getNom() == b.getNom() && a.getNombreHabitant() == b.getNombreHabitant())
			System.out.println("== fonctionnel");
	}

}
