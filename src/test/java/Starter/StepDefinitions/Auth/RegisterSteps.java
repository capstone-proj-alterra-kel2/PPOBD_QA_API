package Starter.StepDefinitions.Auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Starter.Project.Auth.Register;

public class RegisterSteps {

@Steps
    Register register;

    @Given("I set url register")
    public void iSetUrlRegister() {
        register.setUrlToRegister();
    }

    @When("I input name phone_number email password")
    public void iInputNamePhone_numberEmailPassword() {
        register.validregister();
    }

    @Then("I will get status code 201 create")
    public void iWillGetStatus201CodeCreate() {
        register.statusCode201();
    }

    @When("I input name email password")
    public void iInputNameEmailPassword() {
        register.invaliddatanophone();
    }

    @Then("I will get status code 400 Bad Request")
    public void iWillGetStatusCode400BadRequest() {
        register.validateErorMessage400();
    }

    @When("I input name phone_number password")
    public void iInputNamePhone_numberPassword() {
        register.invaliddatanoemail();
    }

    @When("I input name  phone_number email")
    public void iInputNamePhone_numberEmail() {
        register.invalidnopassword();
    }

    @When("I input no data")
    public void iInputNoData() {
        register.invaliddata();
    }

    @When("I input register account")
    public void iInputRegisterAccount() {
        register.invalidregisteraccount();
    }

    @When("I input phone_number email password")
    public void iInputPhone_numberEmailPassword() {
        register.invalidname();
    }
}
