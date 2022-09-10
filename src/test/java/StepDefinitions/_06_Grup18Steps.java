package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.awt.*;

public class _06_Grup18Steps extends Parent {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();

    public _06_Grup18Steps() throws AWTException {
    }

    @And("Click on the Human Positions in the left Nav")
    public void clickOnTheHumanPositionsInTheLeftNav() throws AWTException {
        ln.findAndClick("HumanResources");
        ln.findAndClick("getSetup3");
        ln.findAndClick("Positions");

    }

    @And("Create a Positions {string} , {string}")
    public void createAPositions(String name, String shortName) throws AWTException {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("code1", shortName);
        dc.findAndClick("saveButton");


    }

    @When("Edit the Positions {string} change {string}")
    public void editThePositionsChange(String name, String name2) throws AWTException {
        dc.findAndSend("searchInput", name);
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput", name2);
        dc.findAndClick("saveButton");
    }
}
