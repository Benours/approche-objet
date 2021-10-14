package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Path path = Paths.get("C:/Users/benja/OneDrive/Bureau/Diginamic/JAVA/recensement_tp16.csv");
		boolean estFichier = Files.isRegularFile(path);
		boolean estLisible = Files.isReadable(path);

		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);

		if (estFichier) {
			if (estLisible) {
				List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
				Recensement recensement = new Recensement(lines);
				boolean leave = false;
				while (!leave) {
					System.out.println("Que veux tu faire ?\n"
							+ "- 1. Population d’une ville donnée\n"
							+ "- 2. Population d’un département donné\n"
							+ "- 3. Population d’une région donnée\n"
							+ "- 4. Afficher les 10 régions les plus peuplées\n"
							+ "- 5. Afficher les 10 départements les plus peuplés\n"
							+ "- 6. Afficher les 10 villes les plus peuplées d’un département\n"
							+ "- 7. Afficher les 10 villes les plus peuplées d’une région\n"
							+ "- 8. Afficher les 10 villes les plus peuplées de France\n"
							+ "- 9. Sortir");
					int choix = sc.nextInt();
					switch (choix) {
					case 1:
						RecherchePopulationVille ville = new RecherchePopulationVille();
						ville.traiter(recensement, scanner);
						break;
					case 2:
						RecherchePopulationDep departement = new RecherchePopulationDep();
						departement.traiter(recensement, scanner);
						break;
					case 3:
						RecherchePopulationRegion region = new RecherchePopulationRegion();
						region.traiter(recensement, scanner);
						break;
					case 4:
						RegionPlusPeuplee reg10 = new RegionPlusPeuplee();
						reg10.traiter(recensement, scanner);
						break;
					case 5:
						DepartementPlusPeuplee dep10 = new DepartementPlusPeuplee();
						dep10.traiter(recensement, scanner);
						break;
					case 6:
						VilleDep vildep = new VilleDep();
						vildep.traiter(recensement, scanner);
						break;
					case 7:
						VilleRegion vilreg = new VilleRegion();
						vilreg.traiter(recensement, scanner);
						break;
					case 8:
						VillePlusPeuplee ville10 = new VillePlusPeuplee();
						ville10.traiter(recensement, scanner);
						break;
					case 9:
						leave = true;
						break;
					default:
						System.err.println("Choix incorrect!");
						break;

					}

					Thread.sleep(3000);
					System.out.println("\n\n\n\n");
				}
				System.out.println("Merci à bientôt!");
			}
			else {
				System.err.println("Probleme de lecture");
			}
		}
		else {
			System.err.println("Probleme de fichier");
		}
	}
}
