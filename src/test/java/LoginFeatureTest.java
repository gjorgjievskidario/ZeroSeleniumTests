import Pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFeatureTest {
    private static final WebDriver driver = new ChromeDriver();
   static  HomePage homePage = new HomePage();


    @Test
    public void successfulLoginTest(){
        driver.get("http://zero.webappsecurity.com/index.html");
        homePage.clickElement();






        driver.quit();
    }

}
