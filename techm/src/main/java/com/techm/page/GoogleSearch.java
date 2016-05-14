package com.techm.page;

import org.openqa.selenium.*;

public class GoogleSearch {
	protected WebDriver driver;
	private WebElement q;
	private WebElement btn;
	 
	public GoogleSearch(WebDriver driver) {
	this.driver = driver;
	}
	public void open(String url) {
	driver.get(url);
	}
	public void close() {
	driver.quit();
	}
	public String getTitle() {
	return driver.getTitle();
	}
	public void searchFor(String searchTerm) {
	q.sendKeys(searchTerm);
	btn.click();
	}
	public void typeSearchTerm(String searchTerm) {
	q.sendKeys(searchTerm);
	}
	public void clickOnSearch() {
	btn.click();
	}
}
