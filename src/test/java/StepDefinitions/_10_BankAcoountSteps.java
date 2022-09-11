package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _10_BankAcoountSteps extends Parent {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the BankAccount in the left Nav")
    public void clickOnTheBankAccountInTheLeftNav() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("BankAccounts");
    }

    @And("Create a BankAccount {string} , {string} , {string}")
    public void createABankAccount(String name, String Iban, String integrationCode) {
        dc.findAndClick("addButton2");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("IBAN", Iban);
        dc.findAndClick("currency");
        dc.findAndClick("currencyUsd");
        dc.findAndSend("integrationCode", integrationCode);
        dc.findAndClick("saveButton");
        dc.findAndContainsText("successMessage", "success");

    }

    @When("Edit the BankAccount {string} change {string}")
    public void editTheBankAccountChange(String name, String name2) {
        dc.findAndClick("editButton9");
        dc.findAndSend("nameInput", name2);
        dc.findAndClick("saveButton");
        dc.findAndContainsText("successMessage", "success");
        dc.findAndClick("deleteButton");

        dc.findAndClick("deleteDialogBtn2");

        dc.findAndContainsText("successMessage", "success");


    }
}
