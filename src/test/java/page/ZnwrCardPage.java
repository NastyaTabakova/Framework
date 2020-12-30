package page;

import model.UserData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZnwrCardPage extends AbstractPage
{
    @FindBy(xpath = "//a[@class='header__cart-btn']")
    private WebElement cardLocator;

    @FindBy(xpath = "//div[@class='checkout__cart-item-total-delete--desktop']/button")
    private WebElement clearButtonLocator;

    @FindBy (xpath = "//div[@class='checkout__cart-item-title']/a")
    private WebElement productLocator;

    @FindBy (xpath = "//*[@id='checkout__elm']//div[@class='checkout__cart-item-param']")
    private WebElement productSizeLocator;

    @FindBy (xpath = "//form[@id='checkout__main-form']")
    private WebElement formCheckoutLocator;

    @FindBy (xpath = "//form[@id='checkout__main-form']//div[@class='checkout__bottom-btn-wrapper']/button")
    private WebElement checkoutButtonLocator;

    @FindBy (xpath = "//div[@class='checkout__address-block is-house']//input")
    private WebElement inputHouseLocator;

    @FindBy(xpath = "//div[@class='checkout__address-block is-street']//input")
    private WebElement inputStreetLocator;

    @FindBy(xpath = "//div[@class='checkout__address-block is-apartment']//input")
    private WebElement inputApartmentLocator;

    @FindBy(xpath = "//div[@class='checkout__address-block is-post-code']//input")
    private WebElement inputIndexLocator;

    @FindBy(xpath = "//div[@class='checkout__detail-form-group']//input[@type='text']")
    private WebElement inputName;

    @FindBy(xpath = "//div[@class='checkout__detail-form-group']//input[@type='tel']")
    private WebElement inputPhone;

    @FindBy(xpath = "//div[@class='checkout__detail-form-group']//input[@type='email']")
    private WebElement inputMail;

    @FindBy(xpath = "//div[@class='checkout__alert is-active']")
    private WebElement noCorrectInput;

    @FindBy(xpath = "//div[@class='checkout__ds-row']//input")
    private WebElement discountInputLocator;

    @FindBy (xpath = "//div[@class='checkout__ds-row']//button")
    private WebElement discountButtonLocator;

    @FindBy(xpath = "//div[@class='checkout__ds-message--warning']")
    private WebElement discountWarningMessage;

    @FindBy(xpath = "//div[@class='checkout__promocode-row']//input")
    private WebElement promoInputLocator;

    @FindBy(xpath = "//div[@class='checkout__promocode-row']//button")
    private WebElement promoButtonLocator;

    @FindBy(xpath = "//div[@class='checkout__promocode-message--warning']")
    private WebElement promoWarningMessage;

    public ZnwrCardPage(WebDriver driver)
    {
        super(driver);
    }

    public boolean cardButton(){
        WebElement card=cardLocator;
        return card.isEnabled();
    }

     public ZnwrHomePage clickButtonClear(){
        WebElement clear = fluentWaitForElementToBeClickable(driver,clearButtonLocator);
        clear.click();
        return new ZnwrHomePage(driver);
    }

    public  ZnwrProductPage clickToProduct(){
        productLocator.click();
        return new ZnwrProductPage(driver);
    }

    public boolean newProductisEnable(){
        WebElement size = productSizeLocator;
        return size.isEnabled();
    }

    public ZnwrCardPage clickCheckoutButton(){
        WebElement button = fluentWaitForElementLocatedBy(driver, checkoutButtonLocator);
        button.click();
        return this;
    }

    public boolean noCheckProduct(){
        WebElement formCheck= formCheckoutLocator;
        return formCheck.isDisplayed();
    }

    public ZnwrCardPage inputData(UserData testData){
        inputHouseLocator.sendKeys(testData.getHouse());
        inputStreetLocator.sendKeys(testData.getStreet());
        inputApartmentLocator.sendKeys(testData.getApartment());
        inputIndexLocator.sendKeys(testData.getIndex());
        inputName.sendKeys(testData.getName());
        return this;
    }

    public ZnwrCardPage inputEmail(String mail){
        inputMail.sendKeys(mail);
        return this;
    }

    public boolean noCheckWindow(){
        WebElement window = fluentWaitForElementLocatedBy(driver, noCorrectInput);
        return window.isDisplayed();
    }

    public ZnwrCardPage inputNumber(String number){
        WebElement input = fluentWaitForElementLocatedBy(driver,discountInputLocator);
        input.sendKeys(number);
        return this;
    }

    public ZnwrCardPage clickDiscountButton(){
        discountButtonLocator.click();
        return this;
    }

    public boolean displayedInfo(){
        WebElement message = fluentWaitForElementLocatedBy(driver, discountWarningMessage);
        return message.isDisplayed();
    }

    public ZnwrCardPage inputPromoCode(String code){
        promoInputLocator.sendKeys(code);
        return this;
    }

    public ZnwrCardPage clickPromoButton(){
        promoButtonLocator.click();
        return this;
    }

    public boolean displayInfo(){
        WebElement warning = fluentWaitForElementLocatedBy(driver,promoWarningMessage);
        return warning.isDisplayed();
    }
}
