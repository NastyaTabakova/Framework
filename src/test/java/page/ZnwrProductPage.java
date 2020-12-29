package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZnwrProductPage extends AbstractPage {
    @FindBy(xpath = "//a[@title='Черный']")
    private WebElement selectProductColorLocator;

    @FindBy(xpath = "//div[@data-variant-id='2']")
    private WebElement selectProductSizeLocator;

    @FindBy(xpath = "//button[@id='product__add-cart-btn']")
    private WebElement addProductToOrderLocator;

    @FindBy(xpath = "//div[@class='product__success-modal-btn']//a ")
    private WebElement orderLocator;

    public ZnwrProductPage(WebDriver driver) {
        super(driver);
    }

    public ZnwrProductPage selectProductColor() {
        selectProductColorLocator.click();
        return this;
    }

    public ZnwrProductPage selectProductSize() {
        selectProductSizeLocator.click();
        return this;
    }

    public ZnwrProductPage addProductToOrder() {
        addProductToOrderLocator.click();
        return this;
    }

    public ZnwrCardPage openCardPage() {
        orderLocator.click();
        return new ZnwrCardPage(driver);
    }
}
