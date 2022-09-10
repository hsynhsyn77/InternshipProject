package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.awt.*;

public class _05_Grup17Steps extends Parent {

    LeftNav ln = new LeftNav();
    DialogContent dc=new DialogContent();
    FormContent fc = new FormContent();




    @And("Create a field {string} , {string}")
    public void createAfield(String name, String code) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("code1", code);
        dc.findAndClick("fieldtype");
        dc.findAndClick("fieldbtn");
        dc.findAndClick("saveButton");

    }


    @And("Click on the Fields in the left Nav")
    public void clickOnTheFieldsInTheLeftNav() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("Fields");

    }


    @When("Edit the fields {string} change {string}")
    public void editTheFieldsChange(String name, String name2) {
        dc.findAndSend("searchInput", name);
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput", name2);
        dc.findAndClick("saveButton");

    }
}