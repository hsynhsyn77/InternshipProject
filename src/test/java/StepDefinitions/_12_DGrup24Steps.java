package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;

public class _12_DGrup24Steps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the Discounts in the left Nav")
    public void clickOnTheGradeLevelsInTheLeftNav() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("Discounts");
    }


    @And("Create a Discounts {string} , {string} , {string}")
    public void createADiscounts(String description, String code, String priority) {
        dc.findAndClick("addButton1");
        dc.findAndSend("description", description);
        dc.findAndSend("code1", code);
        dc.findAndSend("order1",priority);
        dc.findAndClick("saveButton");
        dc.findAndSend("description1", description);
        dc.findAndClick("searchButton");

        dc.findAndContainsText("successMessage", "success");
    }
}

