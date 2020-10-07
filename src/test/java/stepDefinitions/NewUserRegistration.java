package stepDefinitions;

import functionLibraries.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;

public class NewUserRegistration extends CommonFunctions{

    HomePage homePage = new HomePage(driver);
    RegistrationPage registrationPage=new RegistrationPage(driver);
    @Given("I'm on Homepage")
    public void i_m_on_homepage(){
        driver.get("https://www.britishairways.com");
       // driver.get(readPropertyFiles("url"));
       // wait(2);
      //  homePage.validateLogo();
        wait(2);
    }

    @When("I click register now button")
    public void i_click_register_now_button() {
homePage.clickRegistrationBtn();
    }
    @When("I could enter email address {string}")
    public void i_could_enter_email_address(String emailId) {
        registrationPage.enterEmailId(emailId);
    }
    @When("I could enter confirm email address {string}")
    public void i_could_enter_confirm_email_address(String confirmEmailId) {
registrationPage.enterConfirmEmailId(confirmEmailId);
    }
    @When("I could enter password {string}")
    public void i_could_enter_password(String password) {
registrationPage.enterPassword(password);
    }
    @When("I could enter confirm password {string}")
    public void i_could_enter_confirm_password(String confirmPassword) {
registrationPage.enterConfirmPassword(confirmPassword);
    }
    @When("I choose the title {string}")
    public void i_choose_the_title(String title) {
registrationPage.selectTitleCkList(title);
    }
    @When("I provide firstname {string} and lastname {string}")
    public void i_provide_firstname_and_lastname(String firstName, String lastName) {
registrationPage.enterFirstName(firstName);
registrationPage.enterLastName(lastName);
    }
    @When("I choose registration option {string}")
    public void i_choose_registration_option(String regType) {
registrationPage.chooseRegitnType(regType);
    }
    @When("I choose address type {string}")
    public void i_choose_address_type(String addressType) {
registrationPage.chooseAddressType(addressType);
    }
    @When("I provide address {string}")
    public void i_provide_address(String address) {
registrationPage.enterAddress(address);
    }
    @When("I could choose country\\/Region of Residence {string}")
    public void i_could_choose_country_region_of_residence(String country) {
registrationPage.enterCountryTxtFld(country);
    }
    @When("I could choose date of birth data as {string} month as {string} and year as {string}")
    public void i_could_choose_date_of_birth_data_as_month_as_and_year_as(String date, String month, String year) {
registrationPage.chooseDateOfBirth(date);
registrationPage.chooseMonthOfBirth(month);
registrationPage.chooseYearOfBirth(year);
    }
    @When("I could choose gender {string}")
    public void i_could_choose_gender(String gender) {
registrationPage.chooseGender(gender);
    }
    @When("I could choose preferred language {string}")
    public void i_could_choose_preferred_language(String language) {
registrationPage.chooseLanguage(language);
    }
    @When("I click Terms and conditions")
    public void i_click_terms_and_conditions() {
registrationPage.clickTermsAndCon();
    }
    @Then("I should able to register with the successful message {string}")
    public void i_should_able_to_register_with_the_successful_message(String string) {
registrationPage.clickJoinNow();
    }
}

