package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    public WikiSearchPage(){

        //create constructor
        // initialize the driver instance and this class' instance using PageFactory.initElements
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //We can start locating web elements using @FindBy annotation
    @FindBy(id="searchInput")
    public WebElement searchBox;

    @FindBy(xpath="//button[@type = 'submit']")
    public WebElement searchButton;

    @FindBy(id="firstHeading")
    public WebElement mainHeader;
}
