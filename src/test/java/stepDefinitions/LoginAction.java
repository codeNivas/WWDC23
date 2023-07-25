package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;

public class LoginAction {

    @Given("User is on Home Page")
    public void user_is_on_Home_Page() {
        System.out.println("Open Browser");
    }

    @When("User Navigate to LogIn Page")
    public void user_Navigate_to_LogIn_Page() {
        System.out.println("Navigate to login page");

    }

    @When("User enters UserName and Password")
    public void user_enters_UserName_and_Password() {
        System.out.println("Enter username and password");
    }

    @Then("Message displayed Login Successfully")
    public void message_displayed_Login_Successfully() {
        System.out.println("Logged in Successfully");
    }

    @When("User LogOut from the Application")
    public void user_LogOut_from_the_Application() {
        System.out.println("User to log out of application");
    }

    @Then("Message displayed LogOut Successfully")
    public void message_displayed_LogOut_Successfully() {
        System.out.println("Logged out Successfully");
    }

}
