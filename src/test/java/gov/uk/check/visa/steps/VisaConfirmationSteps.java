package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConfirmationSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }


    @And("I click on Continue button")
    public void clickContinueButton()  {
        new SelectNationalityPage().clickContinueButton();
    }


    @And("I select a Nationality Australia")
    public void iSelectANationalityAustralia() {
        new SelectNationalityPage().selectCountry("Australia");
    }

    @And("I select reason Tourism")
    public void iSelectReasonTourism() {
        new ReasonForTravelPage().selectReasonForVisit("Tourism");
    }

    @Then("I verify result You will not need a visa to come to the UK")
    public void iVerifyResultYouWillNotNeedAVisaToComeToTheUK() {
        new ResultPage().confirmResultMessage("You will not need a visa to come to the UK");
    }

    @And("I Select reason Work, academic visit or business")
    public void iSelectReasonWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().selectReasonForVisit("Work, academic visit or business");
    }

    @And("I select intendent to stay for longer than {int} months")
    public void iSelectIntendentToStayForLongerThanMonths(int arg0) {
        new DurationOfStayPage().selectLengthOfStay("longer than 6 months");
    }

    @And("I select have planning to work for Health and care professional")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectJobTypeList("Health and care professional");
    }

    @Then("I verify result You need a visa to work in health and care")
    public void iVerifyResultYouNeedAVisaToWorkInHealthAndCare() {
        new ResultPage().confirmResultMessage("You need a visa to work in health and care");
    }

    @And("I Select a Nationality Chile")
    public void iSelectANationalityChile() {
        new SelectNationalityPage().selectCountry("Chile");
    }

    @And("I select a Nationality Colombia")
    public void iSelectANationalityColombia() {
        new SelectNationalityPage().selectCountry("Colombia");
    }

    @And("I select reason Join partner or family for a long stay")
    public void iSelectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().selectReasonForVisit("Join partner or family for a long stay");
    }

    @And("I select state My partner of family member have uk immigration status yes")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {
        new ResultPage().confirmResultMessage("You may need a visa");
    }

    @Then("Verify result 'You’ll need a visa to join your family or partner in the UK")
    public void verifyResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK() {
        new ReasonForTravelPage().selectReasonForVisit("Join partner or family for a long stay");
    }

}
