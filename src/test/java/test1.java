import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://sharelane.com/");

        WebElement enter = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[20]/td/p/a/b"));
        enter.click();


        WebElement singUp = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));

        singUp.click();


        WebElement zipCodeField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        zipCodeField.sendKeys("111111");

        WebElement clickContinue = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));

        clickContinue.click();

        WebElement firstName = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        firstName.sendKeys("dddddd");
        WebElement lastName = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        lastName.sendKeys( "dddddd");
        WebElement eMail = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        eMail.sendKeys("dddddd@gmail.com");
        WebElement pss = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        pss.sendKeys("dddddd");
        WebElement confPss = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        confPss.sendKeys("dddddd");
        WebElement confm = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));
        confm.click();

        WebElement ac = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));

        try{
            Assert.assertEquals( "Account is created!",ac.getText());
        }
       catch (Exception ex){
            
       }

        Thread.sleep(5000);


        driver.close();

        driver.quit();


    }
}
