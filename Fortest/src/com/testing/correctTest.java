package com.testing;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class correctTest {
	public static void main(String[] args) throws InterruptedException {
		
		// set a location of driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\s\\eclipse-workspace\\Fortest\\Driver\\chromedriver.exe");
		
		//webdriver reference
		WebDriver driver = new ChromeDriver();
		
		// for loading purpose set timer
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		// get the website location
		driver.get("https://accounts.shopify.com/store-login");
		//Finding the locators using xpath
		driver.findElement(By.id("shop_domain")).sendKeys("ShopScrollBuy.myshopify.com");
		//for click the next button
		driver.findElement(By.name("commit")).click();
		//for typing the email 
		driver.findElement(By.id("account_email")).sendKeys("sendtosarath98@gmail.com");
		//for loading purpose set timer
		WebElement findElement = driver
				.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/form/button"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(findElement));
		findElement.click();

		//for loading purpose set timer
		WebDriverWait cd = new WebDriverWait(driver, 100);
		cd.until(ExpectedConditions.visibilityOfElementLocated(By.id("account_password")));
		// for entering the password
		WebElement passwordenter = driver.findElement(By.xpath("//*[@id=\'account_password\']"));
		passwordenter.sendKeys("Sarath123@");
		////for loading purpose set timer
		WebElement emailpasswordclick = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/ul/button"));
		wait.until(ExpectedConditions.elementToBeClickable(emailpasswordclick));
		emailpasswordclick.click();
		//for click homepage
		driver.findElement(By.xpath("//*[@id=\"AppFrameNav\"]/nav/div[2]/ul[1]/li[3]/div[1]/a/span")).click();
		//for click products
		driver.findElement(By.xpath("//*[@id=\"AppFrameMain\"]/div/div/div[1]/div/div[2]/div[2]/a/span/span")).click();
		//for enter the description
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("Men Navy Blue & Grey Regular Fit Checked Casual Shirt");
		//for enter the price
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("Rs. 119");
		//for enter the price
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("Rs 400 ");
		//entering the price
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("2499 above");
		//for enter the values
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("123");
		//for enter the values
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("123");
		//for enter the values
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("123");
		//for enter the values
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("123");
		//for dropdown values
		WebElement dropdown = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]"));
		Select select = new Select(dropdown);
		select.selectByIndex(6);
		//for enter the values
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]"))
				.sendKeys("64487");
		//for enter the values
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("67874");
		//for enter the values
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("56544");
		//for enter the click save button
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]"))
				.click();
		
		//as followed by all the three items
		
		
		
		
		
		

		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"AppFrameNav\"]/nav/div[2]/ul[1]/li[3]/div[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"AppFrameMain\"]/div/div/div[1]/div/div[2]/div[2]/a/span/span")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys(
						"Men Blue Regular Fit Solid Casual Linen Shirt");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("Rs 999");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("rs 1123");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("1223");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("57845");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("32545");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("98754");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("975454");
		WebElement dropdown1 = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]"));
		Select select1 = new Select(dropdown1);
		select1.selectByIndex(3);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]"))
				.sendKeys("64487");
		
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("615484");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("546544");
		
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]"))
				.click();
		
		
		
		
		
		
		
		
		
		
		
		

		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"AppFrameNav\"]/nav/div[2]/ul[1]/li[3]/div[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"AppFrameMain\"]/div/div/div[1]/div/div[2]/div[2]/a/span/span")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("Men Grey & Pink Regular Fit Checked Casual Shirt");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("Rs 3322");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("Rs 4123");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("RS 2123");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("FDF123");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("12FDG3");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("1FRR23");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("12RGR3");
		WebElement dropdown3 = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]"));
		Select select3 = new Select(dropdown3);
		select3.selectByIndex(6);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]"))
				.sendKeys("SF64SFD487");
		
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("FWER67874");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("56544");
		
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]"))
				.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"AppFrameNav\"]/nav/div[2]/ul[1]/li[3]/div[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"AppFrameMain\"]/div/div/div[1]/div/div[2]/div[2]/a/span/span")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
		.sendKeys("Men Orange & Navy Blue Regular Fit Checked Casual Shirt");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
		.sendKeys("RS 56123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
		.sendKeys("RS 5123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
		.sendKeys("RS 5123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
		.sendKeys("1DDF23");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]"))
		.sendKeys("12TRTRY3");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
		.sendKeys("1YRY23");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
		.sendKeys("UYT123");
		WebElement dropdown4 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]"));
		Select select4 = new Select(dropdown4);
		select4.selectByIndex(6);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]"))
		.sendKeys("YTURU64487URU");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
		.sendKeys("678URU74");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
		.sendKeys("565UR44");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]"))
		.click();

	}
}
