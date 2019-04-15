import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) {





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
        System.setProperty("webdriver.chrome.driver","resources1/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#search")).sendKeys("Ring");
        driver.findElement(By.cssSelector("#search_mini_form > div.input-box > button")).click();

        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar > div.sorter > div > select")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/select/option[3]")).click();
        driver.close();


    }

    public static void searchUsingMenu(){
        System.setProperty("webdriver.chrome.driver","resources1/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[3]/a"));
        action.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[3]/ul/li[3]/a")).click();
        driver.findElement(By.cssSelector("#narrow-by-list > dd:nth-child(4) > ol > li:nth-child(3) > a > span.count")).click();

        driver.close();












    }


    public  static void addProductCart(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(3) > div > h3 > a")).click();
        driver.findElement(By.xpath("//*[@id=\"swatch27\"]/span[1]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"swatch74\"]/span[1]")).click();


        driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[3]/div[6]/div[2]/div[2]/button/span/span")).click();


        driver.close();







    }

    public static void removeProductCart(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(3) > div > h3 > a")).click();
        driver.findElement(By.xpath("//*[@id=\"swatch27\"]/span[1]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"swatch74\"]/span[1]")).click();


        driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[3]/div[6]/div[2]/div[2]/button/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[6]/a")).click();
        sleep(10000);


        driver.close();

    }

    public static void changeQuantityCart(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(3) > div > h3 > a")).click();
        driver.findElement(By.xpath("//*[@id=\"swatch27\"]/span[1]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"swatch74\"]/span[1]")).click();


        driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[3]/div[6]/div[2]/div[2]/button/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[4]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[4]/input")).sendKeys("2");
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[4]/button/span/span")).click();



        driver.close();
    }

    public static void tryLoginI(){
        //try login with invalid username and password

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@exemple.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"send2\"]/span/span")).click();
        driver.close();





    }

    public static void createAccount(){
        //try create account
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();

        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("John");
        driver.findElement(By.xpath("//*[@id=\"middlename\"]")).sendKeys("Andrew");
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Andrew");
        driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("test12345");
        driver.findElement(By.xpath("//*[@id=\"confirmation\"]")).sendKeys("test12345");




        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span")).click();
        driver.close();
    }








}
