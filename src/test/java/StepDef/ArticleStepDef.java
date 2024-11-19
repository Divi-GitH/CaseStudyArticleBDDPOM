package StepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArticleLoginPage;
import pages.NewArticle;



public class ArticleStepDef {
//	WebDriver driver;  
	WebDriver  driver= TestBase.getDriver();
	  ArticleLoginPage Articleloginpage;
	  static NewArticle NewArticlepage;

	  
	  public ArticleStepDef() {
		  Articleloginpage = new ArticleLoginPage(driver);
		  NewArticlepage = new NewArticle(driver);
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
	  }
	  
@When("User enters Article details")
public void user_enter_article_details(DataTable dataTable) throws InterruptedException {
	List<Map<String, String>> data = dataTable.asMaps();
	String strtit = data.get(0).get("title");
	String strsum = data.get(0).get("description");
	String strbody = data.get(0).get("body");
	String strtags = data.get(0).get("tags");
	driver.findElement(By.name("title")).sendKeys(strtit);
	driver.findElement(By.name("description")).sendKeys(strsum);
	driver.findElement(By.name("body")).sendKeys(strbody);
	driver.findElement(By.name("tags")).sendKeys(strtags);
	NewArticle.testdata(strtit,strsum,strbody,strtags);
}

@Then("Article must be created")
public void Article_must_be_created() {
	NewArticlepage.viewArticle();
}
}