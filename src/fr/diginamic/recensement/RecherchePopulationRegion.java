package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService{
	
	public RecherchePopulationRegion() {}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		int popTotal = 0;
		System.out.println("Quelle région ?");
		String reponse = scanner.nextLine();
		reponse = reponse.trim().replaceAll(" ", "");
		for (Ville ville : recensement.getListeVille()) {
			if(ville.getDep().getRegion().getNomRegion().equals(reponse)) {
				popTotal += ville.getPop();
			}
		}
		System.out.println("La région a une population de " + popTotal);
	}

	
	

}
