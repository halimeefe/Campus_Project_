package Pages;

import Utilities.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent {

    public Elements() {
        PageFactory.initElements(PageDriver.getDriver(), this);

    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement userName;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='logo-text ng-star-inserted']")
    public WebElement txtTechnoStudy;

    @FindBy(css = "div[class='details-button']:nth-child(1)")
    public WebElement geographyDetails;

    @FindBy(xpath = "//*[text()='Gradebook']")
    public WebElement gradebook;

    @FindBy(xpath = "(//div[@comp-id='100']//div)[4]/following-sibling::div")
    public WebElement not1;

    @FindBy(xpath = "(//div[@comp-id='109']//div)[4]/following-sibling::div")
    public WebElement not2;

    @FindBy(xpath = "(//div[@comp-id='118']//div)[4]/following-sibling::div")
    public WebElement not3;

    @FindBy(xpath = "(//div[@comp-id='127']//div)[4]/following-sibling::div")
    public WebElement not4;

    @FindBy(xpath = "(//div[@comp-id='136']//div)[4]/following-sibling::div")
    public WebElement not5;

    @FindBy(xpath = "(//div[@comp-id='145']//div)[4]/following-sibling::div")
    public WebElement not6;

    @FindBy(xpath = "(//div[@comp-id='154']//div)[4]/following-sibling::div")
    public WebElement not7;

    @FindBy(xpath = "(//div[@comp-id='163']//div)[4]/following-sibling::div")
    public WebElement not8;

    @FindBy(xpath = "(//div[@comp-id='172']//div)[4]/following-sibling::div")
    public WebElement not9;

    @FindBy(xpath = "(//div[@comp-id='181']//div)[4]/following-sibling::div")
    public WebElement not10;

    @FindBy(xpath = "(//div[@comp-id='103']//div)[4]")
    public WebElement not11;

    @FindBy(xpath = "(//div[@comp-id='112']//div)[4]")
    public WebElement not12;


    @FindBy(xpath = "(//div[@comp-id='121']//div)[4]")
    public WebElement not13;


    @FindBy(xpath = "(//div[@comp-id='130']//div)[4]")
    public WebElement not14;

    @FindBy(xpath = "(//div[@comp-id='139']//div)[4]")
    public WebElement not15;


    @FindBy(xpath = "(//div[@comp-id='148']//div)[4]")
    public WebElement not16;


    @FindBy(xpath = "(//div[@comp-id='157']//div)[4]")
    public WebElement not17;

    @FindBy(xpath = "(//div[@comp-id='166']//div)[4]")
    public WebElement not18;

    @FindBy(xpath = "(//div[@comp-id='175']//div)[4]")
    public WebElement not19;

    @FindBy(xpath = "(//div[@comp-id='184']//div)[4]")
    public WebElement not20;

    @FindBy(xpath = "(//div[@comp-id='105']//div)[4]")
    public WebElement not21;

    @FindBy(xpath = "(//div[@comp-id='114']//div)[4]")
    public WebElement not22;

    @FindBy(xpath = "(//div[@comp-id='123']//div)[4]")
    public WebElement not23;

    @FindBy(xpath = "(//div[@comp-id='132']//div)[4]")
    public WebElement not24;

    @FindBy(xpath = "(//div[@comp-id='141']//div)[4]")
    public WebElement not25;

    @FindBy(xpath = "(//div[@comp-id='150']//div)[4]")
    public WebElement not26;

    @FindBy(xpath = "(//div[@comp-id='159']//div)[4]")
    public WebElement not27;

    @FindBy(xpath = "(//div[@comp-id='168']//div)[4]")
    public WebElement not28;

    @FindBy(xpath = "(//div[@comp-id='177']//div)[4]")
    public WebElement not29;

    @FindBy(xpath = "(//div[@comp-id='186']//div)[4]")
    public WebElement not30;

    @FindBy(xpath = "(//div[@comp-id='107']//div)[4]")
    public WebElement not31;

    @FindBy(xpath = "(//div[@comp-id='116']//div)[4]")
    public WebElement not32;

    @FindBy(xpath = "(//div[@comp-id='125']//div)[4]")
    public WebElement not33;

    @FindBy(xpath = "(//div[@comp-id='134']//div)[4]")
    public WebElement not34;

    @FindBy(xpath = "(//div[@comp-id='143']//div)[4]")
    public WebElement not35;

    @FindBy(xpath = "(//div[@comp-id='152']//div)[4]")
    public WebElement not36;

    @FindBy(xpath = "(//div[@comp-id='161']//div)[4]")
    public WebElement not37;

    @FindBy(xpath = "(//div[@comp-id='170']//div)[4]")
    public WebElement not38;

    @FindBy(xpath = "(//div[@comp-id='179']//div)[4]")
    public WebElement not39;

    @FindBy(xpath = "(//div[@comp-id='188']//div)[4]")
    public WebElement not40;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButon;

    @FindBy(xpath = "//*[text()=' Yes ']")
    public WebElement yes;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement success;
}



    @FindBy(xpath = "(//span[@matbadgesize='small'])[2]")
    public WebElement calendar;

    @FindBy(xpath = "(//*[text()='11D-TARIH '])[1]")
    public WebElement tarih;

    @FindBy(xpath = "(//*[text()='Attachments'])[1]")
    public WebElement attachments;

    @FindBy(xpath = "(//*[@data-icon='plus'])[2]")
    public WebElement attachFile;

    @FindBy(xpath = "(//mat-select[@role='combobox']//div/div)[4]")
    public WebElement type;

    @FindBy(xpath = "//*[text()='Please select an item']")
    public WebElement item;

    @FindBy(xpath = "//*[text()=' Homework ']")
    public WebElement homework;


    @FindBy(xpath = "//*[text()='From Local']")
    public WebElement formLocal;


    @FindBy(css = "span[class='mat-tooltip-trigger']")
    public WebElement succes;







