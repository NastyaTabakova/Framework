package test;

import org.testng.Assert;;
import org.testng.annotations.Test;
import page.ZnwrHomePage;

public class SaleCheckoutTest extends CommonConditions{

    @Test
    public void discountSystem() {
        boolean isDisplaySale = new ZnwrHomePage(driver)
                .openPage()
                .openSearchPage()
                .searchInput("Вчера работало")
                .clickSearchButton()
                .openProductPage()
                .selectProductColor()
                .selectProductSize()
                .addProductToOrder()
                .openCardPage()
                .inputNumber("+375445552669")
                .clickDiscountButton()
                .displayedInfo();
        Assert.assertTrue(isDisplaySale);
    }

    @Test
    public void promoCodeUsed() {
        boolean isDisplaySale = new ZnwrHomePage(driver)
                .openPage()
                .openSearchPage()
                .searchInput("Вчера работало")
                .clickSearchButton()
                .openProductPage()
                .selectProductColor()
                .selectProductSize()
                .addProductToOrder()
                .openCardPage()
                .inputPromoCode("5555")
                .clickPromoButton()
                .displayInfo();
        Assert.assertTrue(isDisplaySale);
    }
}
