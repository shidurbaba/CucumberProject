package Pagefactory;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LetsKodeIt extends CommonAPI {

    public WebElement getLKT_PracticePage_Page_Title() {
        return LKT_PracticePage_Page_Title;
    }

    public WebElement getLKT_PracticeMenu() {
        return LKT_PracticeMenu;
    }

    public WebElement getLKT_LoginMenu() {
        return LKT_LoginMenu;
    }

    public WebElement getLKT_SignUp_Button() {
        return LKT_SignUp_Button;
    }

    public WebElement getLKT_DashBoard() {
        return LKT_DashBoard;
    }

    public WebElement getLKT_RadioButton_Section_Title() {
        return LKT_RadioButton_Section_Title;
    }

    public WebElement getLKT_RadioButton_BMW() {
        return LKT_RadioButton_BMW;
    }

    public WebElement getLKT_RadionButton_Benz() {
        return LKT_RadionButton_Benz;
    }

    public WebElement getLKT_RadioButton_Honda() {
        return LKT_RadioButton_Honda;
    }
    public WebElement getLKT_Select_Car_Dropdown_menu() {
        return LKT_Select_Car_Dropdown_menu;
    }

    public WebElement getLKT_Car_DropDown_Menu() {
        return LKT_Car_DropDown_Menu;
    }

    @FindBy(how = How.ID, using = "carselect")
    WebElement LKT_Car_DropDown_Menu;

    @FindBy(how = How.XPATH, using = "//div[@class='collapse navbar-collapse navbar-header-collapse']")
    WebElement LKT_DashBoard;

    @FindBy(how = How.XPATH, using = "//h1[text()='Practice Page']")
    WebElement LKT_PracticePage_Page_Title;

    @FindBy(how = How.XPATH, using = "//a[@href='/pages/practice']")
    WebElement LKT_PracticeMenu;

    @FindBy(how = How.XPATH, using = "//a[@href='/sign_in']")
    WebElement LKT_LoginMenu;

    @FindBy (how = How.XPATH, using = "//a[@href='/sign_up']")
    WebElement LKT_SignUp_Button;

    @FindBy(how = How.XPATH, using = "//legend[.='Radio Button Example']")
    WebElement LKT_RadioButton_Section_Title;

    @FindBy(how = How.XPATH, using = "//input[@id='bmwradio']")
    WebElement LKT_RadioButton_BMW;

    @FindBy(how = How.ID, using = "//input[@id='bmwradio']")
    WebElement LKT_RadionButton_Benz;

    @FindBy(how = How.ID, using = "hondaradio")
    WebElement LKT_RadioButton_Honda;

    @FindBy(how = How.ID, using = "carselect")
    WebElement LKT_Select_Car_Dropdown_menu;


    @FindBy (how = How.XPATH, using = "//*[@id='carselect']/option[2]")
    WebElement LKT_Select_Car_Honda;

    public LetsKodeIt(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

/*    public enum LetsKodeit {
        LKT_RadioButton_Section_Title(By.xpath("//legend[.='Radio Button Example']")),
        LKT_RadioButton_BMW(By.xpath("//input[@id='bmwradio']")),
        LKT_RadioButton_Benz(By.xpath("//input[@id='benzradio']")),
        LKT_RadioButton_Honda(By.xpath("//input[@id='hondaradio']"));

        private By locator;

        private LetsKodeit(By locator) {
            this.locator = locator;
        }
    }

    WebElement RadioButton_Section_Title = getElementSafely(LetsKodeit.LKT_RadioButton_Section_Title.locator);
    WebElement RadioButton_BMW = getElementSafely(LetsKodeit.LKT_RadioButton_BMW.locator);
    WebElement RadioButton_Benz = getElementSafely(LetsKodeit.LKT_RadioButton_Benz.locator);
    WebElement RadioButton_Honda = getElementSafely(LetsKodeit.LKT_RadioButton_Honda.locator);

    public void checkRadioButtonSectionTitleVisible(){
        RadioButton_Section_Title.isDisplayed();
    }*/
  /*  public void checkRadioButtonBMWVisible(){
        RadioButton_BMW.isDisplayed();
    }

    public void checkRadioButtonBenzVisible(){
        RadioButton_Benz.isDisplayed();
    }
    public void checkRadioButtonHondaVisible(){
        RadioButton_Honda.isDisplayed();
    }

    public void clickOnBMWRadioButton(){
        clickRadioButton(RadioButton_BMW);
    }

    public void clickOnBenzRadioButton(){
        clickRadioButton(RadioButton_Benz);
    }

    public void clickOnHondaRadioButton(){
        clickRadioButton(RadioButton_Honda);
    }*/
    public void selectHondaFromDropDownMenu() throws InterruptedException {
        clickAndHold(LKT_Select_Car_Dropdown_menu);
        LKT_Select_Car_Honda.click();
    }

}
