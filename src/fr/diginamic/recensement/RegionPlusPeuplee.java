package fr.diginamic.recensement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RegionPlusPeuplee extends MenuService {
	
	public RegionPlusPeuplee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (Ville ville : recensement.getListeVille()) {
			map.put(ville.getDep().getRegion().getNomRegion(), 0);
		}
		for (Ville ville : recensement.getListeVille()) {
			map.put(ville.getDep().getRegion().getNomRegion(), map.get(ville.getDep().getRegion().getNomRegion()) + ville.getPop());
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
