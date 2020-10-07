package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Year;

public class RegistrationPage {
    public RegistrationPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailTxtFld;

    @FindBy(xpath= "//*[@id=\"confirm-email\"]")
    WebElement confirmEmailTxtFld ;


    @FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement choosePasswordTxtFld;

    @FindBy(xpath= "//*[@id=\"confirm-password\"]")
    WebElement confirmPasswordTxtFld ;

    @FindBy(xpath = "//*[@id=\"title\"]")
    WebElement titleCkList;

    @FindBy(xpath= "//*[@id=\"first-name\"]")
    WebElement firstNameTxtFld ;

    @FindBy(xpath= "//*[@id=\"family-name\"]")
    WebElement lastNameTxtFld ;

    @FindBy(xpath= "//*[@id=\"combinedform\"]/div[4]/fieldset/div/label[1]/span")
    WebElement registrationTypeRdBtn ;

    @FindBy(xpath= "//*[@id=\"ecForm\"]/fieldset[1]/div/div/div[2]/fieldset/div/label[1]/span")
    WebElement addressTypeRdBtn ;

    @FindBy(xpath= "//*[@id=\"homeaddress1\"]")
    WebElement addressTxtFld ;

    @FindBy(xpath= "//*[@id=\"homecity\"]")
    WebElement townTxtFld ;

    @FindBy(xpath= "//*[@id=\"homecountryname\"]")
    WebElement countryTxtFld ;

    @FindBy(xpath= "//*[@id=\"birthday\"]")
    WebElement dateOfBirth ;
    @FindBy(xpath= "//*[@id=\"birthmonth\"]")
    WebElement monthOfBirth ;
    @FindBy(xpath= "//*[@id=\"birthyear\"]")
    WebElement yearOfBirth ;
    @FindBy(xpath= "//*[@id=\"form-ffFlag\"]/div/label[2]/span")
    WebElement genderRdBtn ;
    @FindBy(xpath= "//*[@id=\"pref_language\"]")
    WebElement languageTxtFld ;
    @FindBy(id= "termsAndConditions")
    WebElement termsAndCodt ;
    @FindBy(xpath= "//*[@id=\"submitButton\"]")
    WebElement joinNowBtn ;

    public void enterEmailId(String emailId)
    {
        emailTxtFld.sendKeys(emailId);
    }
    public void enterConfirmEmailId(String confirmEmailId)
    {
        confirmEmailTxtFld.sendKeys(confirmEmailId);
    }
    public void enterPassword(String password)
    {
        choosePasswordTxtFld.sendKeys(password);
    }
    public void enterConfirmPassword(String confirmPassword)
    {
        confirmPasswordTxtFld.sendKeys(confirmPassword);
    }
    public void selectTitleCkList(String title)
    {

        new Select(titleCkList).selectByVisibleText(title);
    }
    public void enterFirstName(String firstName)
    {
        firstNameTxtFld.sendKeys(firstName);
    }
    public void enterLastName(String lastName)
    {
        lastNameTxtFld.sendKeys(lastName);
    }
    public void chooseRegitnType(String regType)
    {

        registrationTypeRdBtn.click();
    }
    public void chooseAddressType(String addressType)
    {

        addressTypeRdBtn.click();
    }
    public void enterAddress(String address)
    {
        addressTxtFld.sendKeys(address);
    }
    public void enterTown(String town)
    {
        townTxtFld.sendKeys(town);
    }
    public void enterCountryTxtFld(String country )
    {

        new Select(countryTxtFld).selectByVisibleText(country);
    }
    public void chooseDateOfBirth(String date)
    {
       new Select(dateOfBirth).selectByVisibleText(date);
    }
    public void chooseMonthOfBirth(String month)
    {
       new Select(monthOfBirth).selectByVisibleText(month);
    }
    public void chooseYearOfBirth(String year)
    {

        new Select(yearOfBirth).selectByVisibleText(year);
    }
    public void chooseGender(String gender)
    {
        genderRdBtn.click();
    }
    public void chooseLanguage(String language)
    {
       new Select(languageTxtFld).selectByVisibleText(language);
    }
    public void clickTermsAndCon()
    {
        termsAndCodt.click();
    }
    public void clickJoinNow()
    {
        joinNowBtn.click();

    }
}

