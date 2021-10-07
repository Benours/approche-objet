package interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c1 = new Cercle(8);
		Rectangle r1 = new Rectangle(6, 9);
		
		ObjetGeometrique[] tableau = {c1, r1};
		
		for(int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i].type());
			System.out.println("Perimetre : " + tableau[i].perimetre() + "\nSurface : " + tableau[i].surface());
		}
	}

}
