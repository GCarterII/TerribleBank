import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checking;
	private double savings;
	private static int memberCount = 0;
	private static double totalAssets = 0;
	public BankAccount() {
		this.checking = 0.0;
		this.savings = 0.0;		
		this.accountNumber = newAcctNum();
		memberCount++;
	}

	private String newAcctNum() {
		String newNum = "";
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			this.accountNumber += r.nextInt(9);
		}
		return newNum;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getChecking() {
		return checking;
	}

	private void changeChecking(double change) {
		this.checking += change;
		totalAssets += change;
	}

	public double getSavings() {
		return savings;
	}

	private void changeSavings(double change) {
		this.savings += change;
		totalAssets += change;
	}

	public static int getMemberCount() {
		return memberCount;
	}

	public static double getTotalAssets() {
		return totalAssets;
	}
	public void depositSavings(double deposit) {
		this.changeSavings(deposit);
	}
	public void depositChecking(double deposit) {
		this.changeChecking(deposit);
	}
	public void withdrawSavings(double withdrawal) {
		if (this.savings < withdrawal) {
			System.out.println("insufficient funds");
		} else {
		this.changeSavings(withdrawal*-1);
		}
	}
	public void withdrawChecking(double withdrawal) {
		if (this.checking < withdrawal) {
			System.out.println("insufficient funds");
		} else {
		this.changeChecking(withdrawal*-1);
		}
	}
	public double getTotalFunds() {
		return getSavings()+getChecking();
	}

}
