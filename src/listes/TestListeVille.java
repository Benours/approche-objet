package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeVille {

	public static void main(String[] args) {
		Ville nice = new Ville("Nice", 343000);
		Ville carcassonne = new Ville("Carcassonne", 47800);
		Ville narbonne = new Ville("Narbonne", 53000);
		Ville lyon = new Ville("Lyon", 484000);
		Ville foix = new Ville("Foix", 9700);
		Ville pau = new Ville("Pau", 77200);
		Ville marseille = new Ville("Marseille", 850700);
		Ville tarbes = new Ville("Tarbes", 40600);
		
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

		for (int i = 0; i < tableauVille.size(); i++) 
			System.out.print(tableauVille.get(i) + " ");
		System.out.println();
		
	}
}
