package PagefactoryStepDef;

import Pagefactory.LetsKodeIt;
import common.CommonAPI;
import common.CommonInstances;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.AssertsEnabled;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LetsKodeItStepDef extends CommonAPI {
    static WebDriver driver;
    static CommonAPI api;
    LetsKodeIt letsKodeIt;
    @Given("^the user navigates to LetsKodeit practice page$")
    public void the_user_navigates_to_LetsKodeit_practice_page() throws Throwable {
        api = new CommonAPI();
        driver = api.initialize("chrome");
        letsKodeIt = new LetsKodeIt(driver);
        driver.get(CommonInstances.LETSKODEITURL);
    }

    /*@Then("^the user lands on the page check Practice Page header title is visible\\.$")
    public void the_user_lands_on_the_page_check_Practice_Page_header_title_is_visible() throws Throwable {
        WebElement PracticeTitle = letsKodeIt.getLKT_PracticePage_Page_Title();
        Assert.assertTrue(PracticeTitle.isDisplayed());
        System.out.println("The title of the page is " + PracticeTitle.getText());
        Thread.sleep(1000);
    }

    @Then("^the user is displayed the header dashboard$")
    public void the_user_is_displayed_the_header_dashboard() throws Throwable {
        WebElement Dashboard = letsKodeIt.getLKT_DashBoard();
        boolean value = Dashboard.isDisplayed();
        Assert.assertTrue(value);
        Thread.sleep(1000);
    }

    @Then("^the user is able to see Practice Menu$")
    public void the_user_is_able_to_see_Practice_Menu() throws Throwable {
        WebElement PracticeMenu = letsKodeIt.getLKT_PracticeMenu();
        boolean value = PracticeMenu.isDisplayed();
        Assert.assertTrue(value);
    }

    @Then("^the user is able to see Login Menu$")
    public void the_user_is_able_to_see_Login_Menu() throws Throwable {
        Assert.assertTrue(letsKodeIt.getLKT_LoginMenu().isDisplayed());
        Thread.sleep(1000);
    }

    @Then("^the user is able to see SignUp Button$")
    public void the_user_is_able_to_see_SignUp_Button() throws Throwable {
        Assert.assertTrue(letsKodeIt.getLKT_SignUp_Button().isDisplayed());
        Thread.sleep(1000);
    }


    @Then("^the user close the browser$")
    public void theUserCloseTheBrowser() throws Throwable {
        driver.close();
    }*/

    /*@Then("^the user Radio Button Example Section Title should be visible$")
    public void the_user_Radio_Button_Example_Section_Title_should_be_visible() throws Throwable {
        letsKodeIt.checkRadioButtonSectionTitleVisible();
        Thread.sleep(1000);
    }

    @Then("^the user should be displayed BMW radio button$")
    public void the_user_should_be_displayed_BMW_radio_button() throws Throwable {
        letsKodeIt.checkRadioButtonBMWVisible();
        Thread.sleep(1000);
    }
*/
    @Then("^user clicks on BMW radio button$")
    public void user_clicks_on_BMW_radio_button() throws Throwable {
        api.clickIfVisible(letsKodeIt.getLKT_RadioButton_BMW());
        WebElement element = letsKodeIt.getLKT_RadioButton_BMW();
        System.out.println("String output" + element.toString());
    }

   /* @Then("^the user should be displayed Benz radio button$")
    public void the_user_should_be_displayed_Benz_radio_button() throws Throwable {
        letsKodeIt.checkRadioButtonBenzVisible();
        Thread.sleep(1000);
    }

    @Then("^user clicks on Benz radio button$")
    public void user_clicks_on_Benz_radio_button() throws Throwable {
        letsKodeIt.clickOnBenzRadioButton();
        Thread.sleep(1000);
    }

    @Then("^the user should be displayed Honda radio button$")
    public void the_user_should_be_displayed_Honda_radio_button() throws Throwable {
        letsKodeIt.checkRadioButtonHondaVisible();
        Thread.sleep(1000);
    }

    @Then("^user clicks on Honda radio button$")
    public void user_clicks_on_Honda_radio_button() throws Throwable {
       letsKodeIt.clickOnHondaRadioButton();
        Thread.sleep(1000);
    }*/

    @Then("^I am able to select \"([^\"]*)\" from the drop down menu$")
    public void iAmAbleToSelectFromTheDropDownMenu(String arg0) throws Throwable {
        api.selectFromDropDownMenu(letsKodeIt.getLKT_Car_DropDown_Menu(),arg0);

    }

    /*@Then("^I am able to select 'Honda' from the drop down menu$")
    public void iAmAbleToSelectHondaFromTheDropDownMenu() throws Throwable {
        letsKodeIt.selectHond   aFromDropDownMenu();
    }*/
}
