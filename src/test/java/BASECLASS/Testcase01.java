package BASECLASS;

import org.testng.annotations.Test;

import POM.Login;


public class Testcase01 extends baseclass {
@Test
	
	
	public void logintest() throws InterruptedException {
	Thread.sleep(3000);
		Login Ln=new Login(driver);
	    Ln.setemail();
	    Ln.setpassword();
	    Ln.clicklogin();
	}
}