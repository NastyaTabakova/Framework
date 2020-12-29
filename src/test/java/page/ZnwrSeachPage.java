package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZnwrSeachPage extends AbstractPage
{
    @FindBy(xpath = "//div[@class='catalog__search']//input")
    private WebElement searchInputLocator;

    @FindBy(xpath = "//div[@class='catalog__search']//button")
    private WebElement searchButtonLocator;

    @FindBy(xpath = "//div[@class='card__content']//a")
    private WebElement productLocator;

    @FindBy(xpath = "//div[ @class='catalog__search-no-found']")
    private WebElement noFoundResultLocator;

    @FindBy (xpath = "//div[@id='catalog']//h1")
    private WebElement foundResultLocator;

    public ZnwrSeachPage(WebDriver driver) {
        super(driver);
    }

    public ZnwrSeachPage searchInput(String inputRequest) {
        searchInputLocator.sendKeys(inputRequest);
        return this;
    }

    public ZnwrSeachPage clickSearchButton() {
        searchButtonLocator.click();
        return this;
    }

    public ZnwrProductPage openProductPage() {
        productLocator.click();
        return new ZnwrProductPage(driver);
    }

    public String noCorrectRequestResult(){
        WebElement result = noFoundResultLocator;
        return result.getText();
    }

    public boolean isFindResult(){
        WebElement foundResult = fluentWaitForElementLocatedBy(driver, foundResultLocator);
        return foundResult.isEnabled();
    }
}
