package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    public HomePage(){}

    @FindBy(id="signin_button")
    private WebElement loginButton;

    public void clickElement() {
        loginButton.click();

    }

}
