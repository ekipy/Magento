package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  {
    WebDriver driver;

    By naviBar = By.cssSelector("span[data-action='toggle-nav']");
    By tabAccount = By.cssSelector("div[class='section-item-title nav-sections-item-title active']");
    By createdAccount = By.cssSelector("a[href='https://magento.softwaretestingboard.com/customer/account/create/']");
    By verifyRegisterPage = By.cssSelector("span.base[data-ui-id='page-title-wrapper']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomepage() {
        driver.get("https://magento.softwaretestingboard.com/");
    }

    public void clickOnNaviBar() {
        driver.findElement(naviBar).click();
    }

    public void clickOnAccountTab() {
        driver.findElement(tabAccount).click();
    }

    public void clickOnCreateAccount() {
        driver.findElement(createdAccount).click();
    }

    public String getRegisterPageTitle() {
        return driver.findElement(verifyRegisterPage).getText();
    }
}
