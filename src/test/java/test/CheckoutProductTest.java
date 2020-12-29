package test;

import model.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ZnwrHomePage;
import service.UserDataCreator;

public class CheckoutProductTest extends CommonConditions {

    @Test
    public void checkoutWithoutData(){
        boolean noCheckout = new ZnwrHomePage(driver)
                .openPage()
                .openSearchPage()
                .searchInput("Вчера работало")
                .clickSearchButton()
                .openProductPage()
                .selectProductColor()
                .selectProductSize()
                .addProductToOrder()
                .openCardPage()
                .clickCheckoutButton()
                .noCheckProduct();
        Assert.assertTrue(noCheckout);
    }

    @Test
    public void checkoutWithNoCorrectData(){
        UserData testUserData = UserDataCreator.withCredentialsFromProperty();
        boolean noCheckProduct = new ZnwrHomePage(driver)
                .openPage()
                .openSearchPage()
                .searchInput("Вчера работало")
                .clickSearchButton()
                .openProductPage()
                .selectProductColor()
                .selectProductSize()
                .addProductToOrder()
                .openCardPage()
                .inputData(testUserData)
                .inputEmail("sdasd@test.by")
                .clickCheckoutButton()
                .noCheckWindow();
        Assert.assertTrue(noCheckProduct);
    }

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
