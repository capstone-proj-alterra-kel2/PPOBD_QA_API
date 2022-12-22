package Starter.StepDefinitions.Users;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Starter.Project.Users.ProductUsers;

public class ProductUserSteps {
    @Steps
    ProductUsers product;
    @When("I get user product")
    public void iGetUserProduct() {
        product.ProductAllProduct();
    }
    @When("I get all user product")
    public void iGetAllUserProduct() {
        product.ProductAllProduct();
    }
    @Then("I will get status succes get user product")
    public void iWillGetStatusSuccesGetUserProduct() {
        product.statusSucces();
    }
    @Given("I set url product")
    public void iSetUrlProduct(){
        product.setUrlToProduct();
    }
    @When("I get user product by id")
    public void iGetUserProductById() {
        product.ProductById();
    }
    @Then("I will get status succes get user product by id")
    public void iWillGetStatusSuccesGetUserProductById() {
        product.statusSucces();
    }

    @When("I get user product no token")
    public void iGetUserProductNoToken() {
        product.ProductAllProductnotoken();
    }

    @Then("I will get status failed get a product")
    public void iWillGetStatusFailedGetAProduct() {
        product.statusfailed();
    }

    @When("I get user product by id no token")
    public void iGetUserProductByIdNoToken() {
        product.ProductByIdnotoken();
    }
}

