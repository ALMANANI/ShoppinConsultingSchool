package GestionUtilisateurs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Utilities.Utility;

public class Authentification {
	
	@Test
	public void authentificationValide() {
		
		
		Utility.driver = new ChromeDriver();
		
		Utility.driver.get("https://shop-in.ovh/");
		
		Utility.driver.manage().window().maximize();
		
		// Utility.driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div/div[3]/div/div[1]/a")).click();
		
		LoginPage connex = new LoginPage();
		connex.login("amira", "amirabenahmed01");
		
		
		String resultatReel = Utility.driver.getCurrentUrl();
		String resultatVoulu = "https://shop-in.ovh/mon-compte/";
		
		Assertions.assertEquals(resultatReel, resultatVoulu);
		
		
	}

}
