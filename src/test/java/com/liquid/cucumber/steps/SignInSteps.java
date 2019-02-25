package com.liquid.cucumber.steps;

import com.liquid.screenplay.abilities.Authenticate;
import com.liquid.screenplay.questions.UserAccount;
import com.liquid.screenplay.tasks.LogIn;
import com.liquid.screenplay.tasks.Start;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.ConsequenceMatchers.displays;
import static org.hamcrest.Matchers.equalTo;

public class SignInSteps {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) is a registered (?:PTE|JP)$")
    public void userIsARegisteredMember(String actor) {
        theActorCalled(actor).attemptsTo(Start.prepareToSignIn());
    }

    @When("^(?:he|she|they|Mary) logs in with valid credentials$")
    public void sheLogsInWithValidCredentials(DataTable credentials) {
        theActorInTheSpotlight()
                .whoCan(Authenticate.with(credentials))
                .attemptsTo(LogIn.withCredentials());
    }

//    @And("^User sees the landing page$")
//    public void userSeesTheLandingPage() {
//        theActorInTheSpotlight().should(
//                seeThat(MarketsPageTitle.displayed(), hasItem(containsString("Crypto Market & Latest Prices | What Token is Moving Today? | Liquid"))));
//    }

    @Then("^(?:he|she|they) should be able to view home page$")
    public void sheShouldBeAbleToViewHomePage() {
        theActorInTheSpotlight()
                .should(seeThat(UserAccount.loaded(),
                        displays("title", equalTo("Crypto Market & Latest Prices | What Token is Moving Today? | Liquid"))));
    }

}
