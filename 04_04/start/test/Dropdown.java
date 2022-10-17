import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\luz_m\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        WebElement autocompleteItem2 = driver.findElement(By.xpath("/html/body/div/div/div/a[2]"));
        autocompleteItem2.click();
/*
        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();*/

        driver.quit();
    }
}
