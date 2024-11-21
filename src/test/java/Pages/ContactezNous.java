package Pages;




import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Utility;

	public class ContactezNous {
	
	
	@FindBy (id = "wpforms-156-field_0")
	WebElement Nom;
	
	@FindBy (id = "wpforms-156-field_5")
	WebElement telephone;
	
	@FindBy (id = "wpforms-156-field_1")
	WebElement adresseMail;
	
	@FindBy (id = "wpforms-156-field_2")
	WebElement votreMessage;
	
	@FindBy (id = "wpforms-submit-156")
	WebElement submit;
	
	@FindBy (xpath = "//p[contains(text(),'Merci de nous avoir contacté! Nous vous contactero')]")
	WebElement text;
	
	@FindBy (id = "wpforms-156-field_5-error")
	WebElement msg;
	
	
	public ContactezNous() {
		
		PageFactory.initElements(Utility.driver, this);
	}
	
	
	
	public void contact(String nom , String tel , String mail , String msg) {
		
				 
		Nom.sendKeys(nom);
		telephone.sendKeys(tel);
		adresseMail.sendKeys(mail);
		votreMessage.sendKeys(msg);	
		
		// Attente explicite pour s'assurer que le bouton est cliquable
		
       // WebDriverWait attendre = new WebDriverWait(Utility.driver, Duration.ofSeconds(10));
       // attendre.until(ExpectedConditions.elementToBeClickable(submit));
        
		submit.sendKeys(Keys.ENTER);
		
	}
	
	
	public String voirLeMessage() {
		
		return text.getText();
		
	}
	
	
	public String messageErreur() {
		
		return msg.getText();
	}
	
	
	

}
