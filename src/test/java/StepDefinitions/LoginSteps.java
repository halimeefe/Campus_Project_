package StepDefinitions;

import Pages.Elements;
import Utilities.PageDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {

    Elements e=new Elements();

    @Given("Navigate to campus")
    public void navigateToCampus() {
        PageDriver.getDriver().get("https://test.mersys.io/");
        PageDriver.getDriver().manage().window().maximize();

    }

    @And("Enter username and password and Login click")
    public void enterUsernameAndPasswordAndLoginClick() {

        e.sendKeysFunc(e.userName, e.findFromExcel("UserName"));
        e.sendKeysFunc(e.password, e.findFromExcel("Password"));
        e.clickFunction(e.loginButton);


    }

    @Then("Verify succesfully loged")
    public void verifySuccesfullyLoged() {
        e.verifyContainsTextFunction(e.txtTechnoStudy,"Techno Study");

    }
}




