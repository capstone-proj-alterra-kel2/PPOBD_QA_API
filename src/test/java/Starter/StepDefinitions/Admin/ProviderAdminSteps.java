package Starter.StepDefinitions.Admin;

import Starter.Project.Admin.ProviderAdmin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProviderAdminSteps {
    @Steps
   ProviderAdmin providerAdmin;

    @Given("I set url Provider")
    public void iSetUrlProvider() {
        providerAdmin.setUrlToProviderAdmin();
    }

    @When("I get all Provider")
    public void iGetAllProvider() {
        providerAdmin.providerAdmin();
    }

    @Then("I will get status succes get all Provider")
    public void iWillGetStatusSuccesGetAllProvider() {
        providerAdmin.statusSucces();
    }

    @When("I get Provider by id")
    public void iGetProviderById() {
        providerAdmin.ProviderAdminByid();
    }

    @Then("I will get status succes get Provider by id")
    public void iWillGetStatusSuccesGetProviderById() {
        providerAdmin.statusSucces();
    }

    @When("I get all Provider no token")
    public void iGetAllProviderNoToken() {
        providerAdmin.providerAdminnotoken();
    }

    @Then("I will get status failed get all Provider")
    public void iWillGetStatusFailedGetAllProvider() {
        providerAdmin.statusfailed();
    }

    @When("I get Provider by id no token")
    public void iGetProviderByIdNoToken() {
        providerAdmin.ProviderAdminByidnotoken();
    }

    @Then("I will get status failed get Provider")
    public void iWillGetStatusFailedGetProvider() {
        providerAdmin.statusfailed();
    }
}
