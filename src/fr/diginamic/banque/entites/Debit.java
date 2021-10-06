package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, int operation) {
		super(date, operation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "DEBIT";
	}
}
