package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Actions\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.homedepot.com/");
	d.manage().window().maximize();
	Actions a =new Actions(d);
	WebElement Alldept = d.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
    a.moveToElement(Alldept).perform();
    WebElement Pai = d.findElement(By.xpath("(//a[@title='Paint'])[1]"));
    a.moveToElement(Pai).perform();
    WebElement IntP = d.findElement(By.xpath("//a[@title='Interior Paint']"));
    a.moveToElement(IntP).perform();
    WebElement CPai = d.findElement(By.xpath("(//a[@class='MainFlyout__link'])[40]"));
    CPai.click();
}
}
