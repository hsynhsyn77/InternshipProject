package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;

import java.awt.*;

public class _03_GRup15Steps extends Parent {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();

    @And("Click on the Attestations in the left Nav")
    public void clickOnTheAttestationsInTheLeftNav() {
        ln.findAndClick("HumanResources");
        ln.findAndClick("getSetup3");
        ln.findAndClick("Attestations");
    }


    @And("Create on the Attestations name as {string}")
    public void createOnTheAttestationsNameAs(String name) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndClick("saveButton");
    }
    @And("Edit on the button {string} change {string}")
    public void editOnTheButtonChange(String name, String name2) {
        dc.findAndSend("searchInput", name);
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput", name2);
        dc.findAndClick("saveButton");
    }

    @And("User delete on the Attestations {string}")
    public void UserdeleteontheAttestations(String name2) throws AWTException {
        dc.findAndSend("searchInput", name2);
        dc.SearchAndDelete(name2);

    }



}