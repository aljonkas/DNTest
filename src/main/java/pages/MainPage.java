package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class MainPage extends BaseConfig{
    private WebDriver driver;

    public static final String ENTER_FNAME = "test";
    public static final String ENTER_LNAME = "test";
    public static final String ENTER_ADDRESS = "test str.";
    public static final String ENTER_CITY = "test";
    public static final String ENTER_PCODE = "0000";

    public static final String ENTER_STATE = "Vienna";
    public static final String ENTER_PNUMBER = "000000000";
    public static final String ENTER_EMAIL = "test@gmail.com";

    public static final String ENTER_BNAME = "test";
    public static final String ENTER_BNUMBER = "test";

    public static final String ENTER_USERNAME = "test";
    public static final String ENTER_PASSW = "test";


    @FindBy(name = "first_name")
    WebElement firstName;
    @FindBy(name = "last_name")
    WebElement lastName;
    @FindBy(name = "address")
    WebElement address;
    @FindBy(name = "city")
    WebElement city;
    @FindBy(name = "post_code")
    WebElement postCode;
    @FindBy(xpath = ".//*[@id='state']//input")
    WebElement state;

    @FindBy(id = "phone_number")
    WebElement phoneNumber;
    @FindBy(name = "email")
    WebElement emailAdress;
    @FindBy(id = "account_type_personal")
    WebElement userTypeP;

    @FindBy(id = "account_type_business")
    WebElement userTypeB;
    @FindBy(id = "business")
    WebElement businessName;
    @FindBy(id = "business_number_element")
    WebElement businessNumber;

    @FindBy(name = "username")
    WebElement username;
    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "(//input[@name='Submit'])[2]")
    WebElement continueOrder;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void EnterDataInRegForm() {
        firstName.sendKeys(ENTER_FNAME);
        lastName.sendKeys(ENTER_LNAME);
        address.sendKeys(ENTER_ADDRESS);
        city.sendKeys(ENTER_CITY);
        postCode.sendKeys(ENTER_PCODE);
        Select country = new Select(driver.findElement(By.id("country_name")));
        country.selectByValue("AT");
        state.sendKeys(ENTER_STATE);
        phoneNumber.sendKeys(ENTER_PNUMBER);
        emailAdress.sendKeys(ENTER_EMAIL);
    }

    public void ClickPersonal() {
        userTypeP.click();
    }

    public void ClickBusiness() {
        userTypeB.click();
        businessName.sendKeys(ENTER_BNAME);
        businessNumber.sendKeys(ENTER_BNUMBER);
    }

    public void EnterLoginDetails() {
        username.sendKeys(ENTER_USERNAME);
        password.sendKeys(ENTER_PASSW);
        continueOrder.click();
    }


}
