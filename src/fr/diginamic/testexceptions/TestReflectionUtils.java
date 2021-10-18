package fr.diginamic.testexceptions;

import fr.diginamic.testenumeration.Continent;
import listes.Ville;

public class TestReflectionUtils {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		// TODO Auto-generated method stub
		Ville montpellier = new Ville("Montpellier", 300000, Continent.EUROPE);
		ReflectionUtils.afficherAttributs(montpellier);
		ReflectionUtils.afficherAttributs(null);
		
	}

}
