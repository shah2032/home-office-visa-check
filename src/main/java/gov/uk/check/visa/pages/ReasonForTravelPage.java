package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']/div")
    List<WebElement>  reasonForVisitList;

    //input[@id='response-1']

    @CacheLookup
    @FindBy(xpath = " //button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectReasonForVisit(String reason){

        try {
            List<WebElement> list = reasonForVisitList;
            for (WebElement listOfElement : list) {
                if (listOfElement.getText().equals(reason)) {
                    listOfElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> list = reasonForVisitList;
            CustomListeners.test.log(Status.PASS, "select tourism");
            Reporter.log("select tourism" + reasonForVisitList.toString());

        }
    }
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
        CustomListeners.test.log(Status.PASS, "click on continue");
        Reporter.log("click on continue" + nextStepButton.toString());
    }
}
