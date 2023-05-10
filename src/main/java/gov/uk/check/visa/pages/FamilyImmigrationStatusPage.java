package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {
    @CacheLookup
    @FindBy()
    WebElement  nextStepButton;
    @CacheLookup
    @FindBy()
    WebElement  yes;
    @CacheLookup
    @FindBy()
    WebElement no;
    public  void selectImmigrationStatus(String status){

    }
    public void clickNextStepButton(){

    }
}
