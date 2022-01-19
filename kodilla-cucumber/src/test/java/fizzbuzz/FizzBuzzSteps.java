package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {

    private int number;
    private String answer;

    public FizzBuzzSteps() {
        Given("6 is received", () -> {
            this.number = 6;
        });

        Given("10 is received", () -> {
            this.number = 10;
        });

        Given("30 is received", () -> {
            this.number = 30;
        });

        Given("17 is received", () -> {
            this.number = 17;
        });

        When("Number is divided by 3 or by 5 or by 3 and 5 or by none of those numbers", () -> {
            FizzBuzzApplication fizzBuzzApplication = new FizzBuzzApplication();
            this.answer = fizzBuzzApplication.checkFizzBuzzConditions(this.number);
        });

        Then("Print {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

    }
}
