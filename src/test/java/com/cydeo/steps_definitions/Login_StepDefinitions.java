package com.cydeo.steps_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("User is observing the Dashboard");
    }
    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("User is on the library login page");
    }
    @When("user enters librarian's username")
    public void user_enters_librarian_s_username() {
        System.out.println("User is entering librarian's username");
    }
    @When("user enters librarian's password")
    public void user_enters_librarian_s_password() {
        System.out.println("User is entering librarian's password");
    }

    @When("user enters student's username")
    public void user_enters_student_s_username() {
        System.out.println("User is entering student's username");
    }
    @When("user enters student's password")
    public void user_enters_student_s_password() {
        System.out.println("User is entering student's password");
    }
    @When("user enters admin's username")
    public void userEntersAdminSUsername() {
        System.out.println("User is entering admin username");
    }
    @When("user enters admin's password")
    public void userEntersAdminSPassword() {
        System.out.println("User is entering admin password");
    }


}
