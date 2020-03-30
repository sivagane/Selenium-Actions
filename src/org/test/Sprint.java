package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sprint {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Actions\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.sprint.com/");
	
	Thread.sleep(3000);
	WebElement Aboutus = d.findElement(By.xpath("(//a[@class='font-size-14'])[1]"));
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("arguments[0].scrollIntoView(true)",Aboutus);
    
    
}
}
