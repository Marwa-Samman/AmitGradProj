package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.StepDef.Hook.driver;

public class LoginPage {

    public LoginPage (){

        PageFactory.initElements(driver, this);

    }



    @FindBy (id = "Email")
    public WebElement email;

    @FindBy (id = "Password")
    public WebElement pc;

    @FindBy (xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    public WebElement submit;


    @FindBy (className = "ico-account")
    public WebElement myAccount;


    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")
    public WebElement errorMsg;
}
