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
						+ "2- Voir scores\n"
						+ "3- Se reposer (+ 5PV -3 score)\n"
						+ "4- Combattre\n"
						+ "5- S'arreter");
				int choix = scanner.nextInt();
				if (choix == 1) {
					System.out.println("\n\n\n");
					joueur.afficher();
				}
				else if (choix == 2) {
					System.out.println("\n\n\n");
					System.out.println("Ton score est de " + joueur.getScore());
				}
				else if (choix == 3) {
					joueur.repos();
					joueur.setScore(-3);
				} 
				else if (choix == 4) {
					Creature creature = new Creature();
					while (true)  {
						int attaqueJoueur = joueur.attaque();
						int attaqueMonstre = creature.attaque();
						System.out.println("\n\n\n");
						System.out.println(creature.getType() + " : ");
						creature.afficher();
						Thread.sleep(2000);
						System.out.println("\n\n\n");
						System.out.println("Le monstre attaque : " + attaqueMonstre + " DGT!");
						System.out.println("Votre attaque : " + attaqueJoueur + " DGT!");
						if (attaqueJoueur < attaqueMonstre) {
							joueur.degat(attaqueMonstre - attaqueJoueur);
						}
						else {
							creature.degat(attaqueJoueur - attaqueMonstre);
						}
						if (joueur.getPointVie() <= 0) {
							System.out.println("Oh non tu es mort!");
							break;
						}
						if (creature.getPointVie() <= 0) {
							System.out.println("Bravo tu as gagné : " + creature.getScore() + " de score");
							joueur.setScore(creature.getScore());
							break;	
						}
						Thread.sleep(2000);
					}
				}
				else if (choix == 5) {
					break;
				}
				else {
					System.out.println("\n\n\n");
					System.err.println("Réponse invalide");
				}

				if (joueur.getPointVie() <= 0) {
					break;
				}
				Thread.sleep(2000);

				if (joueur.getScore() < 0) {
					System.out.println("\n\n\n");
					System.out.println("Ton score est négatif tu as perdu!");
					Thread.sleep(2000);
					break;
				}
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
