package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GettyImages {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Actions\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.gettyimages.in/");
	d.manage().window().maximize();
	Actions action= new Actions (d);
	WebElement ed = d.findElement(By.xpath("//a[@data-nav='nav_Editorial']"));
    action.moveToElement(ed).perform();
    ed.click();
    
    WebElement ent = d.findElement(By.xpath("//a[@data-nav='nav_Editorial_Entertainment']"));
    ent.click();
}
}
