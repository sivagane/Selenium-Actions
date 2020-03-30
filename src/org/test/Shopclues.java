package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Actions\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.shopclues.com/wholesale.html/");
	d.manage().window().maximize();
	WebElement MABtn = d.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
    Actions a = new Actions(d);
    a.moveToElement(MABtn).perform();
    Thread.sleep(3000);
    WebElement Range = d.findElement(By.xpath("//a[@href='//www.shopclues.com/mobiles-smartphones.html?sort_by=bestsellers&sort_order=desc&sort_price[]=5000.00-6999.00&sort_price[]=7000.00-9999.00&fsrc=sort_price']"));
    Range.click();
    Set<String> allwinh = d.getWindowHandles();
    List<String> li=new ArrayList<>();
    li.addAll(allwinh);
    String id = li.get(1);
    d.switchTo().window(id);
    Thread.sleep(5000);
    WebElement ph = d.findElement(By.xpath("(//span[@class='prod_name'])[2]"));
    ph.click();
    String id1 = li.get(2);
    d.switchTo().window(id1);
    Thread.sleep(5000);
    WebElement ac = d.findElement(By.id("buy"));
    ac.click();
}
}
