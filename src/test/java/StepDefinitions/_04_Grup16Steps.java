package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

import static Utilities.GWD.driver;

public class _04_Grup16Steps extends Parent {
    Actions aksiyonlar=new Actions(GWD.getDriver());

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
        dc.findAndClick("addButton1"); //en son eklenen
        dc.findAndSend("nameInput",name);

    }

    @And("Select Stage")
    public void selectStage() throws AWTException {
      dc.findAndClick("stage");
      dc.findAndClick("stageSlct");


        aksiyonlar.sendKeys(Keys.TAB).perform();







        dc.findAndClick("saveButton");


    }
}