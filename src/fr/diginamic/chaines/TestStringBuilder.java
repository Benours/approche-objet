package fr.diginamic.chaines;

public class TestStringBuilder {
	
	private static final int LOOP = 100000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long debut = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= LOOP; i++) {
			sb.append(i); // 9ms
		}
		
		long fin = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en ms : " + (fin - debut));
		
		debut = 0;
		fin = 0;
		
		debut = System.currentTimeMillis();
		
		String s = "";
		
		for (int i = 1; i <= LOOP; i++) {
			s += i; // 6534ms
		}
		
		fin = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en ms : " + (fin - debut));
	}

}
