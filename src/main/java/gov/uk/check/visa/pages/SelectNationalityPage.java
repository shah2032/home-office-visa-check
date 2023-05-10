package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    @CacheLookup
    @FindBy(id = "response")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;
    public void selectNationality(String nationality){
        CustomListeners.test.log(Status.PASS, "Select Nationality");
        Reporter.log("Select Nationality" + nationalityDropDownList.toString());
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);

    }
    public void  clickNextStepButton(){
        CustomListeners.test.log(Status.PASS, "Click On Continue");
        Reporter.log("Click On Continue" + nextStepButton.toString());
        clickOnElement(nextStepButton);

    }
}
