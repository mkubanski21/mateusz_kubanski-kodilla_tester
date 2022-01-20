package wallet;

public class Cashier {

    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount && amount >0) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        } else {
            System.out.println("Withdrawal rejected, not enough money on the account");
        }
    }
}
