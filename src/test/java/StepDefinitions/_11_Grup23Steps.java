package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;

public class _11_Grup23Steps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the GradeLevels in the left Nav")
    public void clickOnTheGradeLevelsInTheLeftNav() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("GradeLevels");
    }

    @And("Create a GradeLevels {string} , {string} , {string}")
    public void createAGradeLevels(String name, String shortName, String order) {
        dc.findAndClick("addButton1");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("shortName", shortName);
        dc.findAndClick("order");
        dc.findAndClick("NextGrade");
        dc.findAndClick("NextGradesec");
        dc.findAndClick("saveButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
        dc.findAndContainsText("successMessage", "success");
    }

}
