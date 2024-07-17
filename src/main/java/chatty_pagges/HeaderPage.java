package chatty_pagges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeaderPage extends BasePage {
    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//[@class='header-box']")
    private WebElement headerBox;

    @FindBy(xpath = "//[@class='headeruser headermenu']")
    private WebElement headerUser;

    @FindBy(className = "header__user")
    private WebElement dropdownMenu;

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement logoutLink;

    @FindBy(xpath = "//[@href='/userprofile']")
    private WebElement yourProfileLink;

    @FindBy(xpath = "//[@href='/draft']")
    private WebElement myDraftsLink;

    public HeaderPage openHeaderPage() {
        return this;
    }

//    public HeaderPage open(){
//        driver.get("http://chatty.telran-edu.de:8089/homeblog");
//        return this;
//    }

    public void clickOnLogoutDropdown() {
        logoutLink.click();
        new LoginPage(driver);
    }

    //    public DraftPage clickOnMyDraftsDropdown() {
//        myDraftsLink.click();
//        return new DraftPage(driver);
//    }
//
    public void clickProfileLink() {
        yourProfileLink.click();
    }

    public HeaderPage hoverDropDown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dropdownMenu));
        Actions action = new Actions(driver);
        action.moveToElement(dropdownMenu).perform();
        return this;
    }

    public boolean isHeaderBoxIsDisplayed() {
        return headerBox.isDisplayed();
    }

    //    public boolean isHeaderNavigationPanelIsDisplayed() {
//        return navigationPanel.isDisplayed();
//    }
    public boolean isHeaderUserIsDisplayed() {
        return headerUser.isDisplayed();
    }


}
