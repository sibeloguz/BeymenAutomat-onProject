package Page;

import BaseTest.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static Page.Element.*;

public class BeymenPages extends BasePage {
    public BeymenPages(WebDriver webDriver) {
        super(webDriver);
    }

    public static  String  productDetailPage_productPrice="";

    public void openPage()
    {
        Assert.assertEquals(getPageTitle(),"Beymen.com – Lifestyle Destination");
    }
    public void contentControl()
    {
        String myAccountButtonResult=getElementText(myAccountButton);
        Assert.assertEquals(myAccountButtonResult,"Hesabım");
        String myFavoriteButtonResult=getElementText(myFavoriteButton);
        Assert.assertEquals(myFavoriteButtonResult,"Favorilerim");
        String basketButtonResult=getElementText(basketButton);
        Assert.assertEquals(basketButtonResult,"Sepetim");
    }
    public void search(){
        write(searchTextBox, "pantolon");
        ENTER(searchTextEnter);
    }
    public void isSearchPageOpen(){
        waitSecond(5);
        String searchResultText=getElementText(searchTextEnterResult);
        Boolean isContainsSearchText=searchResultText.contains("pantolon");
        Assert.assertTrue(isContainsSearchText);
    }
    public void scroll()
    {
        pageScrollDown();
        pageScrollDownClick(moreContentButton);
        click(moreContentButton);
    }
    public void clickRandomProduct(){
        WebElement selectedProduct=getRandomElementFromElementList(randomProduct);
        selectedProduct.click();
        waitSecond(5);
    }
    public void addBasket()
    {
        click(productSizeText);
        click(addBasketButton);
        waitSecond(1);
        click(goToBasketButton);
        waitSecond(1);
    }
    public void controlEqualsProductPrices(){
        String basketPageProductPrice=getElementText(basketPage_productPrice);
        Assert.assertTrue(basketPageProductPrice.contains(productDetailPage_productPrice));
    }
    public void productNumberAmount()
    {
        selectOption(productNumberAmount,"2");
        waitSecond(3);
    }
    public void productNumberAmountControl()
    {
        String amountResult=getElementText(productNumberAmountResult);
        Boolean isContainsSearchText=amountResult.contains("2");
        Assert.assertTrue(isContainsSearchText);
    }
    public void removeProduct()
    {
        click(removeProduct);
    }
    public void removeProductControl()
    {
        String emptyBasketMessageResult=getElementText(emptyBasketMessage);
        Assert.assertEquals(emptyBasketMessageResult,"Sepetinizde Ürün Bulunmamaktadır");
    }
}
