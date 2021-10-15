package maps;

import java.util.HashMap;
import java.util.Set;

import fr.diginamic.testenumeration.Continent;
import listes.Ville;

public class MapVilles {

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
		
		HashMap<String, Ville> map = new HashMap<String, Ville>();
		map.put(nice.getNom(), nice);
		map.put(carcassonne.getNom(), carcassonne);
		map.put(narbonne.getNom(), narbonne);
		map.put(lyon.getNom(), lyon);
		map.put(foix.getNom(), foix);
		map.put(pau.getNom(), pau);
		map.put(marseille.getNom(), marseille);
		map.put(tarbes.getNom(), tarbes);
		
		Set<String> nom = map.keySet();
		Ville petite = pau;
		
		for (String string : nom) {
			Ville ville = map.get(string);
			
			if (ville.getNombreHabitant() < petite.getNombreHabitant()) 
				petite = ville;
		}
		
		map.remove(petite.getNom());
		
		for (String string : nom) {
			Ville ville = map.get(string);
			
			System.out.println(string + " : " + ville.toString());
		}
		
	}

}
