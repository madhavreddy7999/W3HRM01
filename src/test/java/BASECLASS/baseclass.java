package BASECLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class baseclass {
public static WebDriver driver;
@BeforeClass
public void openapp() {
	driver=new ChromeDriver();
	driver.get("https://employee.w3softech.in/qa/login");
}
@AfterClass
public void closeapp() {
	driver.close();
}
}

