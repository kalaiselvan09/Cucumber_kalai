package com.Step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class AddCustomer {
		static WebDriver driver;
		@Given("The user is in Telecom home page")
		public void the_user_is_in_Telecom_home_page() {
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace-updated\\Cucumber\\CucumberTest\\Driver\\chromedriver.exe");
				 driver=new ChromeDriver();
				 driver.get("http://demo.guru99.com/telecom/index.html");

		}

		@Given("The User click an add Customer")
		public void the_User_click_an_add_Customer() {
			
			driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		}

		@When("The User is filling all the details")
		public void the_User_is_filling_all_the_details() {
			
			
			
			driver.findElement(By.xpath("//label[@for='done']")).click();
			driver.findElement(By.id("fname")).sendKeys("kalai");
			driver.findElement(By.id("lname")).sendKeys("selvan");
			driver.findElement(By.id("email")).sendKeys("123@gmail.com");
			driver.findElement(By.name("addr")).sendKeys("West street Thanjavur");
			driver.findElement(By.name("telephoneno")).sendKeys("9894352443");
			
		}

		@When("The User Click on Submit Button")
		public void the_User_Click_on_Submit_Button() {
			driver.findElement(By.xpath("//input[@name='submit']")).click();
		}

		@Then("The User's customer id should displayed in the screen")
		public void the_User_s_customer_id_should_displayed_in_the_screen() {
		
			Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
			
			
		}



}
