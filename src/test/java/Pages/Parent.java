package Pages;
import Utilities.PageDriver;
import org.apache.poi.sl.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.FileInputStream;
import java.time.Duration;




import java.io.FileInputStream;

public class Parent {

    WebDriverWait wait = new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(20));

    public void sendKeysFunc(WebElement element, String text) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void clickFunc(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void clickFunction(WebElement element) { // scroll gerekmeden clickleme işlemi
        waitUntilClickable(element);
        element.click();
    }

    public void verifyContainsTextFunction(WebElement element,String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(PageDriver.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }

    public void verifyElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue((element.isDisplayed()));
    }


    public void scrollToElement(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) PageDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);", element);

    }
    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }



    public String findFromExcel(String text) {

        String returnData = "";

        String path = "src/main/resources/Login_Excel.xlsx";

        Sheet sheet = null;

        try {
            FileInputStream inputStream = new FileInputStream(path);  // açtım
            Workbook workbook = WorkbookFactory.create(inputStream);  // workbook'u aldım
            sheet = workbook.getSheetAt(0);  // sheet'e ulaştım
        } catch (Exception e) {

        }


        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(text)) {
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    returnData += sheet.getRow(i).getCell(j);

                }
            }
        }

        return returnData;
    }

}


