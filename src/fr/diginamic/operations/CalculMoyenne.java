package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	
	private double[] tableau;	
	
	public CalculMoyenne() {
		this.tableau = new double[0];
	}

	public void ajout(double d) {
		tableau = Arrays.copyOf(tableau, tableau.length + 1);
		tableau[tableau.length - 1] = d;
	}
	
	public double[] getTableau() {
		return tableau;
	}

	public void setTableau(double[] tableau) {
		this.tableau = tableau;
	}

	public double moyenne() {
		double resultat = 0;
		
		for(int i = 0; i < tableau.length; i++)
			resultat += tableau[i];
		
		return resultat / tableau.length;
	}
}
