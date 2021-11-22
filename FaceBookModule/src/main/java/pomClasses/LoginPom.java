package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	
	
	private WebDriver driver;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement username ;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password ;
	
	@FindBy(xpath = "//button[text()='Log In']")
	 private WebElement login ;
	
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgotpass ;
	
	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement createNewacc ;
	
	
	
	public LoginPom(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsername() {
		username.sendKeys("9766373413");
	}
	
	public void sendPassword() {
		password.sendKeys("Gauri@321");
	}
	
	public void forgotPass() {
		forgotpass.click();
	}
	
	public void clickOnLogin() {
		
		
		login.click();
	}
	
	public void newAccount() {
		createNewacc.click();
	}

}
