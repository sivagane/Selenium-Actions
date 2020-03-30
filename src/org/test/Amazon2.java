package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Actions\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/");
	d.manage().window().maximize();
	Actions a=new Actions(d);
	WebElement signin = d.findElement(By.id("nav-link-accountList"));
    a.moveToElement(signin).perform();
    WebElement SigninBtn = d.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
    SigninBtn.click();
    WebElement Email = d.findElement(By.id("ap_email"));
    Email.sendKeys("sivag918@gmail.com");
    WebElement Ctn = d.findElement(By.id("continue"));
    Ctn.click();
    WebElement Pass = d.findElement(By.id("ap_password"));
    Pass.sendKeys("sivaamazon");
    WebElement LoginBtn = d.findElement(By.id("signInSubmit"));
    LoginBtn.click();
}
}
