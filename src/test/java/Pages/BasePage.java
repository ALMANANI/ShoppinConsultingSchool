package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Utility;

public class BasePage {
	

	public void accessURL() {
		
		Utility.driver.get("https://shop-in.ovh/");
		
		Utility.driver.manage().window().maximize();
		
		Utility.driver.manage().deleteAllCookies();
		
		// Utility.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); soit comme ça ou avec le try catch
		//Utility.driver.findElement(By.xpath("//button[normalize-space()='Accepter']")).click(); soit comme ça ou avec le try catch
		
		//Utiliser WebDriverWait pour attendre que le bouton "Accepter" soit visible
        WebDriverWait attendre = new WebDriverWait(Utility.driver, Duration.ofSeconds(10)); // attendre jusqu'à 10 secondes

        try {
            WebElement accepterButton = attendre.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Accepter']")));
            accepterButton.click();
        } catch (Exception e) {
            System.out.println("Le bouton 'Accepter' n'a pas été trouvé ou n'est pas cliquable : " + e.getMessage());
        }
	}
		
	
	
	public void waitAndClose() {
		
		Utility.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Utility.driver.close();
		Utility.driver.quit();
		
		
	}
	
	
}


