package fr.diginamic.operations;

public class Operations {
	public static double calcul(double a, double b, char c) {
		
		if (c == '+') {
			return a + b;
		}
		else if (c == '-') {
			return a - b;
		}
		else if (c == '*') {
			return a * b;
		}
		else if (c == '/') {
			return a / b;
		}
		else {
			return -0.0;
		}
	}
}
