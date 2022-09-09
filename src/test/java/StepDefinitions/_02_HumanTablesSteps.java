package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.awt.*;

public class _02_HumanTablesSteps extends Parent {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav() {
        ln.findAndClick("HumanResources");
        ln.findAndClick("getSetup3");
        ln.findAndClick("PositionCategories");
    }


    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent() {

    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage ", "success ");

    }

    @And("Create on the name as {string}")
    public void createOnTheNameAs(String name) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndClick("saveButton");
    }

    @And("User delete {string}")
    public void userDeleteThe(String arananKelime) throws AWTException {
        dc.SearchAndDelete(arananKelime);
    }
}