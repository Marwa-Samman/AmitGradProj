package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.LandingPage;
import org.example.Pages.RegPage;
import org.openqa.selenium.support.ui.Select;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class Reg {

    LandingPage landing = new LandingPage();
    RegPage register = new RegPage();



    @Given("User open browser and navigate to website")

        public void UserOpenBrowserAndNavigateToWebsite(){

        landing.registerTab().click();

    }


    @When("Choose Gender")
    public void chooseGender() {

        register.GenderFem.click();

    }

    @And("Provide First Name")
    public void provideFirstName() {

        register.FirstName.sendKeys("automation");

    }

    @And("Provide Last Name")
    public void provideLastName() {

        register.LastName.sendKeys("tester");

    }

    @And("Provide Birth Date")
    public void provideBirthDate() {

        Select Day = new Select(register.day);
        Day.selectByValue("7");

        Select Month = new Select(register.month);
        Month.selectByValue("10");

        Select Year = new Select(register.year);
        Year.selectByValue("1982");

    }

   @And("Provide Email Address")
    public  void provideEmailAddress() {

        Faker fake = new Faker();
        String Email = fake.internet().emailAddress();
        register.email.sendKeys(Email);

    }

   @And("Set Password")
    public void setPassword() {

        register.pw.sendKeys("P@ssw0rd");

    }

    @And("Confirm Password")
    public void confirmPassword() {

        register.pwc.sendKeys("P@ssw0rd");

    }

   @And("Submit Form")
    public void submitForm() {

        register.submit.click();

    }

   @Then("Success Message Appear")
    public void successMessageAppear() {


       SoftAssert soft = new SoftAssert();
       soft.assertEquals(register.SuccessMsg.getText(),"Your registration completed");
       soft.assertEquals(register.SuccessMsg.getCssValue("color"),"rgba(76, 177, 124, 1)");

       soft.assertAll();

    }


}
