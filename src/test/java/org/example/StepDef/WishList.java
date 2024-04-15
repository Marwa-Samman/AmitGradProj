package org.example.StepDef;
import static org.example.StepDef.Hook.driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.LandingPage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.time.Duration;

public class WishList {

    LandingPage Landing = new LandingPage();


    @Given("User Tapped Add Button")
    public void userTappedAddButton() {

        Landing.Add.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

    }

    @Then("Success Message Appeared")
    public void successMessageAppeared() {

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Landing.SuccessMsg.getText(), "The product has been added to your wishlist");

    }

    @And("Message Background is Green")
    public void messageBackgroundIsGreen() {

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Landing.SuccessMsg.getCssValue("background-color"), "rgba(75, 176, 122, 1)");

    }


    @When("User Tap Wishlist Tab")
    public void userTapWishlistTab() {

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Landing.WishlistTab.click();

    }

    @Then("Items Qty Is Present")
    public void itemsQtyIsPresent() {

       Integer QtyValue = Integer.valueOf(Landing.Qty.getAttribute("value"));
       Assert.assertTrue(QtyValue>0);

    }
}