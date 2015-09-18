import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.BaseConfig;
import pages.MainPage;


public class TestPersonal extends BaseConfig {
    private MainPage mpage;


    @Test
    public void testPersonal(){
        mpage = new MainPage(driver);
        mpage.EnterDataInRegForm();
        mpage.ClickPersonal();
        mpage.EnterLoginDetails();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert message: " + alertText);
        alert.accept();

    }

}
