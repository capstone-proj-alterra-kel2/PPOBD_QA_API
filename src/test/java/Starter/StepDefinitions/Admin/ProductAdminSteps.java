package Starter.StepDefinitions.Admin;

import Starter.Project.Admin.ProductAdmin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductAdminSteps {
    @Steps
    ProductAdmin productAdmin;
    @Given("I set url products")
    public void iSetUrlProducts() {
        productAdmin.setUrlToProductAdmin();
    }
    @When("I get all product")
    public void iGetAllProduct() {
        productAdmin.productAdmin();
    }
    @Then("I will get status succes get all product")
    public void iWillGetStatusSuccesGetAllProduct() {
        productAdmin.statusSucces();
    }

    @When("I get product by id")
    public void iGetProductById() {
        productAdmin.productAdminById();
    }

    @Then("I will get status succes get product by id")
    public void iWillGetStatusSuccesGetProductById() {
        productAdmin.statusSucces();
    }

    @When("I get all product no token")
    public void iGetAllProductNoToken() {
        productAdmin.productAdminnotoken();
    }

    @Then("I will get status failed product")
    public void iWillGetStatusFailedProduct() {
        productAdmin.statusfailed();
    }

    @When("I get product by id no token")
    public void iGetProductByIdNoToken() {
        productAdmin.productAdminByIdnotoken();
    }
}
