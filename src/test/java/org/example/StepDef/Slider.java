package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.SliderPage;
import org.testng.Assert;

import java.time.Duration;

import static org.example.StepDef.Hook.driver;

public class Slider {

    SliderPage Slider = new SliderPage();


    @Given("Slider Shows iPhone Ad")

    public void SliderShowsiPhoneAd() {

        Slider.iPhone.getCssValue("Style");


    }

    @When("User Tap Slider")
    public void userTapSlider() {

        Slider.iPhone.click();

    }

    @Then("User is Navigated To iPhone Page")
    public void userIsNavigatedToIPhonePage() {

        String URL = driver.getCurrentUrl();
        Assert.assertNotEquals(URL, "https://demo.nopcommerce.com/iphone-14-ultra");

    }

    @Given("Slider Shows Galaxy Ad")
    public void sliderShowsGalaxyAd() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        Slider.Galaxy.getCssValue("Style");


    }


    @When("User Tap Galaxy Slider")
    public void userTapGalaxySlider() {

        Slider.Galaxy.click();

    }

    @Then("User is Navigated To Galaxy Page")
    public void userIsNavigatedToGalaxyPage() {

        String GalaxyURL = driver.getCurrentUrl();
        Assert.assertNotEquals(GalaxyURL, "https://demo.nopcommerce.com/galaxy_s22_ultra");

    }
}