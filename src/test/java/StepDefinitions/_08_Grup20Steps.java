package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _08_Grup20Steps extends Parent {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();

    @And("Click on the School in the left Nav")
    public void clickOnTheSchoolInTheLeftNav() {
        ln.findAndClick("setupOne");
        ln.findAndClick("SchoolSetup");
        ln.findAndClick("Locations");
    }

    @And("Create a School {string} , {string} , {string}")
    public void createASchool(String name, String shortName, String capacity) {
        dc.findAndClick("schoolMenu");
        dc.findAndClick("schoolSelect");
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("shortName", shortName);
        dc.findAndClick("locationtype");
        dc.findAndClick("locationtypesec");
        dc.findAndSend("capacity",capacity);
        dc.findAndClick("saveButton");
        dc.findAndContainsText("successMessage","success");


    }

    @When("Edit the School {string} change {string}")
    public void editTheSchoolChange(String name, String name2) {
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput", name2);
        dc.findAndClick("saveButton");
        dc.findAndContainsText("successMessage","success");

    }

    @Then("User Just Delete {string}")
    public void userJustDelete(String searchText) {
        dc.justDelete(searchText);
    }
}
