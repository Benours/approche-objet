package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String date, int operation) {
		super(date, operation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "CREDIT";
	}
}
