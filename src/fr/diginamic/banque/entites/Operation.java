package fr.diginamic.banque.entites;

public abstract class Operation {
	private String date;
	private int operation;
	
	public Operation(String date, int operation) {
		this.date = date;
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "Operation [date=" + date + ", operation=" + operation + "]";
	}
	
	public String getType() {
		return null;
	}

	public int getOperation() {
		return operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}
	
}
