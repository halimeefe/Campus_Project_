package StepDefinitions;

import Pages.Elements;
import Utilities.PageDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US023G_GradeBookSteps {

    Elements e = new Elements();

    @And("I Click on Geography Details button")
    public void ıClickOnGeographyDetailsButton() {
        e.clickFunction(e.geographyDetails);

    }

    @And("I Click on Grade Book button")
    public void ıClickOnGradeBookButton() {
        e.clickFunction(e.gradebook);

    }

    @When("I Enter the notes for a specific student")
    public void ıEnterTheNotesForASpecificStudent() {

        Actions actions = new Actions(PageDriver.getDriver());

        List<WebElement> elements = Arrays.asList(
                e.not1, e.not2, e.not3, e.not4, e.not5, e.not6, e.not7, e.not8, e.not9, e.not10,
                e.not11, e.not12, e.not13, e.not14, e.not15, e.not16, e.not17, e.not18, e.not19, e.not20,
                e.not21, e.not22, e.not23, e.not24, e.not25, e.not26, e.not27, e.not28, e.not29, e.not30,
                e.not31, e.not32, e.not33, e.not34, e.not35, e.not36, e.not37, e.not38, e.not39, e.not40   //kutucukları liste aldım
        );

        List<String> notes = Arrays.asList(
                "029", "00035", "00045", "00045", "00069", "00079", "00075", "00039", "0099", "00049",
                "00025", "00099", "00070", "00035", "00095", "00080", "000100", "00049", "00077", "00067",
                "00044", "00099", "000100", "00089", "00085", "00067", "00020", "00096", "00058", "00043",
                "00020", "00045", "00079", "00085", "00099", "00020", "00025", "00053", "00058", "00070"   // notları liste aldım
        );


        for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i);
            String note = notes.get(i);           // döngüyle her kutucuğa gelen notu gönderdim

            WebDriverWait wait = new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));


            actions.moveToElement(element).moveByOffset(10, 0).click().perform();// action kutucukların ortasına tıkladığı için bir pencere açılmasına sebep oluyor, 10 birim sağa kaydırdım
            actions.sendKeys(note) .perform();

        }

        e.clickFunction(e.saveButon);
        e.clickFunction(e.yes);
    }
    @Then("The notes should be successfully saved")
    public void theNotesShouldBeSuccessfullySaved() {
        e.verifyContainsTextFunction(e.success,"successfully");

    }


}
