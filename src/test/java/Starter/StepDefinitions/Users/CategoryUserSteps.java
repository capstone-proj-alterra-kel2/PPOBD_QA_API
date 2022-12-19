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


}
