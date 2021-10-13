package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Double> hash = new HashSet<>();
		hash.add(1.5);
		hash.add(8.25);
		hash.add(-7.32);
		hash.add(13.3);
		hash.add(-12.45);
		hash.add(48.5);
		hash.add(0.01);
		double max = 0;
		double min = 0;
		
		for (Double double1 : hash) {
			System.out.println(double1);
			if (double1 > max) {
				max = double1;
			}
			if (double1 < min) {
				min = double1;
			}
		}
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
		hash.remove(min);
		for (Double double1 : hash)
			System.out.println(double1);
	}

}
