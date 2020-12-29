package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.ZnwrHomePage;

public class ZnwrCardTests extends CommonConditions  {

    @Test
    public void addToCard() {
        boolean CardResult = new ZnwrHomePage(driver)
                .openPage()
                .openSearchPage()
                .searchInput("Вчера работало")
                .clickSearchButton()
                .openProductPage()
                .selectProductColor()
                .selectProductSize()
                .addProductToOrder()
                .openCardPage()
                .cardButton();
        Assert.assertTrue(CardResult, "FAILED TEST");
    }

    @Test
    public void clearCard() {
        boolean ClearCardSuccess = new ZnwrHomePage(driver)
                .openPage()
                .openSearchPage()
                .searchInput("Вчера работало")
                .clickSearchButton()
                .openProductPage()
                .selectProductColor()
                .selectProductSize()
                .addProductToOrder()
                .openCardPage()
                .clickButtonClear()
                .cardIsNotSelect();
        Assert.assertFalse(ClearCardSuccess);
    }

    @Test
    public void addAnotherSize(){
        boolean AnotherSize = new ZnwrHomePage(driver)
                .openPage()
                .openSearchPage()
                .searchInput("Вчера работало")
                .clickSearchButton()
                .openProductPage()
                .selectProductColor()
                .selectProductSize()
                .addProductToOrder()
                .openCardPage()
                .clickToProduct()
                .selectProductSize()
                .addProductToOrder()
                .openCardPage()
                .newProductisEnable();
        Assert.assertTrue(AnotherSize);
    }
}
