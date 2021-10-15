package listes;

import java.util.ArrayList;
import java.util.Iterator;

import fr.diginamic.testenumeration.Continent;

public class TestListeVille {

	public static void main(String[] args) {
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
		
		int max = 0;
		int min = tableauVille.get(0).getNombreHabitant();
		String indexMax = " ";
		Ville indexMin = new Ville();
				
		Iterator<Ville> iterator = tableauVille.iterator();
		while (iterator.hasNext()) {
			Ville ville = iterator.next();
			if (ville.getNombreHabitant() > max) {
				max = ville.getNombreHabitant();
				indexMax = ville.getNom();
			}
			
			if (ville.getNombreHabitant() < min) {
				min = ville.getNombreHabitant();
				indexMin = ville;
			}
		}
		System.out.println("Max : " + indexMax);
		System.out.println("Min : " + indexMin.getNom());
		tableauVille.remove(indexMin);
		
		for (int i = 0; i < tableauVille.size(); i++) {
			if (tableauVille.get(i).getNombreHabitant() > 100000) {
				tableauVille.get(i).setNom(tableauVille.get(i).getNom().toUpperCase());
			}
		}

		for (int i = 0; i < tableauVille.size(); i++) 
			System.out.print(tableauVille.get(i) + " ");
		System.out.println();
		
	}
}
