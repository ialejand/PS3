import java.sql.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account(){
		
	}

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * @param annualInterestRate the annualInterestRate to set
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	
	double getMontlyInterestRate(){
		return annualInterestRate/12;
	}
	
	double withdraw(double specifiedAmount) throws InsufficientFundsException {
        double difference;
        if(specifiedAmount > balance) {
            difference = specifiedAmount - balance;           
        } else {
            balance -= specifiedAmount;
        }
	}
        
	double deposit(double specifiedAmount){
		return balance += specifiedAmount;
	}
	
}
