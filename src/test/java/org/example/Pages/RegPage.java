package org.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.StepDef.Hook.driver;

public class RegPage {

    public RegPage () {

        PageFactory.initElements(driver, this);

    }


    @FindBy (id = "gender-female" )
    public WebElement GenderFem;


   @FindBy (id = "FirstName")
   public WebElement FirstName;


    @FindBy(id = "LastName")
    public WebElement LastName;

    @FindBy(name = "DateOfBirthDay")
    public WebElement day;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement month;

    @FindBy(name = "DateOfBirthYear")
    public WebElement year;

    @FindBy(id = "Email")
    public WebElement email;


    @FindBy(id = "Password")
    public WebElement pw;

    @FindBy(id = "ConfirmPassword")
    public WebElement pwc;

    @FindBy(id = "register-button")
    public WebElement submit;

    @FindBy(className = "result")
    public WebElement SuccessMsg;


}
