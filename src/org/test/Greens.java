package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Actions\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://greenstech.in/selenium-course-content.html");
	d.manage().window().maximize();
	Actions a=new Actions(d);
	WebElement Cour = d.findElement(By.className("activeLink"));
	a.moveToElement(Cour).perform();
	Thread.sleep(3000);
	WebElement SoftTest = d.findElement(By.xpath("//a[@href='http://www.greenstechnologys.com/software-testing.html'] "));
    a.moveToElement(SoftTest).perform();
    Thread.sleep(3000);
    WebElement SelTrai = d.findElement(By.xpath("(//a[@href='http://www.greenstechnologys.com/selenium-course-content.html'])[1]"));
    SelTrai.click();
    
    
}
}
