import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {
    WebDriver driver;

    public void launch(){
        driver = new SafariDriver();
        driver.get("https://www.youtube.com/@martingarrix");
    }
    public static void main(String[] args) {

        Main obj = new Main();
        obj.launch();
    }
}
