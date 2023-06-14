package StepDefinitions;

import Pages.Elements;
import Utilities.PageDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class DocumentUploadSteps {
    WebDriverWait wait = new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(20));
    Elements e = new Elements();

    @Given("Navigate to Calendar page")
    public void navigate_to_calendar_page() {
        e.clickFunction(e.calendar);

    }

    @When("click on Add lesson")
    public void clickOnAddLesson() {
        e.clickFunction(e.tarih);
    }

    @When("I click on Add Attachments")
    public void I_click_on_add_attachments() {
        e.clickFunction(e.attachments);

    }

    @When("I click on Add Attachfile")
    public void I_click_on_add_attachfile() {
        e.clickFunction(e.attachFile);

    }

    @When("I have to upload documents")
    public void I_have_to_upload_documents() throws AWTException, InterruptedException {
//

        e.clickFunction(e.type);
        e.clickFunction(e.homework);

        e.clickFunction(e.item);
        e.clickFunction(e.formLocal);

       // Thread.sleep(3);
        Robot rbt = new Robot();

        StringSelection dosyaYolu = new StringSelection("C:\\Users\\YASİN TUFAN\\Desktop\\interview\\Mulakat_Sorular.pdf"); //C:\Users\TechnoStudy\Desktop\ornek.txt
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);


        rbt.keyPress(KeyEvent.VK_CONTROL); // bu iki tuş şu anda basılmış vaziyette, hafızadaki yapıştırıldı
        rbt.keyPress(KeyEvent.VK_V);


        rbt.keyRelease(KeyEvent.VK_CONTROL); // tuşlar serbest bırakıldı
        rbt.keyRelease(KeyEvent.VK_V);

        rbt.keyPress(KeyEvent.VK_ENTER); // dosya Entera basılarak gönderildi
        rbt.keyRelease(KeyEvent.VK_ENTER);

        // MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı.  down
        rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı

        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı.  down
        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı


    }

    @Then("Verify successfully upload")
    public void verify_successfully_upload() {
        e.verifyElement(e.succes);

    }


}
