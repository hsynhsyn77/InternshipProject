package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _13_Grup25Steps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the Nationalities in the left Nav")
    public void clickOnTheGradeLevelsInTheLeftNav() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("Nationalities");
    }


    @And("Create a Nationalities {string}")
    public void createANationalities(String name) {
        dc.findAndClick("addButton1");
        dc.findAndSend("nameInput", name);
        dc.findAndClick("saveButton");
        dc.findAndContainsText("successMessage", "success");
    }
    @When("Edit the Nationalities {string} change {string}")
    public void editTheDepartmentsChange(String name, String name2) {
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput", name2);
        dc.findAndClick("saveButton");
        dc.findAndContainsText("successMessage", "success");

    }

}

