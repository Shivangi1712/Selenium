package Hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver = new ChromeDriver();
	  @BeforeTest
	  public void LaunchBrowser() {
		  System.out.println("Launching Browser");
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver.get("https://demo.openmrs.org/openmrs/");
	  }
	 @Test(priority=-1)
	 public void checkwithWrongValues()
	  {
		  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Shivangi");
		  driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Shivangi123");
		  driver.findElement(By.xpath("//li[@value=\"5\"]")).click();
		  driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	  }
	  @Test(priority=0)
	  public void checkwithCorrectValues()
	  {
		  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Admin123");
		  driver.findElement(By.xpath("//li[@value=\"5\"]")).click();
		  driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	  }
	  @Test(priority=1)
	  public void registerapatient() {
		  driver.findElement(By.xpath("//i[@class=\"icon-user\"]")).click();
	  }
	  @Test(priority=2)
	  public void name() {
		  driver.findElement(By.xpath("//input[@name=\"givenName\"]")).sendKeys("Shivangi");
		  driver.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("SS");
	      driver.findElement(By.xpath("//input[@name=\"familyName\"]")).sendKeys("Sharma");
	      try {
				Thread.sleep(1000);	
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
	      driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	      driver.findElement(By.xpath("//select[@id=\"gender-field\"]//option[2]")).click();
	      driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	      driver.findElement(By.xpath("//input[@name=\"birthdateDay\"]")).sendKeys("17");
	      driver.findElement(By.xpath("//select[@name=\"birthdateMonth\"]//option[@value=\"10\"]")).click();
	      driver.findElement(By.xpath("//input[@id=\"birthdateYear-field\"]")).sendKeys("1997");
	      try {
				Thread.sleep(1000);	
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
	      driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	      driver.findElement(By.xpath("//input[@id=\"address1\"]")).sendKeys("4555 avenue");
	      driver.findElement(By.xpath("//input[@id=\"address2\"]")).sendKeys("Bourret");
	      driver.findElement(By.xpath("//input[@id=\"cityVillage\"]")).sendKeys("Montreal");
	      driver.findElement(By.xpath("//input[@id=\"stateProvince\"]")).sendKeys("Montreal");
	      driver.findElement(By.xpath("//input[@id=\"country\"]")).sendKeys("Canada");   
	      driver.findElement(By.xpath("//input[@id=\"postalCode\"]")).sendKeys("H3S1X1");  
	      try {
				Thread.sleep(1000);	
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
	      driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	      driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("514-990-8888");
	      try {
				Thread.sleep(1000);	
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
	      driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	      driver.findElement(By.xpath("//select[@name=\"relationship_type\"]//option[@data-val=\"Sibling\"]")).click();
	      driver.findElement(By.xpath("//input[@ng-model=\"relationship.name\"]")).sendKeys("Shivi");
	      try {
				Thread.sleep(1000);	
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
	      driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	      driver.findElement(By.xpath("//input[@value=\"Confirm\"]")).click();
	  }
	  @Test(priority=3)
	  public void logout() {
		  driver.findElement(By.xpath("//a[@href=\"/openmrs/appui/header/logout.action?successUrl=openmrs\"]")).click();
	  }
	  
}
