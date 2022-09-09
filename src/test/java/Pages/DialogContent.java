package Pages;

import Utilities.GWD;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    //1 nci giriş
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

// 2.giriş
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    //3.giriş
    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "(//button[@type='submit']//span)[1]")
    private WebElement deleteDialogButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton;

    //4 ncü giriş

    @FindBy(xpath = "(//ms-edit-button)[1]")
    private WebElement editButton;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "(//ms-edit-button[@class='ng-star-inserted'])[1]")
    private WebElement editbtn;




    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "username": myElement = username;break;
            case "password": myElement = password;break;
            case "nameInput": myElement = nameInput;break;
            case "searchInput": myElement = searchInput;break;
                   }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam

        switch (strElement) {
            case "loginButton": myElement = loginButton;break;
            case "addButton": myElement = addButton;break;
            case "saveButton":myElement = saveButton;break;
            case "searchButton":myElement = searchButton;break;
            case "deleteButton":myElement = deleteButton;break;
            case "deleteDialogButton":myElement = deleteDialogButton;break;
            case "acceptCookies":myElement = acceptCookies;break;
            case "editbtn":myElement = editbtn;break;

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam

        switch (strElement) {
            case "dashboard": myElement = dashboard;break;
            case "successMessage" : myElement =successMessage; break;

        }
        verifyContainsText(myElement, text);
    }


    public void SearchAndDelete(String searchText) throws AWTException {

        findAndSend("searchInput", searchText);
        findAndClick("searchButton");

        // WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        // wait.until(ExpectedConditions.stalenessOf(deleteButton));


        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));

        // waitUntilLoading();//son çözüm parent in içinde
        // GWD.Bekle(10);//

        findAndClick("deleteButton");
        GWD.Bekle(3);
        findAndClick("deleteDialogButton");

    }


}