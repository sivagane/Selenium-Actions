package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Actions\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.snapdeal.com/");
	d.manage().window().maximize();
	Actions a= new Actions(d);
	WebElement Mobacc = d.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
    a.moveToElement(Mobacc).perform();
    WebElement NeLC = d.findElement(By.xpath("(//a[@data-index='1.1.5'])[2]"));
    NeLC.click();
}
}
