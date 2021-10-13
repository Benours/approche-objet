package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorNom implements Comparator<Ville> {

	@Override
	public int compare(Ville a, Ville b) {
		// TODO Auto-generated method stub
		int result = a.getNom().compareTo(b.getNom());
		return result;
	}
}
