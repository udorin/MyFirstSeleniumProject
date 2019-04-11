import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) {

        searchItem();



    }

    public static void sleep(int sleep){
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public  static void searchItem(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#search")).sendKeys("Jacket");
        driver.findElement(By.cssSelector("#search_mini_form > div.input-box > button")).click();
        driver.close();


    }

    public static void searchItemAndSort(){
        System.setProperty("webdriver.chrome.driver","resources2/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#search")).sendKeys("Ring");
        driver.findElement(By.cssSelector("#search_mini_form > div.input-box > button")).click();

        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar > div.sorter > div > select")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/select/option[3]")).click();
        driver.close();


    }

    public static void searchUsingMenu(){
        System.setProperty("webdriver.chrome.driver","resources2/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[3]/a"));
        action.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[3]/ul/li[3]/a")).click();
        driver.findElement(By.cssSelector("#narrow-by-list > dd:nth-child(4) > ol > li:nth-child(3) > a > span.count")).click();

        driver.close();












    }
}
