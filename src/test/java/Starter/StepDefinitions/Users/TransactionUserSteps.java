package Starter.StepDefinitions.Users;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Starter.Project.Users.TransactionUsers;

public class TransactionUserSteps {

    @Steps
    TransactionUsers transaction;
    @Given("I set url user transaction")
    public void iSetUrlUserTransaction() {
        transaction.setUrlToTransaction();
    }

    @When("I get create a transaction")
    public void iGetCreateATransaction() {
        transaction.validTransaction();
    }

    @Then("I will get status succes a transaction")
    public void iWillGetStatusSuccesATransaction() {
        transaction.statusSucces();
    }

    @When("I get Transaction history")
    public void iGetTransactionHistory() {
        transaction.Transactionhistory();
    }

    @Then("I will get status succes Transaction")
    public void iWillGetStatusSuccesTransaction() {
        transaction.statusSucces();
    }

}

