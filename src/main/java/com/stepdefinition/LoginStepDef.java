package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	public WebDriver driver = null;

	@Before // hooks in cucumber
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@After
	public void tearDown() {
		driver.close();
	}

	@Given("user enters {string}")
	public void user_enters(String url) {
	   driver.get(url);
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String uname, String pass) {
	    
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.xpath("//button")).click();
	}

	@Then("user will be on homepage")
	public void user_will_be_on_homepage() {

		Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	}

	

}
