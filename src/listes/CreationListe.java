package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> tableau100 = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			tableau100.add(i);
		}
		for (int i = 0; i < tableau100.size(); i++)
			System.out.println(tableau100.get(i));
	}

}
