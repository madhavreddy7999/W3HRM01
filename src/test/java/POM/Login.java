package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver driver;
public Login(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy (xpath="//input[@id='email']")
WebElement email;
@FindBy (xpath="//input[@id='password']")
WebElement password;
@FindBy (xpath="//button[@type='submit']")
WebElement login;


public void setemail() {
email.sendKeys("hr@w3softech.in");
}
public void setpassword() {
	password.sendKeys("W3hr@123");
}
public void clicklogin() {
	login.click();
}
}