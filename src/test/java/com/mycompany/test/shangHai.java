package com.mycompany.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;

public class shangHai {
	WebDriver driver = new FirefoxDriver();
	
	
	shangHai shangHai1;
	public shangHai(){
		 PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 20), this);
	}
	
	
	/**
	 * down list icon
	 */
	@FindBy(css=".arrow-flag.down")
	private WebElement downlist;
	
	/**
	 * find shanghai city
	 */
	@FindBy(css=".city_cont>a[data-cname='上海']")
	private WebElement shanghai;
	
	/**
	 * subway locator
	 */
	@FindBy(css=".subway-item")
	private WebElement subway;
	
	/**
	 * subway start point input box;
	 */
	@FindBy(css="#sub_start_input")
	private WebElement substart;
	
	@FindBy(css="#bus_start_input")
	private WebElement busstart;
	/**
	 * subway end point input box;
	 */
	@FindBy(css="#sub_end_input")
	private WebElement subend;
	
	@FindBy(css="#bus_end_input")
	private WebElement busend;
	/**
	 * Search button
	 */
	@FindBy(css="#subSearchBtn")
	private WebElement subSearch;
	
	/**
	 * Search bus button
	 */
	@FindBy(css="#busSearchBtn")
	private WebElement busSearch;
	
	/**
	 * costTime locator
	 */
	@FindBy(css="#totalTime")
	private WebElement costTime;
	
	@FindBy(css=".route-item>span")
	private WebElement route;
	
	@FindBy(css="#type3")
	private WebElement type3;
	
	@FindBy(css="#type2")
	private WebElement type2;
	
	@FindBy(css=".bus_time")
	private WebElement bustime;
	
	@Test
	public void searchBeiJing() throws InterruptedException{
		/**
		 * open the "http://map.baidu.com/"
		 */
		driver.get("http://map.baidu.com/");
		Thread.sleep(10000);
		
		route.click();
		Thread.sleep(10000);
		
		busstart.sendKeys("上地五街东口");
		Thread.sleep(10000);
		
		busend.sendKeys("故宫博物院");
		Thread.sleep(10000);
		
		busSearch.click();
		Thread.sleep(10000);
		
		type3.click();
		Thread.sleep(5000);
		
		type2.click();
		
		System.out.println(bustime.getText());
		
	}
	
	
	@Test 
	public void searchShangHai() throws InterruptedException{
		/**
		 * open the "http://map.baidu.com/"
		 */
		driver.get("http://map.baidu.com/");
		Thread.sleep(10000);
		
		subway.click();
		Thread.sleep(10000);
		
		downlist.click();
		Thread.sleep(10000);
		
		shanghai.click();
		Thread.sleep(10000);
		
		substart.sendKeys("虹桥1号航站楼");
		Thread.sleep(10000);
		
		subend.sendKeys("东方体育中心");
		Thread.sleep(10000);
		
		subSearch.click();
		Thread.sleep(10000);
		
	}
	
	
}
