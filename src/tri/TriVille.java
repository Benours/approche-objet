package tri;

import java.util.ArrayList;
import java.util.Collections;

import fr.diginamic.testenumeration.Continent;
import listes.Ville;

public class TriVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville nice = new Ville("Nice", 343000, Continent.EUROPE);
		Ville carcassonne = new Ville("Carcassonne", 47800, Continent.EUROPE);
		Ville narbonne = new Ville("Narbonne", 53000, Continent.EUROPE);
		Ville lyon = new Ville("Lyon", 484000, Continent.EUROPE);
		Ville foix = new Ville("Foix", 9700, Continent.EUROPE);
		Ville pau = new Ville("Pau", 77200, Continent.EUROPE);
		Ville marseille = new Ville("Marseille", 850700, Continent.EUROPE);
		Ville tarbes = new Ville("Tarbes", 40600, Continent.EUROPE);
		
		ArrayList<Ville> tableauVille = new ArrayList<Ville>();
		tableauVille.add(nice);
		tableauVille.add(carcassonne);
		tableauVille.add(narbonne);
		tableauVille.add(lyon);
		tableauVille.add(foix);
		tableauVille.add(pau);
		tableauVille.add(marseille);
		tableauVille.add(tarbes);
		
		Collections.sort(tableauVille); 
		
		for (Ville ville : tableauVille)
			System.out.println(ville);
		
		System.out.println();
		
		Collections.sort(tableauVille, new ComparatorNom());
		
		for (Ville ville : tableauVille)
			System.out.println(ville);
		
		System.out.println();
		
		Collections.sort(tableauVille, new ComparatorHabitant());
		
		for (Ville ville : tableauVille)
			System.out.println(ville);
	}

}
