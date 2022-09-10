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
    public DialogContent()  {
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
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-plus']")
    private WebElement addButton;

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon'])[4]")
    private WebElement addButton1;

    @FindBy(xpath = "//ms-add-button[@table='true']")
    private WebElement addButton2;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "(//span[contains(text(),'Stage')])[3]")
    private WebElement stage;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement saveButton;

    //3.giriş
    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "(//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted'])[5]")
    private WebElement stageSlct;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    private WebElement code1;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    private WebElement code2;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']")
    private WebElement shortName;

    @FindBy(xpath = " (//mat-select[@role='combobox'])[3]")
    private WebElement locationtype;

    @FindBy(xpath = " (//span[@class='mat-option-text'])[1]")
    private WebElement locationtypesec;

    @FindBy(xpath = " //ms-integer-field[@formcontrolname='capacity']")
    private WebElement capacity;

    @FindBy(xpath = "//mat-select[@formcontrolname='type']")
    private WebElement fieldtype;

    @FindBy(xpath = "//span[contains(text(),'Number')]")
    private WebElement fieldbtn;

    @FindBy(xpath = "(//ms-edit-button)[1]")
    private WebElement editButton;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;




    WebElement myElement;

    public void findAndSend(String strElement, String value)  {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "username": myElement = username;break;
            case "password": myElement = password;break;
            case "nameInput": myElement = nameInput;break;
            case "searchInput": myElement = searchInput;break;
            case "code1": myElement = code1;break;
            case "shortName": myElement = shortName;break;
            case "capacity": myElement = capacity;break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement)  {  // 2.aşama
        // burda string isimden weblemente ulaşıcam

        switch (strElement) {
            case "loginButton": myElement = loginButton;break;
            case "addButton": myElement = addButton;break;
            case "addButton1": myElement = addButton1;break;
            case "addButton2": myElement = addButton2;break;
            case "saveButton": myElement = saveButton;break;
            case "searchButton": myElement = searchButton;break;
            case "deleteButton": myElement = deleteButton;break;
            case "deleteDialogBtn": myElement = deleteDialogBtn;break;
            case "acceptCookies": myElement = acceptCookies;break;
            case "editButton": myElement = editButton;break;
            case "stage": myElement = stage;break;
            case "stageSlct": myElement = stageSlct;break;
            case "fieldtype": myElement = fieldtype;break;
            case "fieldbtn": myElement = fieldbtn;break;
            case "locationtypesec": myElement = locationtypesec;break;

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text)  {  // 2.aşama
        // burda string isimden weblemente ulaşıcam

        switch (strElement) {
            case "dashboard": myElement = dashboard;break;
            case "successMessage": myElement = successMessage;break;

        }
        verifyContainsText(myElement, text);
    }


    public void SearchAndDelete(String searchText) {

        findAndSend("searchInput", searchText);
        findAndClick("searchButton");

        // WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        // wait.until(ExpectedConditions.stalenessOf(deleteButton));

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"), "Search"));


        // waitUntilLoading();//son çözüm parent in içinde
        //GWD.Bekle(5);//

        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
        GWD.Bekle(5);




    }

}