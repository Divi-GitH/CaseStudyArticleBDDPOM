package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteArticle {
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div/div[1]/div/div/button[1]")
	static
	WebElement DeleteBtn;
	
	public DeleteArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	  public static void DeleteMyArticle() throws InterruptedException {
		  DeleteArticle.DeleteBtn.click();
		  Thread.sleep(1000);  
	  }			
		}
	  
	  
	
