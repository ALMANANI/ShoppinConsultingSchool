package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Utility;

public class HomePage {
		
	
	public void accessLogin() {
		
		WebElement monCompte = Utility.driver.findElement(By.xpath("//a[@aria-label='Login']"));
		monCompte.click();
		
	}
	
	
	public void contactezNous() {
		WebElement contact = Utility.driver.findElement(By.xpath( "//li[@id='menu-item-1096']//a[@role='menuitem'][normalize-space()='Contact']"));
		contact.click();
	}

	public void hoverToBoutique() {
		
		WebElement elementBoutique = Utility.driver.findElement(By.xpath("//li[@id='menu-item-689']//a[@role='menuitem'][normalize-space()='Boutique']"));
		
		// Action à tte les formules comme (double clic , hover click ,...)
		Actions act = new Actions(Utility.driver);
		
		act.moveToElement(elementBoutique).build().perform();
		
	}
	
	public void Chaussure() {
		
		WebElement choisirChaussure = Utility.driver.findElement(By.xpath("//li[@id='menu-item-1552']//a[@role='menuitem'][normalize-space()='Chaussure']"));
		choisirChaussure.click();
		
	}
	
	
	
	
}
