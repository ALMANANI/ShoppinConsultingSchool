package SuitesTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.BasePage;
import Pages.HomePage;
import Utilities.Utility;

public class ShopTestSuite {
	
	
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
	public void achatProduitDansBoutique() {

		
		pageAccueil.hoverToBoutique();	
		pageAccueil.Chaussure();
	
	}

}
