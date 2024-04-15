package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.LandingPage;
import org.example.Pages.LoginPage;
import org.testng.Assert;
import static org.example.StepDef.Hook.driver;




public class Login {

    LandingPage Landing = new LandingPage();
    LoginPage Login = new LoginPage();


    @Given("User Launch Login Page")
    public void UserLaunchLoginPage () {

        Landing.LoginTab().click();

    }


    @When("Provide Valid Email Address Provide Valid Password")
    public void provideValidEmailAddressProvideValidPassword() {


        Login.email.sendKeys("anne_pierre@gemail.com");
        Login.pc.sendKeys("anne123");

    }


    @When("Provide Invalid Email Address Provide Valid Password")
    public void provideInvalidEmailAddressProvideValidPassword() {


        Login.email.sendKeys("Gana.Ramad@123.com");
        Login.pc.sendKeys("123456789");

    }


    @And("Click Login Button")
    public void clickLoginButton() {

        Login.submit.click();

    }


    @Then("User Login To System Successfully")
    public void userLoginToSystemSuccessfully() {


        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
        Assert.assertEquals(Login.myAccount.getText(),"My account");

    }


    @Then("User Fails To Login")
    public void userFailsToLogin() throws InterruptedException {

        Assert.assertEquals(Login.errorMsg.getText(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
    }


}
