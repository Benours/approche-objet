package fr.diginamic.utils;

import fr.diginamic.entites.*;

public class CercleFactory {
	
	public static Cercle creerCercle(double rayon) {
		return new Cercle(rayon);
	}

}
