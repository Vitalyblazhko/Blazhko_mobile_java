import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void testLogin(){
        clickLogInButton();
        fillLoginForm("elena.telran@yahoo.com", "12345.com");
        confirmLogIn();


    }

    private void confirmLogIn() {
        driver.findElement(By.id("authenticate")).click();
    }

    private void fillLoginForm(String userName, String password) {
        type(By.id("user"), userName);
        type(By.id("password"), password);

    }

    private void type(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    private void clickLogInButton() {
        driver.findElement(By.id("log_in_button")).click();
    }



}
