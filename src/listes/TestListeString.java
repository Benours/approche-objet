package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> tableauString = new ArrayList<>();
		Collections.addAll(tableauString, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
		int longueur = 0;
		int indexMot = 0;
		Iterator<String> iterator = tableauString.iterator();
		for (int i = 0; i < tableauString.size(); i++) {
			if (tableauString.get(i).length() > longueur) {
				longueur = tableauString.get(i).length();
				indexMot = i;
			}
		}
		System.out.println("Le mot le plus long est " + tableauString.get(indexMot));
		for(int i = 0; i < tableauString.size(); i++) {
			tableauString.set(i, tableauString.get(i).toUpperCase());
		}
		for (int i = 0; i < tableauString.size(); i++) 
			System.out.print(tableauString.get(i) + " ");
		System.out.println();
		while(iterator.hasNext()) {
			String string = iterator.next();
			if (string.charAt(0) == 'N')
				iterator.remove();
		}
		for (int i = 0; i < tableauString.size(); i++) 
			System.out.print(tableauString.get(i) + " ");
		System.out.println();
		
	}

}
