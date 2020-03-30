package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Actions\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.amazon.in");
	d.manage().window().maximize();
	Actions action=new Actions(d);
	WebElement hmenu = d.findElement(By.id("nav-hamburger-menu"));
    hmenu.click();
    Thread.sleep(3000);
    WebElement mobacc = d.findElement(By.xpath("//a[@data-menu-id='7']"));
    action.moveToElement(mobacc).perform();
    mobacc.click();
    Thread.sleep(3000);
    WebElement powb = d.findElement(By.xpath("(//a[@class='hmenu-item'])[49]"));
    action.moveToElement(powb).perform();
    powb.click();
}
}
