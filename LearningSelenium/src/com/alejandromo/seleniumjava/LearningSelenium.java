package com.alejandromo.seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "http://demo.automationtesting.in/Register.html";

        driver.get(url);
    }
}