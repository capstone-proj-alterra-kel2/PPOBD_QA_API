package Starter.StepDefinitions.Users;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Starter.Project.Users.Wallet;

public class WalletUserSteps {

    @Steps
    Wallet wallet;
        @Given("I set url top up wallet")
        public void iSetUrlTopUpWallet(){
            wallet.setUrlToWallet();
        }

    @When("I get top up balance")
    public void iGetTopUpBalance() {
            wallet.Validtopupbalance();
    }

    @Then("I will get status succes all top up balance")
    public void iWillGetStatusSuccesAllTopUpBalance() {
            wallet.statusSucces();
    }

    @When("I get my wallet")
    public void iGetMyWallet() {
            wallet.infowallet();
    }

    @Then("I will get status succes my wallet")
    public void iWillGetStatusSuccesMyWallet() {
            wallet.statusSucces();
    }

    @When("I get my wallet history")
    public void iGetMyWalletHistory() {
            wallet.WalletHistory();
    }

    @Then("I will get status succes my wallet history")
    public void iWillGetStatusSuccesMyWalletHistory() {
            wallet.statusSucces();
    }

    @When("I get my wallet cashin cashout")
    public void iGetMyWalletCashinCashout() {
            wallet.WalletCashinCashout();
    }

    @Then("I will get status succes my wallet cashin cashout")
    public void iWillGetStatusSuccesMyWalletCashinCashout() {
            wallet.statusSucces();
    }
}

