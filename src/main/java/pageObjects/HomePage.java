package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id=\"content\"]/div[3]/div/header/section/div[1]/a[1]")
    WebElement logo;

    @FindBy(xpath="//*[@id=\"ap-register-button\"]")
    WebElement RegisterNowBtn;

    //public void validateLogo()
    //{
      //  Assert.assertTrue(logo.isDisplayed());
//    }
    public void clickRegistrationBtn()
    {
        RegisterNowBtn.click();
    }
}
