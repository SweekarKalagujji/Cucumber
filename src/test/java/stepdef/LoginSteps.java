package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginSteps {
    public WebDriver driver;
	@Given("Open login page for OpenCart application")
	public void open_login_page_for_open_cart_application() {
	   driver= new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("Enter valid data for required field")
	public void enter_valid_data_for_required_field(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<Map<String,String>> dt=table.asMaps();
	    driver.findElement(By.name("email")).sendKeys(dt.get(0).get("email"));//key
	    driver.findElement(By.name("password")).sendKeys(dt.get(0).get("password"));//key
	    
	    
		
	}

	@When("Click on continue button")
	public void click_on_continue_button() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("it should Login")
	public void it_should_login() {
	  Assert.assertTrue(driver.getCurrentUrl().contains("account"),"fail");
	  System.out.println("pass");
	}


}
