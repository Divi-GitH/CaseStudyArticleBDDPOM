package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import base.TestBase;
import pages.ArticleLoginPage;
import pages.NewArticle;
import pages.ViewArticle;
import pages.UpdateArticle;

public class ArticleCreationCS {
	  WebDriver driver;
	  ArticleLoginPage LoginPage;
	  NewArticle NewArticle;
	  ViewArticle ViewArticle;
//	  UpdateArticle UpdateArticle;
	
  
	  public ArticleCreationCS() {
	
		  TestBase.initdriver();
		  driver = TestBase.getDriver();
		  LoginPage = new ArticleLoginPage(driver);
		  NewArticle = new NewArticle(driver);
		  ViewArticle = new ViewArticle(driver);
//		  UpdateArticle = new UpdateArticle(driver);
		  
	  }
@Test
	  public void setup() throws InterruptedException {
		  TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");
		  LoginPage.validLogin("divi.divyalakshmi3@gmail.com", "Divya@22");
//		  UpdateArticle.UpdateArticleView();
			Thread.sleep(1000);
}        

}


//"Selenium's Syperpowers: Why it Stands out";

	
//	ArticleDetailspage.validdata("Divya Lakshmi- Selenium Article");
		
//			"Selenium's Syperpowers: Why it Stands out", 
//			"Selenium is like a hero on a quest to save the user eperience from bugs and glitches", 
//			"Fun Facts About Selenium");


