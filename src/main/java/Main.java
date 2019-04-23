import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {


        tryLoginI();



}










    public static void sleep(int sleep){
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void createAccount1() {
        //Password to short

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("a[href*=\"account\"] .label")).click();
        driver.findElement(By.cssSelector("a[title=\"Register\"]")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Johny");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("test");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("chris");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("test12@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("test");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("test");
        driver.findElement(By.cssSelector("button[title=\"Register\"]")).click();

        driver.quit();



    }


    public  static void createAccount2() {

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("a[href*=\"account\"] .label")).click();
        driver.findElement(By.cssSelector("a[title=\"Register\"]")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Johny");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("test");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("chris");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("test12@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("test1212");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("test1212");
        driver.findElement(By.cssSelector("button[title=\"Register\"]")).click();

        driver.quit();



    }



    public static void createAccount3() {
        //create account without first name


        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("a[href*=\"account\"] .label")).click();
        driver.findElement(By.cssSelector("a[title=\"Register\"]")).click();

        driver.findElement(By.cssSelector("#middlename")).sendKeys("test");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("chris");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("test12@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("test1212");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("test1212");
        driver.findElement(By.cssSelector("button[title=\"Register\"]")).click();

        driver.quit();



    }







    public static void searchItemCssSelector(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement(By.cssSelector("#search")).sendKeys("Jacket");
        driver.findElement(By.cssSelector("div.input-box button")).click();
        driver.close();

    }


    public static void searchItemAndSort(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#search")).sendKeys("Ring");
        driver.findElement(By.cssSelector("div.input-box button")).click();

        driver.findElement(By.cssSelector("select[title=\"Sort By\"] option[value*=\"name\"]")).click();



        driver.quit();






    }







    public static void searchUsingMenu(){


        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement element = driver.findElement(By.cssSelector("a[href*=\"home-decor.html\"]"));
        action.moveToElement(element).build().perform();
        driver.findElement(By.cssSelector("a[href*=\"decor/books\"]")).click();
        driver.quit();


















    }



    public  static void addProductCart(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("a[href*=\"lafayette\"]")).click();
        driver.findElement(By.cssSelector("img[src*=\"blue\"]")).click();
        driver.findElement(By.cssSelector("#swatch72")).click();


        driver.findElement(By.cssSelector(".add-to-cart-buttons button[title=\"Add to Cart\"]")).click();
        driver.quit();










    }



    public static void removeProductCart(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("a[href*=\"lafayette\"]")).click();
        driver.findElement(By.cssSelector("img[src*=\"blue\"]")).click();
        driver.findElement(By.cssSelector("#swatch72")).click();


        driver.findElement(By.cssSelector(".add-to-cart-buttons button[title=\"Add to Cart\"]")).click();
        driver.findElement(By.cssSelector("td.product-cart-remove a[title=\"Remove Item\"]")).click();
        driver.quit();




    }


    public static void changeQuantityCart(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("a[href*=\"lafayette\"]")).click();
        driver.findElement(By.cssSelector("img[src*=\"blue\"]")).click();
        driver.findElement(By.cssSelector("#swatch72")).click();


        driver.findElement(By.cssSelector(".add-to-cart-buttons button[title=\"Add to Cart\"]")).click();

        driver.findElement(By.cssSelector("input[title=\"Qty\"]")).clear();
        driver.findElement(By.cssSelector("input[title=\"Qty\"]")).sendKeys("2");
        driver.findElement(By.cssSelector("button[title=\"Update\"]")).click();
        driver.close();




    }


    public static void tryLoginI(){
        //try login with invalid username and password

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector(".account-cart-wrapper > a")).click();
        driver.findElement(By.cssSelector("a[title=\"Log In\"]")).click();
        driver.findElement(By.cssSelector("input[title=\"Email Address\"]")).sendKeys("test@exemple.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("test");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.close();





    }











}
