package Page;

import org.openqa.selenium.By;

public class Element {

    public static final By searchTextBox= By.xpath("//input[@class='default-input o-header__search--input']");
    public static final By searchTextEnter= By.xpath("//button[@class='o-header__search--btn bmi-search']");
    public static final By searchTextEnterResult= By.xpath("//div[@id='productListTitle']//b");
    public static final By myAccountButton=By.xpath("//*[text()='Hesabım']");
    public static final By myFavoriteButton=By.xpath("//*[text()='Favorilerim ']");
    public static final By basketButton=By.xpath("//*[text()='Sepetim ']");
    public static final By moreContentButton=By.xpath("//button[@id='moreContentButton']");
    public static final By randomProduct=By.xpath("//div[@class='o-productList__item']");
    public static final By productSizeText=By.xpath("//*[text()='34']");
    public static final By addBasketButton=By.xpath("//button[@id='addBasket']");
    public static final By goToBasketButton=By.xpath("//*[text()='Sepetim ']");
    public static final By productNameLabel=By.xpath("//*[text()='Siyah Yüksek Bel Pili Detaylı Pantolon']");
    public static final By productNumberAmount=By.xpath("//select[@id='quantitySelect0']");
    public static final By productNumberAmountResult=By.xpath("//select[@id='quantitySelect0']//option[@value='2']//text()");
    public static final By basketPage_productPrice=By.xpath("//span[@class='m-productPrice__salePrice']");
    public static final By removeProduct=By.xpath("//button[@id='removeCartItemBtn0']");
    public static final By emptyBasketMessage=By.xpath("//*[text()='Sepetinizde Ürün Bulunmamaktadır']");
}
