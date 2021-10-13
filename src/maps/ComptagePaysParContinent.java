package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pays> listePays = new ArrayList<Pays>();
		Pays france = new Pays("France", 65, "Europe");
		Pays allemagne = new Pays("Allemagne", 80, "Europe");
		Pays belgique = new Pays("Belgique", 10, "Europe");
		Pays russie = new Pays("Russie", 150, "Asie");
		Pays chine = new Pays("Chine", 1400, "Asie");
		Pays indonesie = new Pays("Indonésie", 220, "Océanie");
		Pays australie = new Pays("Australie", 20, "Océanie");
		
		listePays.add(france);
		listePays.add(allemagne);
		listePays.add(belgique);
		listePays.add(russie);
		listePays.add(chine);
		listePays.add(indonesie);
		listePays.add(australie);
		
		HashMap<String, Integer> comptage = new HashMap<String, Integer>();
		comptage.put("Europe", 0);
		comptage.put("Amerique", 0);
		comptage.put("Océanie", 0);
		comptage.put("Asie", 0);
		comptage.put("Afrique", 0);
		comptage.put("Antartique", 0);
		
		for (Pays pays : listePays) {
			comptage.put(pays.getContinent(), comptage.get(pays.getContinent()) + 1);
		}
		
		Set<String> cle = comptage.keySet();
		for (String pays : cle) {
			int i = comptage.get(pays);
			
			System.out.println(pays + " " + i);
		}
	}

}
 