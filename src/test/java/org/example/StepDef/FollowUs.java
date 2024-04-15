package org.example.StepDef;
import static org.example.StepDef.Hook.driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.LandingPage;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class FollowUs {

    LandingPage Landing = new LandingPage();

    @Given("User Tapped Facebook Icon")
    public void UserTappedFacebookIcon(){

        Landing.Facebook.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

    }


    @Then("Facebook Page Opens In New Tab")
    public void FacebookPageOpensInNewTab() {

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");

    }


    @Given("User Tapped Twitter Icon")
    public void UserTappedTwitterIcon(){

        Landing.Twitter.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

    }


    @Then("Twitter Page Opens In New Tab")
    public void twitterPageOpensInNewTab() {

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/nopCommerce");

    }






    @Given("User Tapped RSS Icon")
    public void userTappedRSSIcon() {

        Landing.RSS.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

    }

    @Then("RSS Page Opens In New Tab")
    public void rssPageOpensInNewTab() {

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");

    }

    @Given("User Tapped YouTube Icon")
    public void userTappedYouTubeIcon() {

        Landing.YouTube.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));


    }

    @Then("YouTube Page Opens In New Tab")
    public void youtubePageOpensInNewTab() {

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");

    }
}
