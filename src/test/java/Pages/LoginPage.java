package Pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Utility;

public class LoginPage {
	
	
	
	//@FindBy(xpath  = "//a[@aria-label='Login']")
	//WebElement pageConnex;
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//p[contains(text(),'Hello')]")
	WebElement welcomeText;	
	
	//@FindBy(xpath = "//button[normalize-space()='Se connecter']")
	//WebElement submit;
	
	//@FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/button[2]") 
    //WebElement closeCookiesBanner;
			
	
	
	
	public LoginPage(){
		
		PageFactory.initElements(Utility.driver, this);
	}
		
	
	
	public void login(String nom , String mdp) {
		
		//closeCookiesBanner.click();
		//pageConnex.click();		 
		username.sendKeys(nom);
		password.sendKeys(mdp);
		// password.sendKeys(mdp + Keys.ENTER); On peut faire comme ça aussi
		password.sendKeys(Keys.ENTER);
		//submit.click();		
		
	}
	
	
	public String getAcualWelcomeText() {
		
		return welcomeText.getText() ;
		
	}
	

	
}

