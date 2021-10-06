package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1 = new Personne("BASKA", "Benjamin", new AdressePostale(13, "rue deesse", 34000, "Montpellier"));
		Personne p2 = new Personne("PRADE", "Christine");
		p2.setAdresse(new AdressePostale(1009, "rue des pommiers", 75000, "Paris"));
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
