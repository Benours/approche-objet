package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hash = new HashSet<>();
		hash.add("USA");
		hash.add("France");
		hash.add("Allemagne");
		hash.add("UK");
		hash.add("Italie");
		hash.add("Japon");
		hash.add("Chine");
		hash.add("Russie");
		hash.add("Inde");

		for (String string : hash) 
			System.out.println(string);
		System.out.println();
		String max = " ";
		for (String string : hash) {
			if (string.length() > max.length()) 
				max = string;
		}
		hash.remove(max);
		for (String string : hash) 
			System.out.println(string);
	}

}
