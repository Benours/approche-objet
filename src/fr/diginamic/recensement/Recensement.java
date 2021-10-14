package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Recensement {
	private List<Ville> listeVille;

	public Recensement(List<String> lines) {
		List<Ville> liste = new ArrayList<Ville>();

		for (String string : lines) {
			if (string.equals("Code région;Nom de la région;Code département;Code arrondissement;Code canton;Code commune;Nom de la commune;Population municipale;Population comptée à part;Population totale;"))
				continue;
			string = string.trim().replaceAll(" ", "");
			String[] token = string.split(";");
			Region reg = new Region(Integer.parseInt(token[0]), token[1]);
			Departement dep = new Departement(token[2], reg);
			Ville ville = new Ville(Integer.parseInt(token[5]), token[6], Integer.parseInt(token[9]), dep);
			liste.add(ville);
		}
		this.listeVille = liste;
		
	}
	
	public void afficher() {
		for (Ville ville : listeVille) {
			System.out.println(ville.toString());
		}
	}

	public List<Ville> getListeVille() {
		return listeVille;
	}

	public void setListeVille(List<Ville> listeVille) {
		this.listeVille = listeVille;
	}
	
}
