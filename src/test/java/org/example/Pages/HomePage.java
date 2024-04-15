package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.StepDef.Hook.driver;


public class HomePage {


    public HomePage(){

        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "customerCurrency")
    public WebElement Currency;


    @FindBy(xpath = "//*[@id=\"customerCurrency\"]/option[2]")
    public WebElement Euro;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span")
    public WebElement P1;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[1]/span")
    public WebElement P2;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[1]/span")
    public WebElement P3;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[4]/div/div[2]/div[3]/div[1]/span")
    public WebElement P4;




    }

