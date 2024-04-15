package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.testng.Assert;


public class Currency {


    HomePage Home = new HomePage();

    @Given("User Tapped Currency Button")
    public void UserTappedCurrencyButton (){

        Home.Currency.click();

    }

    @When("User Selects Euro")
    public void userSelectsEuro() throws InterruptedException {

        Home.Euro.click();
        Thread.sleep(3000);

    }


    @Then("Products Currency Changes To Euro")
    public void productsCurrencyChangesToEuro() {

        Assert.assertEquals(Home.P1.getText(), "€1032.00");
        Assert.assertEquals(Home.P2.getText(), "€1548.00");
        Assert.assertEquals(Home.P3.getText(), "€210.70");
        Assert.assertEquals(Home.P4.getText(), "€21.50" );

    }
}
