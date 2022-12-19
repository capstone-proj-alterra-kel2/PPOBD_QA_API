package Starter.StepDefinitions.Admin;

import Starter.Project.Admin.CategoryAdmin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CategoryAdminSteps {

    @Steps
    CategoryAdmin categoryAdmin;
    @Given("I set url Category")
    public void iSetUrlCategory() {
        categoryAdmin.setUrlToCategoryAdmin();
    }
    @When("I get all Category")
    public void iGetAllCategory() {
        categoryAdmin.categoryAdmin();
    }
    @Then("I will get status succes get all Category")
    public void iWillGetStatusSuccesGetAllCategory() {
        categoryAdmin.statusSucces();
    }
    @When("I get Category id")
    public void iGetCategoryId() {
        categoryAdmin.CategoryAdminById();
    }
    @Then("I will get status succes get Category id")
    public void iWillGetStatusSuccesGetCategoryId() {
        categoryAdmin.statusSucces();
    }
}
