package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals(200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
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
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 201);
        });

        Then("$201 should be dispensed", () -> {
            Assert.assertEquals(201, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $0", () -> {
            Assert.assertEquals( 0,  wallet.getBalance());
        });

//        Then("the balance of my wallet should be ${integer}", (Integer integer) -> {
//            Assert.assertEquals( integer,  wallet.getBalance());
//        });


/////////////////////////////////////////
        Given("I have deposited $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals(100, wallet.getBalance());
        });

        When("I request $101", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 101);
        });

        Then("$101 withdrawal should be rejected", () -> {
            Assert.assertEquals(100, wallet.getBalance());

//            Assert.assertTrue("Withdrawal rejected, deposit lower than withdrawal",wallet.getBalance() < cashSlot.getContents());
        });


    }
}
