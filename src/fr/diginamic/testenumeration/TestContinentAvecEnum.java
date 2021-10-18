package fr.diginamic.testenumeration;

import java.util.ArrayList;

import listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville paris = new Ville("Paris", 2161000, Continent.EUROPE);
		Ville newyork = new Ville("New York", 8419000, Continent.AMERIQUE);
		Ville sydney = new Ville("Sydney", 5312000, Continent.OCEANIE);
		Ville tokyo = new Ville("Tokyo", 13960000, Continent.ASIE);
		Ville pretoria = new Ville("Pretoria", 741000, Continent.AFRIQUE);
		
		ArrayList<Ville> tableauVille = new ArrayList<Ville>();
		tableauVille.add(paris);
		tableauVille.add(newyork);
		tableauVille.add(sydney);
		tableauVille.add(tokyo);
		tableauVille.add(pretoria);
		
		for (Ville ville : tableauVille) {
			System.out.println(ville.toString());
		}

	}

}
