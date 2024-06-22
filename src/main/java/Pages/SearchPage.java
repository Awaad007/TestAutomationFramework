package Pages;

import Common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends PageBase {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    //locators
    By searchFieldTxt = By.id("small-searchterms");
    By searchBtn = By.cssSelector(".button-1.search-box-button");
    By dropDownList = By.id("ui-id-1");
    By productTitle = By.cssSelector("h2.product-title");

    String searchData = "ProductData.json";
    public String productName = jsonReader("productName",searchData);

    //methods
    public void userEnterProductName(){
        setElementText(searchFieldTxt,jsonReader("productName",searchData));
    }
    public void userSelectFirstProduct(){
        clickOnButton(dropDownList);
    }
    public void userClickOnSearchBtn(){
        clickOnButton(searchBtn);
    }
    public void userClickOnProductTitle(){
        clickOnButton(productTitle);
    }

}
