package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZnwrCatalogPage extends AbstractPage {
    @FindBy(xpath = "//button[@id='catalog__options-sort-btn']")
    private WebElement sortButtonLocator;

    @FindBy(xpath = "//div[@id='catalog__options-sort-content']//a[@href='?sort=PriceAsc']")
    private WebElement lowPriceLocator;

    @FindBy(xpath = "//button[@id='catalog__options-sort-btn']/span[@class='catalog__options-sort-btn-span-2']")
    private WebElement lowLocator;

    public ZnwrCatalogPage(WebDriver driver) {
        super(driver);
    }

    public ZnwrCatalogPage clickSortButton(){
        sortButtonLocator.click();
        return this;
    }

    public ZnwrCatalogPage selectKindOfSort(){
        lowPriceLocator.click();
        return this;
    }

    public boolean clickSelectedSort(){
        WebElement low = lowLocator;
        return low.isDisplayed();
    }


}
