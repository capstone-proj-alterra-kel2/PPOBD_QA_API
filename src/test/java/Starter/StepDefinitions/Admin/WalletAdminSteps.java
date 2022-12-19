package Starter.StepDefinitions.Admin;

import Starter.Project.Admin.WalletAdmin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class WalletAdminSteps {
    @Steps
    WalletAdmin walletAdmin;
    @Given("I set url Wallet")
    public void iSetUrlWallet() {
        walletAdmin.setUrlToWalletAdmin();
    }

    @When("I get Wallet by id")
    public void iGetWalletById() {
        walletAdmin.WalletAdminById();
    }

    @Then("I will get status succes get Wallet by id")
    public void iWillGetStatusSuccesGetWalletById() {
        walletAdmin.statusSucces();
    }

    @When("I get Wallet all")
    public void iGetWalletAll() {
        walletAdmin.WalletAdmin();
    }

    @Then("I will get status succes get Wallet all")
    public void iWillGetStatusSuccesGetWalletAll() {
        walletAdmin.statusSucces();
    }
}
