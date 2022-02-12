import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EjecucionAutomatica {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }

    @Before
    public void Configuracion(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,5);
        driver.manage().window().maximize();
        driver.get("C:\\Users\\home\\OneDrive\\Escritorio\\Nueva carpeta\\index.html");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void click(){
        driver.findElement(By.xpath("//a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void cerrarNavegador(){
        driver.quit();
    }
}
