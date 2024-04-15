package org.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.StepDef.Hook.driver;


public class LandingPage {


    public WebElement registerTab() {
       return driver.findElement(By.className("ico-register"));
    }

    public WebElement LoginTab(){ return driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));}



    public LandingPage(){

        PageFactory.initElements(driver,this);

    }
// FollowUs
    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a")
    public WebElement Facebook;

    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a")
    public WebElement Twitter;

    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a")
    public WebElement RSS;

    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a")
    public WebElement YouTube;

// WishList

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    public WebElement Add;

    @FindBy(css = "#bar-notification")
    public WebElement SuccessMsg;


    @FindBy(className = "wishlist-label")
    public WebElement WishlistTab;


    @FindBy(css = "body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.wishlist-content > form > div.table-wrapper > table > tbody > tr > td.quantity > input")
    public WebElement Qty;


// Hover

    @FindBy(css = "body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(3) > a")
    public List <WebElement> Categories;

    @FindBy(css = "body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(3) > ul > li:nth-child(1) > a")
    public List <WebElement> SubCategories;

    @FindBy(css = "body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-title")
    public WebElement PageTitle;


// Search


    @FindBy(id = "small-searchterms")
    public WebElement searchBar;

    @FindBy(css = "#small-search-box-form > button")
    public WebElement searchButton;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div")
    public List <WebElement> ResultsCount;

    @FindBy(className = "item-box")
    public WebElement Item;

    @FindBy(xpath = "//*[@id=\"q\"]")
    public WebElement Key;

    @FindBy(css= "#product-details-form > div:nth-child(2) > div.product-essential > div.overview > div.additional-details > div")
    public WebElement SKU;



}
