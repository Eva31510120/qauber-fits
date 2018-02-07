package test;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Navigate_tab {

    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        Faker faker = new Faker();

        //add_report addReport = new add_report();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://fits.qauber.com/#/page/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("fitway12@mailinator.com");
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("140407");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[@class='ng-binding' and text()='Add Report']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[2]/fieldset/div[2]/div/div/label")).click();
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[2]/ul/li/a")).click();
        //Tab Navigate

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[3]/h4/div")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[4]/h4/div")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[8]/h4/div")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[7]/h4/div")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[6]/h4/div")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[1]/h4/div")).click();
        Thread.sleep(3000);


        String tab = driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]")).getText();
        Boolean checkstatus = false;
        if (tab.contains("Entity")) {

            checkstatus = true;

            Assert.assertTrue(checkstatus);
            System.out.println("User is able to navigate between tabs");
        }



    }}
