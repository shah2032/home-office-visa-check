package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class WorkTypePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")
    List<WebElement>  selectWorkTypeList;

    public void selectJobType(String job){
        List<WebElement> workTypeList = selectWorkTypeList;
        for (WebElement reason1 : workTypeList) {
            if (reason1.getText().equalsIgnoreCase(job)) {
                reason1.click();
            }
        }
        Reporter.log("Select work type" + selectWorkTypeList.toString());
        CustomListeners.test.log(Status.PASS, "Select work type");
    }

    public void clickNextStepButton() {
        Reporter.log("Click on next button" + nextStepButton.toString());
        clickOnElement(nextStepButton);
        CustomListeners.test.log(Status.PASS, "Click on next button");
    }

    }

