package Pages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.Utility;

public class AuthentificationTestSuite {
	
	
	@BeforeEach
	public void init() {
		
		Utility.driver = new ChromeDriver();
		
		BasePage url = new BasePage();
		url.accessURL();
		
	}
	
	
	@Test
	public void authentificationIdentifiantValide() {	
		
		HomePage pageAccueil = new HomePage();
		pageAccueil.accessLogin();
		
		LoginPage idValide = new LoginPage();
		idValide.login("amira", "amirabenahmed01");

		
	}
		
	
}
