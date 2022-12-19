package Starter.StepDefinitions.Auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Starter.Project.Auth.Login;


public class LoginSteps {
    @Steps
    Login login;

    @Given("I set url login")
    public void iSetUrlLogin() {
        login.setUrlToLogin();
    }
    @When("I input email password")
    public void iInputEmailPassword () {
        login.validlogin();
    }
    @Then("I will get status succes")
    public void iWillGetStatusSucces() {
        login.statusCode200();
          }
    @When("I input email")
    public void iInputEmail() {
        login.nopassword();
    }

    @Then("I will get status validation failed")
    public void iWillGetStatusValidationFailed() {
        login.validateErorMessage400();
    }

    @When("I input null data")
    public void iInputNullData() {
        login.nodata();
   }
    @When("I input email and password invalid")
    public void iInputEmailAndPasswordInvalid() {
        login.emailandpasswordinvalid();
    }

    @When("I input password")
    public void iInputPassword() {
        login.noemail();
    }

    @When("I input email valid and password invalid")
    public void iInputEmailValidAndPasswordInvalid() {
        login.EmailValidAndPasswordInvalid();
    }

    @When("I input email invalid and password valid")
    public void iInputEmailInvalidAndPasswordValid() {
        login.EmailInvalidAndPasswordValid();
    }

    @Then("I will get status validate Eror Message")
    public void iWillGetStatusValidateErorMessage() {
        login.validateErorMessage401();
    }
}
