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

    @Then("I will get status succes get Product Product Type by id")
    public void iWillGetStatusSuccesGetProductProductTypeById() {
        productTypeAdmin.statusSucces();
    }
}
