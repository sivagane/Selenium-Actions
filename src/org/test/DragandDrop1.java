package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Actions\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://demo.guru99.com/test/drag_drop.html ");
    d.manage().window().maximize();
    d.findElement(By.id("closeBtn")).click();
	Actions action=new Actions(d);
	WebElement source = d.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
    WebElement source1 = d.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
    WebElement dest = d.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
    WebElement dest1 = d.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[1]"));
    action.dragAndDrop(source,dest);
    action.dragAndDrop(source1, dest1);
    
    WebElement source2 = d.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
    WebElement source3 = d.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
    WebElement dest2 = d.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
    WebElement dest3 = d.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[2]"));
    action.dragAndDrop(source2, dest2);
    action.dragAndDrop(source3, dest3);
}
}
