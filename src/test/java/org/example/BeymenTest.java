package org.example;

import BaseTest.BaseTest;
import Page.BeymenPages;
import org.junit.Test;

public class BeymenTest extends BaseTest {

    @Test
    public void testDeneme() {
        BeymenPages beymenPages= new BeymenPages(driver);

        beymenPages.openPage();
        beymenPages.contentControl();
        beymenPages.search();
        beymenPages.isSearchPageOpen();
        beymenPages.scroll();
        beymenPages.clickRandomProduct();
        beymenPages.addBasket();
        beymenPages.controlEqualsProductPrices();
        beymenPages.productNumberAmount();
        beymenPages.productNumberAmountControl();
        beymenPages.removeProduct();
        beymenPages.removeProductControl();
    }
}
