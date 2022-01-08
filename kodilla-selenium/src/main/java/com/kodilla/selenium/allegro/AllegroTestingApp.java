package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        driver.findElement(By.xpath("//div[@class=\"_9f0v0 _jkrtd mj7a_0 mh36_16 mvrt_16 mg9e_16 mpof_ki " +
                "m389_6m munh_56 m3h2_56 myre_zn myre_8v_s m7f5_5x_s mjru_vb _90605_OPWNL\"]/button[1]")).click();

        WebElement categories = driver.findElement(By.xpath("//select[@aria-label=\"Kategoria i opcje wyszukiwania\"]"));
        Select categorySelect = new Select(categories);
        categorySelect.selectByVisibleText("Elektronika");

        WebElement inputField = driver.findElement(By.xpath("//input[@placeholder=\"czego szukasz?\"]"));
        inputField.sendKeys("mavic mini");

        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

    }
}
