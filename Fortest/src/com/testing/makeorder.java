package com.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class makeorder {
	public static void main(String[] args) {
		// setting location of webdriver
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\s\\eclipse-workspace\\Fortest\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//for getting the website 
		driver.get(
				"https://shopscrollbuy.myshopify.com/?_cd=f3096a38220371e7aa6e48a9b98a23ffeaed0f70d8e6e2d6deb290ff98e23cdd&_uid=74042409148");
		//for click homepage
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/a")).click();
		//for enter authentication
		driver.findElement(By.xpath("//*[@id=\'Password\']")).sendKeys("Sarath123@");
		WebElement Click = driver.findElement(By.xpath("//*[@id=\'login_form\']/div/span/button"));
		Click.click();
		//for click  homepage
		driver.findElement(By.xpath("//*[@id=\'SiteNav\']/li[2]/a/span")).click();
		//for click products
		driver.findElement(By.xpath("//*[@id=\'Collection\']/ul[1]/li[1]/div/a")).click();
		//for select size
		WebElement DropDown = driver.findElement(By.xpath("//*[@id=\'SingleOptionSelector-0\']"));
		Select select = new Select(DropDown);
		select.selectByIndex(2);
		// for select size by using dropdown
		WebElement Dropdown1 = driver.findElement(By.xpath("//*[@id=\'SingleOptionSelector-1\']"));
		Select select1 = new Select(Dropdown1);
		select1.selectByIndex(5);
		driver.findElement(By.xpath("//*[@id=\'product_form_6805875392700\']/div[3]/div/button/span[1]")).click();
//for save to cart
		driver.findElement(By.xpath("//*[@id=\'SiteNav\']/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'Collection\']/ul[1]/li[2]/div/a")).click();
		// for select size by using dropdown
		WebElement DropDown2 = driver.findElement(By.xpath("//*[@id='SingleOptionSelector-0']"));
		Select select2 = new Select(DropDown2);
		select2.selectByIndex(2);
		// for select size by using dropdown
		WebElement Dropdown3 = driver.findElement(By.xpath("//*[@id='SingleOptionSelector-1\']"));
		Select select3 = new Select(Dropdown3);
		select3.selectByIndex(5);
		driver.findElement(By.xpath("//*[@id=\'product_form_6805875654844\']/div[3]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\'SiteNav\']/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\'shopify-section-header\']/div[2]/header/div/div[2]/div/a")).click();
		driver.findElement(
				By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/div[1]/form/div/div/div/div[4]/div[1]/input"))
				.click();
		}

}
