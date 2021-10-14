package fr.diginamic.recensement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VilleRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("Pour quel région ?");
		String reponse = scanner.nextLine();
		reponse = reponse.trim().replaceAll(" ", "");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (Ville ville : recensement.getListeVille()) {
			if (ville.getDep().getRegion().getNomRegion().equals(reponse))
				map.put(ville.getNomVille(), 0);
		}
		for (Ville ville : recensement.getListeVille()) {
			if (ville.getDep().getRegion().getNomRegion().equals(reponse))
				map.put(ville.getNomVille(), map.get(ville.getNomVille()) + ville.getPop());
		}
		
		ComparatorPerso comp = new ComparatorPerso(map);
		TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(comp);
		sorted_map.putAll(map);
		int i = 0;
		for (Map.Entry<String, Integer> entry : sorted_map.entrySet()) {
			if (i == 10)
				break;
			String key = entry.getKey();
			int value = entry.getValue();
			
			System.out.println(i + 1 + "- " + key + " : " + value);
			i++;
		}

	}

}
