package appTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTest {
  @Test(description = "login with valid details")
  public void logintest() throws Exception {
	  App ap = new App();
	  boolean status = ap.userLogin("userdemo", "password");
	  Assert.assertTrue(status);
  }
  
  @Test(description = "login with valid details")
  public void logintest2() throws Exception {
	  App ap = new App();
	  boolean status = ap.userLogin("user", "demo");
	  Assert.assertFalse(status);
}
}