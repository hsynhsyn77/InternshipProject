package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement getSetup3;

    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement PositionCategories;






    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "(//span[text()='Document Types'])[1]")
    private WebElement DocumentTypes;


    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement Attestations;

    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement Fields;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement Positions;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement Education;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement getSetup4;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement SubjectCategories;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement SchoolSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement Locations;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement Departments;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement BankAccounts;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement GradeLevels;

    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement Discounts;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement Nationalities;


    WebElement myElement;

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "HumanResources": myElement = HumanResources;break;
            case "getSetup3": myElement = getSetup3;break;
            case "PositionCategories": myElement = PositionCategories;break;

            case "setupOne": myElement = setupOne;break;
            case "parameters": myElement = parameters;break;
            case "DocumentTypes": myElement = DocumentTypes;break;
            case "Attestations": myElement = Attestations;break;
            case "Fields": myElement = Fields;break;
            case "Positions": myElement = Positions;break;
            case "Education": myElement = Education;break;
            case "getSetup4": myElement = getSetup4;break;
            case "SubjectCategories": myElement = SubjectCategories;break;
            case "SchoolSetup": myElement = SchoolSetup;break;
            case "Locations": myElement = Locations;break;
            case "Departments": myElement = Departments;break;
            case "BankAccounts": myElement = BankAccounts;break;
            case "GradeLevels": myElement = GradeLevels;break;
            case "Discounts": myElement = Discounts;break;
            case "Nationalities": myElement = Nationalities;break;





        }
        clickFunction(myElement);
    }

}