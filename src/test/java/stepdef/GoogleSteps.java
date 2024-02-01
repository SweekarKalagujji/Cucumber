package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {
public WebDriver driver;
String title;
@Given("Google application must be open")
public void google_application_must_be_open() {
   System.out.println("Google application is open!");
   driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://www.google.com/");
}

@When("I capture the current page tite")
public void i_capture_the_current_page_tite() {
	System.out.println("Current title is captured!");
 title=	driver.getTitle();
}

@Then("it should match with Google")
public void it_should_match_with_google() {
Assert.assertTrue(title.contains("Google"),"Title is not matched");
	System.out.println("Title is matched!");
}
@When("I type valid keyword in search box")
public void i_type_valid_keyword_in_search_box() {
    driver.findElement(By.id("APjFqb")).sendKeys("Cucumber");
    
}

@Then("it Google aplication should display valid result")
public void it_google_aplication_should_display_valid_result() {
   List<WebElement>ls= driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
   System.out.println(ls.size());
   for(WebElement i:ls) {
	   System.out.println(i.getText());
   }
   
   
}




}
