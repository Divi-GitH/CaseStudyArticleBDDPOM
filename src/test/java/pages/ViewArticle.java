package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewArticle {
	@FindBy(linkText = "Home")
	static
	WebElement Home;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div/div/div[1]/ul/li[2]/button")
	static
	WebElement GlobalFeed;
	
	@FindBy(xpath = "//a[@href='#/article/divya-sample26']")
	static
	WebElement myarticle;
		
	
	public ViewArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
			
	}

	public static boolean ViewArticle() throws InterruptedException {
		ViewArticle.Home.click();
		Thread.sleep(1000);
        ViewArticle.GlobalFeed.click();
        Thread.sleep(1000);
		return true;
		
	}

	public static void ViewMyArticle() {
		myarticle.click();
		
	}

}

	
	