public class AccountTest {

    public static void main(String[] args) {
    	Account acnt = new Account();
    	acnt.setId(1122);
    	acnt.setBalance(20000);
    	acnt.setAnnualInterestRate(4.5);
    	System.out.print("You are withdrawing $2,500. Your balance is now ");
    	acnt.withdraw(2500);
    	System.out.print(acnt.getBalance());
    	System.out.println(acnt.getMontlyInterestRate());
    	System.out.println(acnt.getDateCreated());
    	System.out.print("You are depositing $3,000. Your balance is now ");
    	acnt.deposit(3000);
    	System.out.print(acnt.getBalance());
    	System.out.println(acnt.getMontlyInterestRate());
    	System.out.println(acnt.getDateCreated());
    	}
}