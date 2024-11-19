package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewArticle {

	@FindBy(linkText = "New Article")
	static
	WebElement NewArticleBtn;
		
	
	public NewArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	  public static void NewArticleBtnC() throws InterruptedException {
		  NewArticleBtn.click();
		  Thread.sleep(1000);
		  
	  }

		@FindBy(name ="title")
		static
		WebElement title;
		
		@FindBy(xpath ="//input[@name='description']")
		static
		WebElement description;
		
		@FindBy(name ="body")
		static
		WebElement body;
		
		@FindBy(name ="tags")
		static
		WebElement tags;
		
		@FindBy(partialLinkText ="editor")
		public
		static
		WebElement PublishBtn;
		
		public static void testdata(String strtit, String strsum ,String strbody, String strtags) throws InterruptedException {
		title.sendKeys(strtit);
		description.sendKeys(strsum);
		body.sendKeys(strbody);
		tags.sendKeys(strtags);
//		PublishBtn.click();
		Thread.sleep(1000);
		}

		  public static void NewArticlePub() throws InterruptedException {
			  PublishBtn.click();
			  Thread.sleep(1000);
		  }

		public boolean isArticlecreated() {
			 return ((NewArticle) NewArticleBtn).isArticlecreated();
			
		}


}

