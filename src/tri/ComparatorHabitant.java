package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville a, Ville b) {
		// TODO Auto-generated method stub
		if (a.getNombreHabitant() > b.getNombreHabitant())
			return 1;
		if (a.getNombreHabitant() < b.getNombreHabitant())
			return -1;
		return 0;
	}

}
