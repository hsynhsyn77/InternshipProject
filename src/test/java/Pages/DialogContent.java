package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "(//ms-edit-button)[1]")
    private WebElement editButton;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;














    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityInput;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;



    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;

    @FindBy(xpath = "//*[@formcontrolname='employeeId']")
    private WebElement employeeId;

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement firstName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastName;

    @FindBy(xpath = "(//mat-select[@formcontrolname='gender'])[1]")
    private WebElement Gender1;

    @FindBy(xpath= "(//mat-option[@role='option'])[2]")
    private WebElement Gender;

    @FindBy(xpath = "(//mat-select[@formcontrolname='types'])[1]")
    private WebElement types;

    @FindBy(xpath= "(//mat-option[@role='option'])[2]")
    private WebElement types1;

    @FindBy(xpath = "//input[@formcontrolname='employeeId']")
    private WebElement Idemployee;

    @FindBy(xpath = "(//mat-select[@formcontrolname='qualification'])[1]")
    private WebElement qualification;

    @FindBy(xpath= "(//mat-option[@role='option'])[2]")
    private WebElement qualification1;

    @FindBy(linkText = "General Info")
    private WebElement generalInfo;

    @FindBy(xpath = "(//mat-select[@formcontrolname='type'])[1]")
    private WebElement ducumantType;

    @FindBy(xpath= "(//mat-option[@role='option'])[2]")
    private WebElement ducumantType1;

    @FindBy(xpath = "//input[@formcontrolname='documentNumber']")
    private WebElement documentNumber;

    @FindBy(xpath = "//input[@formcontrolname='personalId']")
    private WebElement personalId;

    @FindBy(xpath = "//*[@class='mat-chip-input mat-input-element mat-autocomplete-trigger']")
    private WebElement schollDep;







    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "username": myElement = username;break;
            case "password": myElement = password;break;
            case "nameInput": myElement = nameInput;break;
            case "codeInput": myElement = codeInput;break;
            case "shortName": myElement = shortName;break;
            case "searchInput": myElement = searchInput;break;
            case "priorityInput": myElement = priorityInput;break;
            case "employeeId": myElement = employeeId;break;
            case "academicPeriod": myElement = academicPeriod;break;
            case "firstName": myElement = firstName;break;
            case "lastName": myElement = lastName;break;
            case "Idemployee": myElement = Idemployee;break;
            case "documentNumber": myElement = documentNumber;break;
            case "personalId": myElement = personalId;break;
            case "schollDep": myElement = schollDep;break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam

        switch (strElement) {
            case "loginButton": myElement = loginButton;break;
            case "addButton": myElement = addButton;break;
            case "closeDialog": myElement = closeDialog;break;
            case "acceptCookies": myElement = acceptCookies;break;
            case "searchButton":myElement = searchButton;break;
            case "deleteButton":myElement = deleteButton;break;
            case "deleteDialogButton":myElement = deleteDialogButton;break;
            case "Gender": myElement = Gender;break;
            case "Gender1": myElement = Gender1;break;
            case "types": myElement = types;break;
            case "types1": myElement = types1;break;
            case "qualification": myElement = qualification;break;
            case "qualification1": myElement = qualification1;break;
            case "generalInfo": myElement = generalInfo;break;
            case "ducumantType": myElement = ducumantType;break;
            case "ducumantType1": myElement = ducumantType1;break;
            case "saveButton":myElement = saveButton;break;


        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam

        switch (strElement) {
            case "dashboard": myElement = dashboard;break;
            case "successMessage": myElement = successMessage;break;
            case "alreadyExist": myElement = alreadyExist;break;
        }
        verifyContainsText(myElement, text);
    }


    public void SearchAndDelete(String searchText) throws AWTException {
        findAndSend("searchInput", searchText);
        findAndClick("searchButton");

        // WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        // wait.until(ExpectedConditions.stalenessOf(deleteButton));


        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//ms-delete-button//button"), 0));

        waitUntilLoading();//son çözüm parent in içinde
        // GWD.Bekle(10);//

        findAndClick("deleteButton");
        findAndClick("deleteDialogButton");




    }


}