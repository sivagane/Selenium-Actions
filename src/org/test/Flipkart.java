package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Actions\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.flipkart.com");
	d.manage().window().maximize();
	
	WebElement close = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
    close.click();
    Thread.sleep(3000);
    Actions action=new Actions(d);
    WebElement home = d.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[6]"));
    action.moveToElement(home).perform();
    WebElement sofa = d.findElement(By.xpath("//a[@title='Sofa']"));
    sofa.click();
    Thread.sleep(3000);
    WebElement order = d.findElement(By.xpath("(//div[@class='_1vC4OE'])[1]"));
    order.click();
    Thread.sleep(3000);
    Set<String> winhan=d.getWindowHandles();
    List<String>li=new ArrayList<>();
    li.addAll(winhan);
    
    li.get(1);
   
    Thread.sleep(3000);
    WebElement add = d.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
    add.click();
}
}
