package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {

//        Refer to cash_withdrawal.feature

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals(200, wallet.getBalance());
        });

        When("I request $30", () -> {
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals( 170,  wallet.getBalance());
        });

        Given("I have deposited $201 in my wallet", () -> {
            wallet.deposit(201);
            Assert.assertEquals(201, wallet.getBalance());
        });

        When("I request $201", () -> {
            cashier.withdraw(wallet, 201);
        });

        Then("$201 should be dispensed", () -> {
            Assert.assertEquals(201, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $0", () -> {
            Assert.assertEquals( 0,  wallet.getBalance());
        });

        Given("I have deposited $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals(100, wallet.getBalance());
        });

        When("I request $101", () -> {
            cashier.withdraw(wallet, 101);
        });

        Then("$101 withdrawal should be rejected", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        When("I request withdrawal less or equal to 0$: 0", () -> {
            cashier.withdraw(wallet,0);
        });

        Then("0$ withdrawal should be rejected", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        When("I request withdrawal less or equal to 0$: -50", () -> {
            cashier.withdraw(wallet,-50);
        });

        Then("-50$ withdrawal should be rejected", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

//        Refer to display_balance.feature

        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
        });

        When("I check the balance of my wallet", () -> {
        });

        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });

//        Refer to cash_deposit.feature

        Given("I have 0$ on my wallet", () -> {
            Assert.assertEquals(0, wallet.getBalance());
        });

        When("I deposit -50$ so transaction is less than 0$", () -> {
            wallet.deposit(-50);
        });

        Then("-50$ deposit should be rejected", () -> {
            Assert.assertEquals(0, wallet.getBalance());
        });
    }
}
