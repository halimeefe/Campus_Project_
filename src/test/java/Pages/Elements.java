package Pages;

import Utilities.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent{

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


    @FindBy(xpath = "(//div[@comp-id='100']/div)[1]")
    public WebElement noteInput;


    @FindBy(xpath = "//div[@comp-id='103']")
    public WebElement noteInput1;


    @FindBy(css = "[comp-id='105']")
    public WebElement noteInput2;


    @FindBy(css = "[comp-id='107']")
    public WebElement noteInput3;



    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButon;

    @FindBy(xpath = "//*[text()=' Yes ']")
    public WebElement yes;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement success;



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






}

