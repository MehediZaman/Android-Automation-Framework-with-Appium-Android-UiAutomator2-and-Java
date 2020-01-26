package pageObjects;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

/*
 * @author Senior SDET Mehedi Zaman
 */

public class PreloginPO {

	private AndroidDriver<AndroidElement> driver;

	public PreloginPO(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Login Selection
	@AndroidFindBy(id = "io.appium.android.apis:id/login")
	private AndroidElement Login;

	@AndroidFindBy(id = "io.appium.android.apis:id/phn_text")
	private AndroidElement LoginApiDebug;

	@AndroidFindBy(id = "io.appium.android.apis:id/fb_text")
	private AndroidElement LoginFB;

	@AndroidFindBy(id = "io.appium.android.apis:id/gmail_text")
	private AndroidElement LoginGmail;

	// Login with ApiDebug
	@AndroidFindBy(id = "io.appium.android.apis:id/login_mobile_number_otp_et")
	private AndroidElement ApiDebugNumberText;

	@AndroidFindBy(id = "io.appium.android.apis:id/send_otp_login")
	private AndroidElement SendOtpButton;

	@AndroidFindBy(id = "io.appium.android.apis:id/login_mobile_number_otp_et")
	private AndroidElement OtpText;

	@AndroidFindBy(id = "io.appium.android.apis:id/send_otp_login")
	private AndroidElement OtpSubmitButton;

	// Recharge
	@AndroidFindBy(id = "io.appium.android.apis:id/imageView5")
	private AndroidElement Recharge;

	@AndroidFindBy(id = "io.appium.android.apis:id/amount_textview")
	private List<AndroidElement> RechargeQuickAmounts;

	@AndroidFindBy(id = "io.appium.android.apis:id/recharge_msisdn")
	private AndroidElement ApiDebugRechargeNumber;

	@AndroidFindBy(id = "io.appium.android.apis:id/amount")
	private AndroidElement RechargeAmountOther;

	@AndroidFindBy(id = "io.appium.android.apis:id/recharge")
	private AndroidElement ConfirmRecharge;

	// Buy Tickets
	@AndroidFindBy(id = "io.appium.android.apis:id/imageView6")
	private AndroidElement BuyTickets;

	// ApiDebug Shop
	@AndroidFindBy(id = "io.appium.android.apis:id/imageView7")
	private AndroidElement ApiDebugShop;

	// Win Back
	@AndroidFindBy(id = "io.appium.android.apis:id/ivWinBack")
	private AndroidElement WinBack;

	@AndroidFindBy(id = "io.appium.android.apis:id/add_fnf_mobile_number_et")
	private AndroidElement WinBackApiDebugNumber;

	@AndroidFindBy(id = "io.appium.android.apis:id/btnCheckWinBackEligibility")
	private AndroidElement WinBackEligibilitySubmitButton;

	@AndroidFindBy(id = "android:id/button1")
	private AndroidElement WinBackOKButton;

	@AndroidFindBy(id = "android:id/message")
	private AndroidElement WinBackMessage;

	// Many More -> Login Selection
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Many more\"));")
	private AndroidElement ManyMore;

	// UI Keyboard
	@AndroidFindBy(className = "UIAKeyboard")
	private AndroidElement keyboard;

	public void clickLogin() {
		Login.click();
	}

	public void clickLoginApiDebug() {
		LoginApiDebug.click();
	}

	public boolean isDisplayed() {
		return Login.isDisplayed();
	}

	private void typeMSISDN(String msisdn) {
		ApiDebugNumberText.sendKeys(msisdn);
		SendOtpButton.click();
	}

	private void submitOTP(String otp) {
		OtpText.sendKeys(otp);
		OtpSubmitButton.click();
	}

	public void testPositiveLogin(String msisdn, String otp)
			throws InterruptedException {
		this.ManyMore.click();
		this.clickLoginApiDebug();
		Thread.sleep(2000);
		this.submitLogin(msisdn, otp);
	}

	private void submitLogin(String msisdn, String otp)
			throws InterruptedException {
		hideKeyboardIfVisible();
		this.typeMSISDN(msisdn);
		this.submitOTP(otp);
		Thread.sleep(20000);
	}

	public void testRecharge(String msisdn, String amount)
			throws InterruptedException {
		this.checkRechargeQuick(msisdn);
		this.clickBackButton();
		Thread.sleep(2000);
		this.clickBackButton();
		Thread.sleep(2000);
		checkRechargeQuickOther(msisdn, amount);
		this.clickBackButton();
		Thread.sleep(2000);
		this.clickBackButton();
		Thread.sleep(2000);
	}

	private void clickRechargeQuick50() {
		RechargeQuickAmounts.get(2).click();
	}

	private void checkRechargeQuick(String msisdn) {
		this.clickRecharge();
		this.typeRechargeNumber(msisdn);
		this.clickRechargeQuick50();
		submitRecharge();
	}

	private void checkRechargeQuickOther(String msisdn, String amount) {
		this.clickRecharge();
		this.typeRechargeNumber(msisdn);
		this.typeRechargeAmount(amount);
		submitRecharge();
	}

	public void clickRecharge() {
		Recharge.click();
	}

	private void typeRechargeAmount(String amount) {
		RechargeAmountOther.sendKeys(amount);
	}

	private void typeRechargeNumber(String msisdn) {
		ApiDebugRechargeNumber.sendKeys(msisdn);
	}

	public void submitRecharge() {
		ConfirmRecharge.click();
	}

	public void testBuyTickets() throws InterruptedException {
		this.BuyTickets.click();
		Thread.sleep(2000);
		this.clickBackButton();
	}

	public void clickBuyTickets() {
		BuyTickets.click();
	}

	public void testApiDebugShop() throws InterruptedException {
		this.ApiDebugShop.click();
		Thread.sleep(2000);
		this.clickBackButton();
	}

	public void clickApiDebugShop() {
		ApiDebugShop.click();
	}

	public void testWinBack(String msisdn) throws InterruptedException {
		this.clickWinBack();
		this.typeWinBackNumber(msisdn);
		Thread.sleep(2000);
		submitWinBackEligibility();
		Thread.sleep(2000);
		checkWinBackMessage();
		this.clickBackButton();
	}

	public void clickWinBack() {
		WinBack.click();
	}

	private void typeWinBackNumber(String msisdn) {
		WinBackApiDebugNumber.sendKeys(msisdn);
	}

	public void submitWinBackEligibility() {
		WinBackEligibilitySubmitButton.click();
	}

	public void checkWinBackMessage() {
		String winbackinfo = WinBackMessage.getText();
		assert (winbackinfo).contains("YOU are eligible!");
		this.checkWinBackOKButton();
	}

	public void checkWinBackOKButton() {
		WinBackOKButton.click();
	}

	public void clickManyMore() {
		ManyMore.click();
	}

	public void clickBackButton() {
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}

	public void hideKeyboardIfVisible() {
		if (keyboard != null) {
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_ESCAPE);
		}
	}

	public void testLoginButton() throws InterruptedException {
		this.Login.click();
		Thread.sleep(2000);
		this.clickBackButton();
	}

}
