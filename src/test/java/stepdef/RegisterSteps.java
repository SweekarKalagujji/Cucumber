package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class RegisterSteps {
    public WebDriver driver;
	@Given("Open registeration page of opencart")
	public void open_registeration_page_of_opencart() {
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	    
	}

	@When("I enter valid data in required fields")
	public void i_enter_valid_data_in_required_fields(DataTable data) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<List<String>>ls=data.cells();
	   // System.out.println(ls.get(1).get(0));	 
	    driver.findElement(By.name("firstname")).sendKeys(ls.get(1).get(0));
	    driver.findElement(By.name("lastname")).sendKeys(ls.get(1).get(1));
	    
	    driver.findElement(By.name("email")).sendKeys(ls.get(1).get(2));
	    
	    driver.findElement(By.name("telephone")).sendKeys(ls.get(1).get(3));
	    
	    driver.findElement(By.name("password")).sendKeys(ls.get(1).get(4));
	    
	    driver.findElement(By.name("confirm")).sendKeys(ls.get(1).get(5));
	    
	    
		
	}

	@When("I click on yes radio button")
	public void i_click_on_yes_radio_button() {
	   driver.findElement(By.name("newsletter")).click();
	}

	@When("I click on check privacy policy")
	public void i_click_on_check_privacy_policy() {
		 driver.findElement(By.name("agree")).click();
	}

	@When("I click on continue button")
	public void i_click_on_continue_button() {
		driver.findElement(By.className("btn-primary")).click();
	}

	@Then("I should be able to register in opencart")
	public void i_should_be_able_to_register_in_opencart() {
	   System.out.println("Registration completed!");
	}

}
