package TransactionStreamAPIPrograms;

public class Transaction {
	
	String category;
	int amount;
	
	public Transaction(String category, int amount) {
		super();
		this.category = category;
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public int getAmount() {
		return amount;
	}


	@Override
	public String toString() {
		return "Transaction [category=" + category + ", amount=" + amount + "]";
	}
	
	
	

}
