package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pays usa = new Pays("USA", 332, 20494);
		Pays france = new Pays("France", 65, 2775);
		Pays allemagne = new Pays("Allemagne", 83, 4000);
		Pays uk = new Pays("UK", 68, 2828);
		Pays italie = new Pays("Italie", 60, 2072);
		Pays japon = new Pays("Japon", 126, 4971);
		Pays chine = new Pays("Chine", 1444, 13407);
		Pays russie = new Pays("Russie", 145, 1630);
		Pays inde = new Pays("Inde", 1393, 2716);
		
		Set<Pays> hash = new HashSet<>();
		hash.add(usa);
		hash.add(france);
		hash.add(allemagne);
		hash.add(uk);
		hash.add(italie);
		hash.add(japon);
		hash.add(chine);
		hash.add(russie);
		hash.add(inde);
		
		Pays maxPibHab = france;
		Pays maxPib = france;
		Pays minPib = france;
		for (Pays pays : hash) {
			if (pays.getPib() > maxPibHab.getPib()) 
				maxPibHab = pays;
			if (pays.getPib() * pays.getNombreHabitant() > maxPib.getPib() * maxPib.getNombreHabitant())
				maxPib = pays;
			if (pays.getPib() * pays.getNombreHabitant() < minPib.getPib() * minPib.getNombreHabitant())
				minPib = pays;
		}
		maxPib.setNom(maxPib.getNom().toUpperCase()); 
		hash.remove(minPib);
		for (Pays pays : hash) {
			System.out.println(pays.toString() + " PIB total : " +pays.getPib() * pays.getNombreHabitant());
		}
	}

}
