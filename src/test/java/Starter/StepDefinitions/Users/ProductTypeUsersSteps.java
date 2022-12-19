package Starter.StepDefinitions.Users;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Starter.Project.Users.ProductTypeUsers;

public class ProductTypeUsersSteps {
    @Steps
    ProductTypeUsers productType;

    @Given("I set url product type")
    public void iSetUrlProductType(){
        productType.setUrlToProductType();
        }

    @When("I get product by type")
    public void iGetProductByType() {
        productType.ProductType();
    }

    @Then("I will get status succes product by type")
    public void iWillGetStatusSuccesProductByType() {
        productType.statusSucces();
    }

    @When("I get product type by id")
    public void iGetProductTypeById() {
        productType.ProductTypebyid();
    }
}

