package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;

public class PODemoHomePage extends PageObject{
	
	 //WebDriver driver = new ChromeDriver();
	
	@Managed(driver = "chrome")
	WebDriver driver;

	public void enterasManager() {
		// TODO Auto-generated method stub
		$(By.xpath("//button[text()='Bank Manager Login']")).click();
	}

	public void createCustomer() {
		// TODO Auto-generated method stub
		 
		 
		$(By.xpath("//*[normalize-space(text())='Add Customer']")).click();
		$(By.xpath("//input[@ng-model='fName']")).sendKeys("Christopher");
		$(By.xpath("//input[@ng-model='lName']")).sendKeys("Connely");
		$(By.xpath("//input[@ng-model='postCd']")).sendKeys("L789C349");
		$(By.xpath("//button[text()='Add Customer']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Handle alert popup
		
		//Alert alert = driver.switchTo().alert();
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
		
		$(By.xpath("//*[normalize-space(text())='Add Customer']")).click();
		$(By.xpath("//input[@ng-model='fName']")).sendKeys("Frank");
		$(By.xpath("//input[@ng-model='lName']")).sendKeys("Christopher");
		$(By.xpath("//input[@ng-model='postCd']")).sendKeys("A897N450");
		$(By.xpath("//button[text()='Add Customer']")).click();
		// Handle alert popup
		alert.accept();
		
		$(By.xpath("//*[normalize-space(text())='Add Customer']")).click();
		$(By.xpath("//input[@ng-model='fName']")).sendKeys("Christopher");
		$(By.xpath("//input[@ng-model='lName']")).sendKeys("Minka");
		$(By.xpath("//input[@ng-model='postCd']")).sendKeys("M098Q585");
		$(By.xpath("//button[text()='Add Customer']")).click();
		// Handle alert popup
		alert.accept();
		
		$(By.xpath("//*[normalize-space(text())='Add Customer']")).click();
		$(By.xpath("//input[@ng-model='fName']")).sendKeys("Connely");
		$(By.xpath("//input[@ng-model='lName']")).sendKeys("Jackson");
		$(By.xpath("//input[@ng-model='postCd']")).sendKeys("L789C349");
		$(By.xpath("//button[text()='Add Customer']")).click();
		// Handle alert popup
		alert.accept();
		
		$(By.xpath("//*[normalize-space(text())='Add Customer']")).click();
		$(By.xpath("//input[@ng-model='fName']")).sendKeys("Jackson");
		$(By.xpath("//input[@ng-model='lName']")).sendKeys("Frank");
		$(By.xpath("//input[@ng-model='postCd']")).sendKeys("L789C349");
		$(By.xpath("//button[text()='Add Customer']")).click();
		// Handle alert popup
		alert.accept();
		
		$(By.xpath("//*[normalize-space(text())='Add Customer']")).click();
		$(By.xpath("//input[@ng-model='fName']")).sendKeys("Minka");
		$(By.xpath("//input[@ng-model='lName']")).sendKeys("Jackson");
		$(By.xpath("//input[@ng-model='postCd']")).sendKeys("A897N450");
		$(By.xpath("//button[text()='Add Customer']")).click();
		// Handle alert popup
		alert.accept();
		
		$(By.xpath("//*[normalize-space(text())='Add Customer']")).click();
		$(By.xpath("//input[@ng-model='fName']")).sendKeys("Jackson");
		$(By.xpath("//input[@ng-model='lName']")).sendKeys("Connely");
		$(By.xpath("//input[@ng-model='postCd']")).sendKeys("L789C349");
		$(By.xpath("//button[text()='Add Customer']")).click();
		// Handle alert popup
		alert.accept();
		
	}
	
	public void verifyCreatedCustomers() {
		// TODO Auto-generated method stub
		
		$(By.xpath("//*[normalize-space(text())='Customers']")).click();
		WebElement table = getDriver().findElement(By.xpath("//table[contains(@class, 'table-bordered') and contains(@class, 'table-striped')]"));
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
		
		 if (rows.size() == 7) {
	            System.out.println("all customers created successfully");
		 }
		 else {
	            System.out.println("customers not created successfully");
	        }
		
	}
	
	public void deletecustomer() {
		// TODO Auto-generated method stub
		WebElement deleteButton = getDriver().findElement(By.xpath("//tr[td[text()='Jackson'] and td[text()='Frank'] and td[text()='L789C349']]//button[text()='Delete']"));
		deleteButton.click();
		
		WebElement deleteButtonn = getDriver().findElement(By.xpath("//tr[td[text()='Christopher'] and td[text()='Connely'] and td[text()='L789C349']]//button[text()='Delete']"));
		deleteButtonn.click();
		
	}
	

}
