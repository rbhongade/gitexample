package rushikeh97231;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		
		 String path ="C:\\selenium_install\\chromedriver_win32\\chromedriver.exe";
		    System.out.println(path);
		    System.setProperty( "webdriver.chrome.driver",path );
		WebDriver Obj =new ChromeDriver();
		Obj.get("file:///C:/Users/rbhongad/eclipse-workspace/test1/src/main/webapp/Radio.html");
		
				

	}

}

