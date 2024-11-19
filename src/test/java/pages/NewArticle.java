package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewArticle {

	@FindBy(linkText = "New Article")
	WebElement NewArticleBtn;
		
	
	public NewArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	  public void NewArticleBtnC() throws InterruptedException {
		  NewArticleBtn.click();
		  Thread.sleep(1000);
		  
	  }


}
