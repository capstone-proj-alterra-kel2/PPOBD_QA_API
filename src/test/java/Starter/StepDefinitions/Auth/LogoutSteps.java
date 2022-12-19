package Starter.StepDefinitions.Auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Starter.Project.Auth.Logout;

public class LogoutSteps {

        @Steps
        Logout logout;

        @Given("I set url logout")
        public void ISetUrlLogout(){
                logout.SetUrlLogout();
        }
        @When("I input token")
        public void IInputToken(){
                logout.setToken();

        }
        @Then("I will get status succes logout")
        public void iWillGetStatusSuccesLogout(){
                logout.statusSucces();

        }

        @When("I input invalid token")
        public void iInputInvalidToken() {
                logout.InvalidToken();
        }

        @Then("I will get status failed logout")
        public void iWillGetStatusFailedLogout() {
                logout.invalidtoken();
        }

        @When("I input no token")
        public void iInputNoToken() {
                logout.noToken();
        }

        @Then("I will get status failed logout 400")
        public void iWillGetStatusFailedLogout400() {
                logout.notoken();
        }
}

