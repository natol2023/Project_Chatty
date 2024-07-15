package chatty_pagges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    @FindBy(xpath= "//input[@data-test='email']")
    private WebElement emailInput;
    @FindBy(xpath = "//input[@data-test='password']")
    private WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;
    @FindBy(xpath = "//p[@class='link']//a")
    private WebElement signUpLink;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver);
    }

    public LoginPage open(){
        driver.get("http://chatty.telran-edu.de:8089/login");
        return this;
    }
    public void inputEmail() {
        emailInput.sendKeys("batrakalena86@gmail.com");
    }
    public void inputPassword(){
        passwordInput.sendKeys("qwerty12345");
    }
    public void clickLogin(){
        loginButton.click();
    }
}
