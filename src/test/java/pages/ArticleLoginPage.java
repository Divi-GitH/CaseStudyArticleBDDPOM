package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticleLoginPage {
	//PageFactory Pattern -
	//Case Study-1 New Article --> login page	
	
//	https://conduit-realworld-example-app.fly.dev/#/ 
	@FindBy(xpath = "//*[@id=\"root\"]/header/nav/div/ul[2]/li[2]/a")
	WebElement loginlnk;
	
	@FindBy(name= "email")
	WebElement email;
	
	@FindBy(name= "password")
	WebElement pwd;	
	
	@FindBy(xpath= "//*[@id=\"root\"]/main/div/div/div/div/form/button")
	WebElement loginBtn;

	public ArticleLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void validLogin(String strUser, String strPwd) {
		loginlnk.click();
		email.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		loginBtn.click();
	}
}
