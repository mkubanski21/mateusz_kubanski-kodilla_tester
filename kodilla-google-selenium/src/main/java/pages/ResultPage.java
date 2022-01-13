package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends AbstractPage {

    @FindBy(xpath = "/html/head/title")
    private WebElement title;

    public ResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public void displayTitle() {
        System.out.println(title.getText());
    }
}

