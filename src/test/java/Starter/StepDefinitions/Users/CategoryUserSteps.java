package Starter.StepDefinitions.Users;

import Starter.Project.Users.CategoryUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CategoryUserSteps {

    @Steps
    CategoryUser categoryUser;
    @Given("I set url category product")
    public void iSetUrlCategoryProduct() {
        categoryUser.setUrlToCategoryUser();
    }

    @When("I get a category product")
    public void iGetACategoryProduct() {
        categoryUser.categoryproduct();
    }

    @Then("I will get status succes get a category product")
    public void iWillGetStatusSuccesGetACategoryProduct() {
        categoryUser.statusSucces();
    }


    @When("I get a category product by id")
    public void iGetACategoryProductById() {
        categoryUser.categoryproductbyid();
    }

    @Then("I will get status succes get a category product by id")
    public void iWillGetStatusSuccesGetACategoryProductById() {
        categoryUser.statusSucces();
    }

    @When("I get a category product no token")
    public void iGetACategoryProductNoToken() {
        categoryUser.categoryproductnotoken();
    }

    @Then("I will get status failed get a category product")
    public void iWillGetStatusFailedGetACategoryProduct() {
        categoryUser.statusfailed();
    }
}
