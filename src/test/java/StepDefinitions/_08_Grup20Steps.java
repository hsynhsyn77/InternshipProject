package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
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

    @And("Create a School {string} , {string}, {string}")
    public void createASchool(String arg0, String name, String shortName) {
        dc.findAndClick("addButton2");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("shortName", shortName);
        dc.findAndClick("locationtype");
        dc.findAndClick("locationtypesec");
        dc.findAndClick("saveButton");
    }

    @When("Edit the School {string} change {string}")
    public void editTheSchoolChange(String arg0, String arg1) {
    }
}
