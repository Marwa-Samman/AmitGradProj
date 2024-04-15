package org.example.StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hook {

    public static WebDriver driver;


    @Before

    public void OpenBrowser(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        driver.get("https://demo.nopcommerce.com/");

    }



    @After

    public void CloseDriver() throws InterruptedException {

        Thread.sleep(Long.parseLong("5000"));
        driver.quit();

    }
}
