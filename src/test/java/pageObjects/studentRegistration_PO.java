package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class studentRegistration_PO {

	public WebDriver driver;

	public studentRegistration_PO(WebDriver driver) {

		this.driver = driver;

	}

	By enterfirstName = By.xpath("//input[@id='firstName']");
	By enterlastName = By.xpath("//input[@id='lastName']");
	By enterEmail = By.xpath("//input[@id='email']");
	By enterPhone = By.xpath("//input[@type='tel']");
	By enterPwd = By.xpath("//input[@id='password']");
	By enterConfirmed = By.xpath("//input[@id='confirmPassword']");
	By SiginUpbtn = By.cssSelector(".css-nxzcop");
	By SiginUp=By.xpath("//*[text()='Sign Up']");
	By checkbox = By.cssSelector(".css-1m9pwf3");
	By loginhere = By.xpath("//span[text()='Log in']");

	public void enterfirstname(String name) {
		driver.findElement(enterfirstName).sendKeys(name);
	}
	
	public void enterlastname(String name) {
		driver.findElement(enterlastName).sendKeys(name);
	}

	public void enterEmail(String email) {

		driver.findElement(enterEmail).sendKeys(email);
	}

	public void enterPhoneno(String number) {

		driver.findElement(enterPhone).sendKeys(number);
	}

	public void enterpassword(String pwd) {
		driver.findElement(enterPwd).sendKeys(pwd);

	}

	public void enterConfirmed(String pwd) {
		driver.findElement(enterConfirmed).sendKeys(pwd);

	}

	public void clickSiginUpBtn() {

		driver.findElement(SiginUp).click();
	}

	public void clickonCheckBox() {

		driver.findElement(checkbox).click();
	}

	public void verifyloginherebutton() {

		driver.findElement(loginhere).isDisplayed();

	}

	public void verifySiginUpbutton() {

		driver.findElement(SiginUp).isDisplayed();

	}

}
