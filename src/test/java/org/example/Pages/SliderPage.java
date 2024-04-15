package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.StepDef.Hook.driver;

public class SliderPage {


    public SliderPage(){

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath= "//*[@id=\"nivo-slider\"]/a[1]")
    public WebElement iPhone;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[2]")
    public WebElement Galaxy;





}
