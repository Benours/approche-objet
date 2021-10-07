package fr.diginamic.jdr;

import java.util.Scanner;
import java.lang.Thread;

public class Jeu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("******  JDR  ******");
		System.out.println("Bienvenue nouveau joueur");
		System.out.println("Veux-tu jouer ? (Oui/Non)");
		Scanner scanner = new Scanner(System.in);
		String reponse = scanner.nextLine();
		if (reponse.contains("Oui")) {
			System.out.println("\n\n\n");
			System.out.println("Reçu! Je vais te créer un personnage.");
			System.out.println("Chargement...");
			Thread.sleep(1000);
			System.out.println("Chargement...");
			Thread.sleep(1000);
			System.out.println("Chargement...");
			Thread.sleep(1000);
			Personnage joueur = new Personnage();
			System.out.println("Voici ton personnage :");
			System.out.println("Tu as " + joueur.getForce() + " de Force et " + joueur.getPointVie() + " de Points de Vie.");
			Thread.sleep(2000);
			while(true) {
				System.out.println("\n\n\n");
				System.out.println("C'est parti! Que veux-tu faire ?\n"
						+ "1- Voir ses stats\n"
						+ "2- Se reposer (+ 5PV)\n"
						+ "3- Combattre\n"
						+ "4- S'arreter");
				int choix = scanner.nextInt();
				if (choix == 1) {
					System.out.println("\n\n\n");
					System.out.println("Tu as " + joueur.getForce() + " de Force et " + joueur.getPointVie() + " de Points de Vie.");
				}
				else if (choix == 2) {
					joueur.repos();
				} 
				else if (choix == 3) {
					int monstre = (int) (Math.random() * 3) + 1;
					Loup loup = new Loup();
					Gobelin gobelin = new Gobelin();
					Troll troll = new Troll();
					while (true)  {
						int attaqueJoueur = 0;
						int attaqueMonstre = 0;
						if (monstre == 1) {
							System.out.println("Un loup : ");
							System.out.println("- PV : " + loup.getPointVie());
							System.out.println("- Force : " + loup.getForce());
							attaqueMonstre = loup.getForce() + (int) (Math.random() * 10);
						}
						else if (monstre == 2) {
							System.out.println("Un gobelin : ");
							System.out.println("- PV : " + gobelin.getPointVie());
							System.out.println("- Force : " + gobelin.getForce());	
							attaqueMonstre = gobelin.getForce() + (int) (Math.random() * 10);
						}
						else {
							System.out.println("Un troll : ");
							System.out.println("- PV : " + troll.getPointVie());
							System.out.println("- Force : " + troll.getForce());							
							attaqueMonstre = troll.getForce() + (int) (Math.random() * 10);
						}
						Thread.sleep(1000);
						break;
					}
				}
				else if (choix == 4) {
					break;
				}
				else {
					System.err.println("Réponse invalide");
				}
				Thread.sleep(2000);
			}
			System.out.println("\n\n\n");
			System.out.println("Bien jouée! Ton score est de " + joueur.getScore() + "\n"
					+ "A bientôt!");
		}
		else {
			System.out.println("Très bien à bientôt!");
		}
		scanner.close();
	}

}
