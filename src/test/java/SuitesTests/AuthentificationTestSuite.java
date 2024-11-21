package SuitesTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.BasePage;
import Pages.ContactezNous;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.Utility;




public class AuthentificationTestSuite {
	
	BasePage PageDeBase;
	HomePage pageAccueil;
	
	
	
	String validUsername = "amira";
	String validPassword = "amirabenahmed01";
	
	@BeforeEach
	public void init() {
		
		Utility.driver = new ChromeDriver();
		
		PageDeBase = new BasePage();
		PageDeBase.accessURL();
		pageAccueil = new HomePage();
		
	}
	
	
	@Test
	public void authentificationIdentifiantValide() {	
		
		
		pageAccueil.accessLogin();
		
		LoginPage idValide = new LoginPage();
		idValide.login(validUsername, validPassword);
		
		String actualText = idValide.getAcualWelcomeText();
		
		
		Assertions.assertTrue(actualText.contains(validUsername));
			
		
	}
	
	
	@Test
	public void authentificationIdentifiantInvalide() {	
		
		
		pageAccueil.accessLogin();
		
		LoginPage idValide = new LoginPage();
		idValide.login("amiran", "amirabenahmed01nbn");
		
	}
	
	
	
	//String nom = ;
	//String tel = ;
	//String mail = ;
	//String msg = ;
	
	
	@Test
	@Order(1)
	public void jeContact() {
		
		
		pageAccueil.contactezNous();		
		
		ContactezNous contactNous = new ContactezNous();
		contactNous.contact("Mohamed", "0604050604", "Mohamed@test.fr", "Mohamed");	
		
		String actualText = contactNous.voirLeMessage();
		
		Assertions.assertEquals("Merci de nous avoir contacté! Nous vous contacterons sous peu.", actualText);
	
	}
	
	
	@Test
	@Order(2)
	public void jeContactInvalideTel() {
		
		
		pageAccueil.contactezNous();		
		
		ContactezNous contactNous = new ContactezNous();
		contactNous.contact("Mohamed", "llmlqsq", "Mohamed@test.fr", "Mohamed");	
		
		String message = contactNous.messageErreur();
		
		Assertions.assertEquals("Ce champ est nécessaire", message);
	
	}
	
	
	
	
	
	@AfterEach
	public void close() {
		
		PageDeBase.waitAndClose();
		
		
	}
	
}
