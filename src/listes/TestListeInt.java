package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> tableauEntier = new ArrayList<Integer>();
		Collections.addAll(tableauEntier, -1, 5, 7, 3, -2, 4, 8, 5);
		
		for (int i = 0; i < tableauEntier.size(); i++) 
			System.out.print(tableauEntier.get(i) + " ");
		System.out.println();
		System.out.println(tableauEntier.size());
//		Collections.sort(tableauEntier);
		int max = tableauEntier.get(0);
		int min = tableauEntier.get(0);
		int indexMin = 0;
		for (int i = 0; i < tableauEntier.size(); i++) {
			if (tableauEntier.get(i) > max) {
				max = tableauEntier.get(i);
			}
			if (tableauEntier.get(i) < min) {
				indexMin = i;				
			}
		}
		System.out.println("Max : " + max);
		tableauEntier.remove(indexMin);
		for (int i = 0; i < tableauEntier.size(); i++) 
			System.out.print(tableauEntier.get(i) + " ");
		System.out.println();
		for (int i = 0; i < tableauEntier.size(); i++) {
			if (tableauEntier.get(i) < 0) {
				tableauEntier.set(i, tableauEntier.get(i) * -1); 
			}
		}
		for (int i = 0; i < tableauEntier.size(); i++) 
			System.out.print(tableauEntier.get(i) + " ");
		System.out.println();
				
 	}

}
