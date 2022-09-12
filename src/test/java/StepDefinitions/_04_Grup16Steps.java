package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _04_Grup16Steps extends Parent {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();


    @And("Click on the Document in the left Nav")
    public void clickOnTheDocumentInTheLeftNav() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("DocumentTypes");
    }

    @And("Create a Document {string}")
    public void createADocument(String name) {
        dc.findAndClick("addButton"); //en son eklenen
        dc.findAndSend("nameInput",name);

    }

    @And("Select Stage")
    public void selectStage() throws AWTException {
        dc.findAndClick("stage");
        dc.findAndClick("stageSlct");

        // bu araya robot eklenmesi gerekli
        // mac de ki komutları bulamadım

        dc.findAndClick("saveButton");


    }
}