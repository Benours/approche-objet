package maps;

import java.util.HashMap;
import java.util.Set;

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		HashMap<Integer, String> map3 = new HashMap<>();

		Set<Integer> nb1 = map1.keySet();
		Set<Integer> nb2 = map2.keySet();
		Set<Integer> nb3 = map3.keySet();
		
		for (int i : nb1) {
			String couleur = map1.get(i);
			map3.put(i, couleur);
		}
		for (int i : nb2) {
			String couleur = map2.get(i);
			map3.put(i, couleur);
		}
		for (int i : nb3) {
			String couleur = map3.get(i);
			System.out.println(i + "- " + couleur);
		}
	}

}
