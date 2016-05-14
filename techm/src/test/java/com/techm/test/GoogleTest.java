package com.techm.test;

import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.*;

import com.techm.page.GoogleSearch;

public class GoogleTest {
	private GoogleSearch page;
	 
	@Before
	public void openTheBrowser() {
	page = PageFactory.initElements(new FirefoxDriver(), GoogleSearchPage.class);
	page.open("http://google.co.in/");
	}
	 
	@After
	public void closeTheBrowser() {
	page.close();
	}
	 
	@Test
	public void whenTheUserSearchesForSeleniumTheResultPageTitleShouldContainCats() {
	page.searchFor("selenium");
	assertThat(page.getTitle(), containsString("selenium") );
	}
}
