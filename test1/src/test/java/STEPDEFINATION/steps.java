package STEPDEFINATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.*;
import cucumber.api.java.en.*;

public class steps {
	WebDriver Obj = new FirefoxDriver();
	
	@Before
	public void setup() {
	 //WebDriver Obj;
    String path ="C:\\selenium_install\\geckodriver\\geckodriver.exe";
    System.out.println(path);
    System.setProperty( "webdriver.gecko.driver",path );
    //System.setProperty( "Webdriver.gecko.Driver", "C:\\dr\\geckodriver.exe");
    
	}
	
	
	@Given("^Open the home page\\.$") 
	public void Openthehomepage () throws Throwable {
		Obj.manage().window().maximize();
        Obj.manage().deleteAllCookies();
        //Obj.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        Obj.manage().window().maximize();
        Obj.get("https://blazedemo.com/");

	}

	@When("^Select the departure Destination City\\.$")
		public void SelectthedepartureDestinationCity () throws Throwable {
		
			Obj.findElement(By.xpath("//*[@class='form-inline']")).click();
			Thread.sleep( 4000 );
			Obj.findElement(By.xpath("//*[@value='Philadelphia']")).click();
			//DESTINATION CITY
			Obj.findElement(By.xpath("//*[@name='toPort']")).click();
			Thread.sleep( 4000 );
			Obj.findElement(By.xpath("//*[@value='Rome']")).click();

	}

	@And("^click on the find flight$") 
	public void clickonthefindflight () throws Throwable {
		Obj.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		
		
		

	}

	@Then("^validate the title page$")  
		public void validatethetitlepage() throws Throwable {
		
		String expectedTitle = "BlazeDemo - reserve";
		String actualTitle=Obj.getTitle();
		System.out.println(actualTitle);
		
	    if(actualTitle.equals(expectedTitle)){
	    	
	        System.out.println("Test Pass");
	    }
	    else{
	        System.out.println("Test Failed");
	    }
	    
	  	    Obj.quit();
	}



}
