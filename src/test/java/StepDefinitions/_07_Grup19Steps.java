package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.awt.*;

public class _07_Grup19Steps extends Parent {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();



    @And("Create a Subject {string} , {string}")
    public void createASubject(String name, String code2)  {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("code1", code2);
        dc.findAndClick("saveButton");

    }

    @And("Click on the Subject in the left Nav")
    public void clickOnTheSubjectInTheLeftNav()  {
        ln.findAndClick("Education");
        ln.findAndClick("getSetup4");
        ln.findAndClick("SubjectCategories");

    }

    @When("Edit the Subject {string} change {string}")
    public void editTheSubjectChange(String name, String name2)  {
        dc.findAndSend("searchInput", name);
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput", name2);
        dc.findAndClick("saveButton");
    }
}
