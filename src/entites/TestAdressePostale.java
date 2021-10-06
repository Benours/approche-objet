package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale a1 = new AdressePostale(13, "rue des froux", 33000, "Cityville");
		AdressePostale a2 = new AdressePostale();
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}

}
