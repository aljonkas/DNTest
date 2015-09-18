
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.BaseConfig;
import pages.MainPage;


public class TestBusiness extends BaseConfig {
    private MainPage mpage;


    @Test
    public void testBusiness(){
        mpage = new MainPage(driver);
        mpage.EnterDataInRegForm();
        mpage.ClickBusiness();
        mpage.EnterLoginDetails();
        driver.switchTo().alert();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert message: " + alertText);
        alert.accept();
    }
}

