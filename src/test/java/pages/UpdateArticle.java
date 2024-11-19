package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateArticle {

		@FindBy(linkText = "Edit Article")
		static
		WebElement EditBtn;
	
		@FindBy(xpath ="//input[@name='description']")
		static
		WebElement description;
		
		@FindBy(xpath = "//button[contains(text(),'Update Article')]")
		static
		WebElement UpdateArticlebtn;
		
		public UpdateArticle(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		  public static void UpdateArticleView() throws InterruptedException {
			  EditBtn.click();
			  Thread.sleep(1000);
			  
		  }
		  
		  public static void UpdateArticledes() throws InterruptedException {
			  description.sendKeys("Updated description");
			  UpdateArticlebtn.click();
			  Thread.sleep(1000);
		  }
		  
		  
		  
		  

	}

