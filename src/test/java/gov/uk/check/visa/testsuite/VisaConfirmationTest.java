package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {
DurationOfStayPage durationOfStayPage;
FamilyImmigrationStatusPage familyImmigrationStatusPage;
ReasonForTravelPage reasonForTravelPage;
ResultPage resultPage;
SelectNationalityPage selectNationalityPage;
StartPage startPage;
WorkTypePage workTypePage;
@BeforeMethod(alwaysRun = true)
    public void inIt(){
    durationOfStayPage = new DurationOfStayPage();
    familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
    reasonForTravelPage = new ReasonForTravelPage();
    resultPage = new ResultPage();
    selectNationalityPage = new SelectNationalityPage();
    startPage = new StartPage();
    workTypePage = new WorkTypePage();
}
@Test(groups = {"sanity","regression"})
  public void  anAustralianComingToUKForTourism(){
//    Click on start button
    startPage.clickStartNow();
//    Select a Nationality 'Australia'
    selectNationalityPage.selectNationality("Australia");
//    Click on Continue button
    selectNationalityPage.clickNextStepButton();
//    Select reason 'Tourism'
    reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
//    Click on Continue button
    reasonForTravelPage.clickNextStepButton();
//    verify result 'You will not need a visa to come to the UK'
    resultPage.getResultMessage();
    resultPage.confirmResultMessage("You will not need a visa to come to the UK");


}
@Test(groups = {"smoke","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
//    Click on start button
    startPage.clickStartNow();
//    Select a Nationality 'Chile'
    selectNationalityPage.selectNationality("Chile");
//    Click on Continue button
    selectNationalityPage.clickNextStepButton();

//    Select reason 'Work, academic visit or business'
reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");

//    Click on Continue button
    reasonForTravelPage.clickNextStepButton();


//    Select intendent to stay for 'longer than 6 months'
      durationOfStayPage.selectLengthOfStay("longer than 6 months");
//    Click on Continue button
    durationOfStayPage.clickNextStepButton();
//    Select have planning to work for 'Health and care professional'
    workTypePage.selectJobType("Health and care professional");
//    Click on Continue button
    workTypePage.clickNextStepButton();
//    verify result 'You need a visa to work in health and care'
    resultPage.confirmResultMessage("You need a visa to work in health and care");

}
@Test(groups = {"regression"})
public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
//    Click on start button
    startPage.clickStartNow();
//    Select a Nationality 'Colombia'
    selectNationalityPage.selectNationality("Colombia");
//    Click on Continue button
    selectNationalityPage.clickNextStepButton();
//    Select reason 'Join partner or family for a long stay'
    reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");

//    Click on Continue button
    reasonForTravelPage.clickNextStepButton();
//    Select state My partner of family member have uk immigration status 'yes'

//    Click on Continue button
//    verify result 'You’ll need a visa to join your family or partner in the UK'
}
}
