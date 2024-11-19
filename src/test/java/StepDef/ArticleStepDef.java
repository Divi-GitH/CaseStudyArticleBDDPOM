package StepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArticleLoginPage;
import pages.DeleteArticle;
import pages.NewArticle;
import pages.UpdateArticle;
import pages.ViewArticle;
import pages.DeleteArticle;



public class ArticleStepDef {
//	WebDriver driver;  
	WebDriver  driver= TestBase.getDriver();
	  ArticleLoginPage Articleloginpage;
	  static NewArticle NewArticlepage;
	  static ViewArticle ViewArticlepage;
	  static UpdateArticle UpdateArticlepage;
	  static DeleteArticle DeleteArticlepage;

	  
	  public ArticleStepDef() {
		  Articleloginpage = new ArticleLoginPage(driver);
		  NewArticlepage = new NewArticle(driver);
		  ViewArticlepage = new ViewArticle(driver);
		  UpdateArticlepage = new UpdateArticle(driver);
		  DeleteArticlepage = new DeleteArticle(driver);
		  
	  }

	  @Given("User is on Login page")
	  public void user_is_on_login_page() {
	  TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");   
    
}
	  @When("User provide {string} and {string}")
	  public void user_provide_and(String strUser, String strPwd) throws InterruptedException {
		  Articleloginpage.validLogin(strUser, strPwd);
		  
			Thread.sleep(1000);
}
	  @Then("User should be on Home Page")
	  public void user_should_be_on_home_page() {
	  }
	  @Given("User should be on new  Page")
	  public void user_should_be_on_new_page() throws InterruptedException {
		  NewArticlepage.NewArticleBtnC();
		  Thread.sleep(1000);
	  }
	  
@When("User enters Article details")
public void user_enter_article_details(DataTable dataTable) throws InterruptedException {
	List<Map<String, String>> data = dataTable.asMaps();
	String strtit = data.get(0).get("title");
	String strsum = data.get(0).get("description");
	String strbody = data.get(0).get("body");
	String strtags = data.get(0).get("tags");
	NewArticle.testdata(strtit, strsum, strbody, strtags);
	Thread.sleep(1000);
}
// Article created successfully 
@Then("Article must be created")
public void Article_must_be_created(DataTable dataTable) throws InterruptedException {
	List<List<String>> msg = dataTable.asLists();
	String expMsg = msg.get(0).get(0);
	System.out.println("Expected text for success msg ..." + expMsg);
	Thread.sleep(1000);
}
// page navigated to Global feed
@Given("User should be on Global Feed Page")
public void user_should_be_on_global_feed_page() throws InterruptedException {
	 Assert.assertTrue(ViewArticle.ViewArticle());
	  Thread.sleep(1000);
}
// Able to view the My Article
@When("User select an article {string}")
public void user_select_an_article(String strtit) throws InterruptedException {
	ViewArticle.ViewMyArticle();
}

@Then("Article detail page must be displayed")
public void article_detail_page_must_be_displayed() {
}

// CLick on Edit button
@When("User update article detail")
public void user_update_article_detail() throws InterruptedException {
	UpdateArticle.UpdateArticleView();

}

@Then("Article details must be updated")
public void article_details_must_be_updated() throws InterruptedException {
	UpdateArticle.UpdateArticledes();

}

@When("User delete article")
public void user_delete_article() throws InterruptedException {
	DeleteArticlepage.DeleteMyArticle();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();

}

@Then("Article must be deleted")
public void article_must_be_deleted() {
	

}
@After
public void attachScreenshot(Scenario scenario) {
	if(scenario.isFailed()) {
		TakesScreenshot screen = (TakesScreenshot)driver;
		byte[] imgBytes = screen.getScreenshotAs(OutputType.BYTES);
				scenario.attach(imgBytes, "image/png", "ScreenImage");
	}
}
}