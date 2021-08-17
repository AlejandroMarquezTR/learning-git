package com.alejandromo.seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LearningSelenium {
    public static void main(String[] args) {

        //Creating a new web driver for Chrome Browser
        WebDriver driver = new ChromeDriver();
        /*
         * We can define a headless property with
         * chromeOptions.addArguments("--headless")
         */
        //Defined expected results for Demo site
        String url = "https://demo.opencart.com/";
        String expectedTitle = "Your Store";

        //Maximize browser screen
        driver.manage().window().maximize();
        //Open URL on browser
        driver.get(url);

        //getTitle() returns website title on tags <title>
        if (expectedTitle.contentEquals(driver.getTitle())){
            System.out.println(driver.getTitle());
            System.out.println("Correct site 👍");

            //Using findElement() by id
            WebElement webElement = driver.findElement(By.id("logo"));
            String logoTitle = webElement.getText();
            System.out.println("Title with id = 'logo': " + logoTitle);

            //Using findElements() by classname
            List<WebElement> webElementList = driver.findElements(By.className("dropdown"));
            System.out.println("\nElements with classname = 'dropdown': ");
            for (WebElement element :
                    webElementList) {
                System.out.println(element.getText());
            }

            //Using findElements() by xpath
            webElement = driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/ul/li[1]/a"));
            System.out.println("\nElement finded by xpath: " + webElement.getText());

        } else {
            System.out.println("Wrong site 👎");
        }
        //Close browser
        driver.close();
        //Ending test
        driver.quit();
    }
}