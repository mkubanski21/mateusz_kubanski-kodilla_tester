package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> results;


    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public void openRandomResultPage() throws InterruptedException {
        Random random = new Random();
        int randomNumber = random.nextInt(results.size());
        Thread.sleep(5000);
        results.get(randomNumber).click();
        Thread.sleep(5000);
        ResultPage resultPage = new ResultPage(driver);
        resultPage.displayTitle();
    }
}
