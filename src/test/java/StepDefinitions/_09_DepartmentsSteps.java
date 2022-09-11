package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _09_DepartmentsSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();

    @And("Click on the Departments in the left Nav")
    public void clickOnTheDepartmentsInTheLeftNav() {
        ln.findAndClick("setupOne");
        ln.findAndClick("SchoolSetup");
        ln.findAndClick("Departments");
    }

    @And("Create a Departments {string} , {string}")
    public void createADepartments(String name, String code3) {
        dc.findAndClick("school");
        dc.findAndClick("school2");
        dc.findAndClick("searchButton");
        dc.findAndClick("addButton2");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("code3", code3);
        dc.findAndClick("saveButton");
        dc.findAndContainsText("successMessage", "success");
    }
    @When("Edit the Departments {string} change {string}")
    public void editTheDepartmentsChange(String name, String name2) {
        dc.findAndClick("editButton9");
        dc.findAndSend("nameInput", name2);
        dc.findAndClick("saveButton");
        dc.findAndContainsText("successMessage", "success");
        dc.findAndClick("deleteButton");
        GWD.Bekle(2);
        dc.findAndClick("deleteDialogBtn2");
        GWD.Bekle(2);
        dc.findAndContainsText("successMessage", "success");
        GWD.Bekle(2);

    }
}
