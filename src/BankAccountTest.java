
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		a1.depositChecking(500.0);
		a1.depositSavings(100.0);
		a1.withdrawChecking(100.0);
		System.out.println(a1.getSavings());
		a2.depositChecking(5.5);
		a2.depositSavings(25.75);
		a2.getTotalFunds();
		a2.withdrawChecking(10.0);
		System.out.println(a2.getSavings());
		BankAccount.getMemberCount();
		System.out.println(BankAccount.getTotalAssets());
	}

}

