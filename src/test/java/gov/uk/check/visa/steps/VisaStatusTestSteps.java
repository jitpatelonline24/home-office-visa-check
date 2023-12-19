import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaStatusTestSteps {
    @Given("I am on visa status page")
    public void iAmOnVisaStatusPage() {
    }

    @When("I Click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I Select a Nationality {string}")
    public void iSelectANationality(String text) throws InterruptedException {
        new SelectNationalityPage().selectNationality(text);
    }

    @And("I Click on Continue button select nationality page")
    public void iClickOnContinueButtonSelectNationalityPage() {
        new SelectNationalityPage().clickNextStepButton();
    }


    @And("I Select reason {string}")
    public void iSelectReason(String text) {
        new ReasonForTravelPage().selectReasonForVisit(text);
    }

    @And("I Click on Continue button select reason page")
    public void iClickOnContinueButtonSelectReasonPage() {
        new ReasonForTravelPage().clickNextStepButton();
    }

    @Then("I verify result {string}")
    public void iVerifyResult(String text) {
        new ResultPage().confirmResultMessage(text);
    }

    @And("I Select intendent to stay for {string}")
    public void iSelectIntendentToStayFor(String text) {
        new DurationOfStayPage().selectLengthOfStay(text);
    }

    @And("I Click on Continue button intendent")
    public void iClickOnContinueButtonIntendent() {
        new DurationOfStayPage().clickNextStepButton();
    }

    @And("I Select have planning to work for {string}")
    public void iSelectHavePlanningToWorkFor(String text) {
        new WorkTypePage().selectJobType(text);
    }

    @And("I Click on Continue button planning to work")
    public void iClickOnContinueButtonPlanningToWork() {
        new WorkTypePage().clickNextStepButton();
    }

    @And("I Select state My partner of family member have uk immigration status {string}")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatus(String arg0) {

    }

    @And("I Click on Continue button my partner")
    public void iClickOnContinueButtonMyPartner() {

    }
}
