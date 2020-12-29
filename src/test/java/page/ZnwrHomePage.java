package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZnwrHomePage extends AbstractPage {
    @FindBy(id = "header__search-btn")
    private WebElement searchClickLocator;

    @FindBy(xpath = "//a[@class='header__cart-btn']")
    private WebElement cardLocator;

    @FindBy (xpath = "//div[@id='home__start-item-1']//div[@class='home__start-link-wrap']/a")
    private WebElement sectionLocator;

    public ZnwrHomePage(WebDriver driver) {
        super(driver);
    }

    public ZnwrHomePage openPage() {
        driver.get("https://znwr.ru");
        return this;
    }

    public ZnwrSeachPage openSearchPage() {
        searchClickLocator.click();
        return new ZnwrSeachPage(driver);
    }

    public boolean cardIsNotSelect() {
        WebElement Card = cardLocator;
        return Card.isSelected();
    }

    public ZnwrCatalogPage selectSection(){
        sectionLocator.click();
        return new ZnwrCatalogPage(driver);
    }
}
