package sets;

import java.util.HashSet;
import java.util.Set;

import fr.diginamic.testexceptions.ReflectionException;
import fr.diginamic.testexceptions.RuleException;
import utils.StringUtils;

public class TestSetPays {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, ReflectionException, RuleException {
		// TODO Auto-generated method stub
		Pays usa = null;
		try {
			usa = new Pays("USA", 332, 20494);
		} catch (RuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pays france = null;
		try {
			france = new Pays("France", 65, 2775);
		} catch (RuleException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Pays allemagne = null;
		try {
			allemagne = new Pays("Allemagne", 83, 4000);
		} catch (RuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pays uk = null;
		try {
			uk = new Pays("UK", 68, 2828);
		} catch (RuleException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Pays italie = null;
		try {
			italie = new Pays("Italie", 60, 2072);
		} catch (RuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pays japon = null;
		try {
			japon = new Pays("Japon", 126, 4971);
		} catch (RuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pays chine = null;
		try {
			chine = new Pays("Chine", 1444, 13407);
		} catch (RuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pays russie = null;
		try {
			russie = new Pays("Russie", 145, 1630);
		} catch (RuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pays inde = null;
		try {
			inde = new Pays("Inde", -3, 2716);
		} catch (RuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			inde = new Pays("Inde", 1, 2716);
		}
		
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
			StringUtils.afficherAttributs(pays);
			System.out.println("PIB total : " + pays.getPib() * pays.getNombreHabitant());
		}
	}

}
