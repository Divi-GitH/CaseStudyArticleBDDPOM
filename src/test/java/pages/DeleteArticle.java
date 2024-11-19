package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteArticle {
	
	@FindBy(linkText = " Delete Article")
	static
	WebElement DeleteBtn;

	
	public DeleteArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	  public static void DeleteMyArticle() throws InterruptedException {
		  DeleteBtn.click();
		  Thread.sleep(1000);
		  
	  }
	  
	  
	  
	  


}
