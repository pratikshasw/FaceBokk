package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPOM {
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[contains(@aria-label,'Mobile number')]")
	private WebElement mobileNumber;
	
	
	@FindBy(xpath = "//input[@id='password_step_input']")
	private WebElement newPass;
	
	
	@FindBy(xpath = "//select[@id='day']")
	private WebElement day;
	
	@FindBy(xpath = "//select[@id='month']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@id='year']")
	private WebElement year;
	
	@FindBy(xpath = "(//input[@name='sex'])[1]")
	private WebElement female;
	
	@FindBy(xpath = "//input[@name='custom_gender']")
	private WebElement custom_gender;
	
	@FindBy(xpath = "(//input[@name='sex'])[2]")
	private WebElement male;
	
	@FindBy(xpath = "(//button[text()='Sign Up'])[1]")
	private WebElement signUp;
	
	public SignUpPOM(WebDriver driver1){
		PageFactory.initElements(driver1, this);
		
	}
	
	public void firstName() {
		firstName.sendKeys("Sanket");
	}
	
	public void lastName() {
		lastName.sendKeys("Patil");
	}
	
	public void mobileNumber() {
		mobileNumber.sendKeys("9766373413");
	}
	
	public void newPass() {
		newPass.sendKeys("Gauri@321");
	}
	
	public void day() {
		day.click();
	}
	
	public void month() {
		month.click();
	}
	
	public void year() {
		year.click();
	}

	public void female() {
		female.click();
	}

	public void male() {
		male.click();
	}
	

	public void custom_gender() {
		custom_gender.click();
	}
	
	public void signUp() {
		signUp.click();
	}

}
