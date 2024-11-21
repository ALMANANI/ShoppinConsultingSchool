package locators;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.BasePage;
import Utilities.Utility;
public class Locators {
	
	
	String name = "boutique";
	@Test
	public void locators() {
		Utility.driver= new ChromeDriver();
		Utility.driver.get("https://shop-in.ovh/");
		// Selectionner toutes les balises a avec un attribut class
		List<WebElement> liste_elements = Utility.driver.findElements(By.xpath("//a[@class]"));
		
		// Selectionner tous les descendents de li
		
		List<WebElement> liste_elements1 = Utility.driver.findElements(By.xpath("li"));
		
		// Selectionner une balise a qui contient un texte egal a Boutique et il est dans un ul la ou il y a id = menu-main-menu-1
		
		List<WebElement> liste_elements0 = Utility.driver.findElements(By.xpath("//ul[@id='menu-main-menu-1']//a[contains(text(), 'Boutique')]"));
		
		// Selectionner une balise a avec un href specifique egale a href='https://shop-in.ovh/boutique/
		
		List<WebElement> liste_elements2 = Utility.driver.findElements(By.xpath("//a[@href='https://shop-in.ovh/boutique/']"));
		// Selectionner une balise contenant une partie de texte dans le href qui est egale a boutique
		List<WebElement> liste_elements3 = Utility.driver.findElements(By.xpath("//a[contains(@href,'boutique')]"));
		
		// Selectionner une balise contenant une partie de texte dans le href qui est egale a boutique et qui a un role egale a menuitem
		List<WebElement> liste_elements4 = Utility.driver.findElements(By.xpath("//a[contains(@href,'boutique') and @role='menuitem']"));
		// Selectionner une balise contenant une partie de texte dans le href qui est egale a boutique Ou bien qui a un role egale a menuitem
		List<WebElement> liste_elements5 = Utility.driver.findElements(By.xpath("//a[contains(@href,'boutique') or @role='menuitem']"));
		
		// Selectionner une balise contenant une partie de texte dans le href qui commence par http
		List<WebElement> liste_elements6 = Utility.driver.findElements(By.xpath("//a[starts-with(@href, 'a')]"));
		
		
		// Selectionner une balise contenant une partie de texte dans le href qui commence par http
		List<WebElement> liste_elements7 = Utility.driver.findElements(By.xpath("//a[@index > 5]"));
		
		// Selectionner une balise contenant une partie de texte dans le href pour concatener l'url avec le nom de la page
//		List<WebElement> liste_elements8 = Utility.curseur.findElements(By.xpath("//a[concat('https://shop-in.ovh/', + name+) ]"));
		
		
		for (WebElement elemet : liste_elements2) {
			System.out.println(elemet.getTagName());
			
		System.out.println(	elemet.getAttribute("innerHTML"));
			
		}
	}
}
