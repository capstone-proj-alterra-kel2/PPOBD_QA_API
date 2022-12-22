package Starter.StepDefinitions.Admin;

import Starter.Project.Admin.ProductTypeAdmin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductTypeAdminSteps {
    @Steps
    ProductTypeAdmin productTypeAdmin;
    @Given("I set url Product Type")
    public void iSetUrlProductType() {
        productTypeAdmin.setUrlToProductAdmin();
    }

    @When("I get all Product Type")
    public void iGetAllProductType() {
        productTypeAdmin.productTypeAdmin();
    }

    @Then("I will get status succes get all Product Type")
    public void iWillGetStatusSuccesGetAllProductType() {
        productTypeAdmin.statusSucces();
    }

    @When("I get Product Type by id")
    public void iGetProductTypeById() {
        productTypeAdmin.productTypeAdminById();
    }

    @Then("I will get status succes get Product Type by id")
    public void iWillGetStatusSuccesGetProductTypeById() {
        productTypeAdmin.statusSucces();
    }

    @When("I get all Product Type no token")
    public void iGetAllProductTypeNoToken() {
        productTypeAdmin.productTypeAdminnotoken();
    }

    @Then("I will get status failed get all Product Type")
    public void iWillGetStatusFailedGetAllProductType() {
        productTypeAdmin.statusfailed();
    }

    @When("I get Product Type by id no token")
    public void iGetProductTypeByIdNoToken() {
        productTypeAdmin.productTypeAdminByIdnotoken();
    }

    @Then("I will get status failed get Product")
    public void iWillGetStatusFailedGetProduct() {
        productTypeAdmin.statusfailed();
    }
}
