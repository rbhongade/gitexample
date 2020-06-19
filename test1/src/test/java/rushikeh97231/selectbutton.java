package rushikeh97231;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class selectbutton {

	public static void main(String[] args) {
		
	
		
		 String path ="C:\\selenium_install\\chromedriver_win32\\chromedriver.exe";
		    System.out.println(path);
		    System.setProperty( "webdriver.chrome.driver",path );
		WebDriver Obj =new ChromeDriver();
		Obj.get("file:///C:/Users/rbhongad/eclipse-workspace/test1/src/main/webapp/select.html");
		WebElement selectbutton = Obj.findElement(By.id("cars"));
		Select s1 =new Select(selectbutton);
		s1.selectByVisibleText("Audi");
				

	}

}

