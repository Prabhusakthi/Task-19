package Task19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaleeswari\\eclipse-workspace\\Task19\\src\\main\\java\\Task19\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
try {
            // Open the Guvi registration page
            driver.get("https://www.guvi.in/register");
            driver.manage().timeouts().implicitlyWait(300, java.util.concurrent.TimeUnit.SECONDS);

            // Locate an element by ID (assuming the ID of the 'Register' button is 'registerButton')
            WebElement elementById = driver.findElement(By.id("registerButton"));
            System.out.println("Element located by ID: " + elementById.getText());

            // Locate an element by class name (assuming the class name of a field is 'inputField')
            WebElement elementByClassName = driver.findElement(By.className("inputField"));
            System.out.println("Element located by class name: " + elementByClassName.getAttribute("name"));

            // Locate an element by tag name (assuming you want to locate an <input> tag)
            WebElement elementByTagName = driver.findElement(By.tagName("input")); // May need to specify index or more details
            System.out.println("Element located by tag name: " + elementByTagName.getAttribute("placeholder"));

            // Locate an element by CSS selector (assuming the selector for a button is '.submit-button')
            WebElement elementByCssSelector = driver.findElement(By.cssSelector(".submit-button"));
            System.out.println("Element located by CSS selector: " + elementByCssSelector.getText());

            // Locate an element by XPath (assuming you are targeting an input field for 'Email' with placeholder 'Email')
            WebElement elementByXPath = driver.findElement(By.xpath("//input[@placeholder='Email']"));
            System.out.println("Element located by XPath: " + elementByXPath.getAttribute("name"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver
            driver.quit();
        }
    }
}



