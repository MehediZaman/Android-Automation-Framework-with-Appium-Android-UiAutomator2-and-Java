package pageObjects;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * @author Senior SDET Mehedi Zaman
 */

public class DashboardPO {

	private AndroidDriver<AndroidElement> driver;
	public WebDriverWait wait;

	public DashboardPO(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Close Update Modal
	@AndroidFindBy(id = "io.appium.android.apis:id/cross")
	private AndroidElement CloseUpdateModal;

	// Secondary Accounts
	@AndroidFindBy(id = "io.appium.android.apis:id/profile_name")
	private AndroidElement SecondaryDropdown;

//	Sr. SDET M Zaman - Primary Account
	// Secondary Accounts
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\" - Primary Account\"));")
	private AndroidElement PrimaryAccount;

	@AndroidFindBy(id = "io.appium.android.apis:id/tv_item_add_account")
	private AndroidElement AddSecondary;

	@AndroidFindBy(id = "io.appium.android.apis:id/account_val_rl")
	private List<AndroidElement> SecondaryAccountsList;

	// Do you want to delete the number from secondary account?
	@AndroidFindBy(id = "io.appium.android.apis:id/account_val_rl")
	private AndroidElement DeleteSecondaryAccounts;

	@AndroidFindBy(id = "android:id/button2")
	private AndroidElement DeleteSecondaryNo;

	@AndroidFindBy(id = "android:id/button1")
	private AndroidElement DeleteSecondaryYes;

	// Edit Profile
	@AndroidFindBy(id = "io.appium.android.apis:id/profile_image")
	private AndroidElement EditProfileLink;

	@AndroidFindBy(id = "io.appium.android.apis:id/profile_pic")
	private AndroidElement EditProfilePic;

	@AndroidFindBy(id = "io.appium.android.apis:id/nick_name")
	private AndroidElement EditProfileNick;

	@AndroidFindBy(id = "io.appium.android.apis:id/submit")
	private AndroidElement EditProfileSaveChanges;

	// Usage Statistics
	@AndroidFindBy(id = "io.appium.android.apis:id/header_data_total_data_tab_tittle")
	private AndroidElement UsageDataTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Voice']")
	private AndroidElement UsageVoiceTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SMS']")
	private AndroidElement UsageSmsTab;

	// ApiDebug Product / Manage Account
	@AndroidFindBy(id = "io.appium.android.apis:id/pack")
	private AndroidElement ApiDebugProduct;

	// Smart Recharge
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"SMART RECHARGES\"));")
	private AndroidElement RechargeSection;

	@AndroidFindBy(id = "io.appium.android.apis:id/quick_amount_3")
	private AndroidElement RechargeQuick100;

	@AndroidFindBy(id = "io.appium.android.apis:id/any_amount")
	private AndroidElement RechargeQuickOther;

	// Quick Links
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"QUICK LINKS\"));")
	private AndroidElement QuickLinksSection;

	@AndroidFindBy(id = "io.appium.android.apis:id/quick_link_item_1_icon")
	private AndroidElement QuickLinkMyOffers;

	@AndroidFindBy(id = "io.appium.android.apis:id/quick_link_item_2_icon")
	private AndroidElement QuickLinkInternet;

	@AndroidFindBy(id = "io.appium.android.apis:id/quick_link_item_3_icon")
	private AndroidElement QuickLinkMyPlan;

	@AndroidFindBy(id = "io.appium.android.apis:id/quick_link_item_4_icon")
	private AndroidElement QuickLinkCallHistory;

	// Banner Ad Promo
	@AndroidFindBy(id = "io.appium.android.apis:id/ivExample")
	private List<AndroidElement> BannerAds;

	// Weather
	@AndroidFindBy(id = "io.appium.android.apis:id/tv_temperature")
	private AndroidElement WeatherUpdateCelsius;

	// Favorite Apps
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Favourite apps\"));")
	private AndroidElement FavoriteAppsSection;

	@AndroidFindBy(id = "io.appium.android.apis:id/app1_icon")
	private AndroidElement FavAppFirst;

	// View All Links
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"View All Apps\"));")
	private AndroidElement ViewAllApps;

	@AndroidFindBy(id = "io.appium.android.apis:id/view_all_app")
	private AndroidElement ViewAllAppsLink;

	@AndroidFindBy(id = "io.appium.android.apis:id/login")
	private AndroidElement Login;

	@AndroidFindBy(id = "io.appium.android.apis:id/phn_text")
	private AndroidElement LoginApiDebug;

	@AndroidFindBy(id = "io.appium.android.apis:id/fb_text")
	private AndroidElement LoginFB;

	@AndroidFindBy(id = "io.appium.android.apis:id/gmail_text")
	private AndroidElement LoginGmail;

	@AndroidFindBy(id = "io.appium.android.apis:id/login_mobile_number_otp_et")
	private AndroidElement ApiDebugNumberText;

	@AndroidFindBy(id = "io.appium.android.apis:id/send_otp_login")
	private AndroidElement SendOtpButton;

	@AndroidFindBy(id = "io.appium.android.apis:id/login_mobile_number_otp_et")
	private AndroidElement OtpText;

	@AndroidFindBy(id = "io.appium.android.apis:id/send_otp_login")
	private AndroidElement OtpSubmitButton;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Many more\"));")
	private AndroidElement ManyMore;

	@AndroidFindBy(className = "UIAKeyboard")
	private AndroidElement keyboard;

	public void clickCloseModal() {
		try {
			CloseUpdateModal.click();
		} catch (Exception e) {
			System.out.println("Update dialog not displayed.");
		}
	}

	public void clickLogin() {
		// Login.click();
		try {
			wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.elementToBeClickable(Login)).click();
		} catch (Exception e) {
			System.out.println("Login button not found.");
		}
	}

	public void clickLoginMobileData() throws InterruptedException {
		this.clickLogin();
	}

	private void clickLoginApiDebug() {
		LoginApiDebug.click();
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
		this.submitLogin(msisdn, otp);
	}

	private void submitLogin(String msisdn, String otp)
			throws InterruptedException {
		hideKeyboardIfVisible();
		this.typeMSISDN(msisdn);
		this.submitOTP(otp);
		Thread.sleep(20000);
	}

	// PrimaryAccount
	public void selectSecondaryDropdown() {

		
	}

//	// PrimaryAccount
//	public void selectPrimaryAccount() {
//		
//		PrimaryAccount.click();
//	}
//
//	// PrimaryAccount
//	public void selectPrimaryAccount() {
//		PrimaryAccount.click();
//	}

	private void hideKeyboardIfVisible() {
		if (keyboard != null) {
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_ESCAPE);
		}
	}

	public void clickBackButton() {
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}

	public void testUsageStats() throws InterruptedException {

		this.clickUsageDataTab();
		Thread.sleep(2000);
		this.clickBackButton();

		this.clickUsageVoiceTab();
		Thread.sleep(2000);
		this.clickBackButton();

		this.clickUsageSmsTab();
		Thread.sleep(2000);
		this.clickBackButton();
	}

	private void clickUsageDataTab() {
		UsageDataTab.click();
	}

	private void clickUsageVoiceTab() {
		UsageVoiceTab.click();
	}

	private void clickUsageSmsTab() {
		UsageSmsTab.click();
	}

	public void testApiDebugProduct() throws InterruptedException {
		this.clickApiDebugProductLink();
		Thread.sleep(2000);
		this.clickBackButton();
	}

	private void clickApiDebugProductLink() {
		ApiDebugProduct.click();
	}

	public void testSmartRecharge() throws InterruptedException {
		this.scrollToViewRechargeSection();
		this.clickRechargeQuick100();
		Thread.sleep(2000);
		this.clickBackButton();
		Thread.sleep(2000);
		this.scrollToViewRechargeSection();
		this.clickRechargeQuickOther();
		Thread.sleep(3000);
		this.clickBackButton();
	}

	private void scrollToViewRechargeSection() {
		RechargeSection.click();
	}

	private void clickRechargeQuick100() {
		RechargeQuick100.click();
	}

	private void clickRechargeQuickOther() {
		RechargeQuickOther.click();
	}

	public void testQuickLinks() throws InterruptedException {
		this.scrollToViewQuickLinksSection();
		this.clickQuickLinkMyOffers();
		Thread.sleep(5000);
		this.clickBackButton();
		this.scrollToViewQuickLinksSection();
		this.clickQuickLinkInternet();
		Thread.sleep(5000);
		this.clickBackButton();
		this.scrollToViewQuickLinksSection();
		this.clickQuickLinkMyPlan();
		Thread.sleep(5000);
		this.clickBackButton();
		this.scrollToViewQuickLinksSection();
		this.clickQuickLinkCallHistory();
		Thread.sleep(20000);
		this.clickBackButton();
	}

	private void scrollToViewQuickLinksSection() {
		QuickLinksSection.click();
	}

	private void clickQuickLinkMyOffers() {
		QuickLinkMyOffers.click();
	}

	private void clickQuickLinkInternet() {
		QuickLinkInternet.click();
	}

	private void clickQuickLinkMyPlan() {
		QuickLinkMyPlan.click();
	}

	private void clickQuickLinkCallHistory() {
		QuickLinkCallHistory.click();
	}

	public void testBannerAdPromo() throws InterruptedException {
		this.scrollToViewQuickLinksSection();
		this.clickBannerAdApiDebugPromo();
		Thread.sleep(2000);
		this.clickBackButton();
	}

	private void clickBannerAdApiDebugPromo() {
		BannerAds.get(0).click();
	}

	public void testWeather() throws InterruptedException {
		this.checkWeatherUpdate();
		Thread.sleep(5000);
		this.clickBackButton();
	}

	private void checkWeatherUpdate() {
		this.scrollToViewFavoriteAppsSection();
		WeatherUpdateCelsius.click();
	}

	public void testFavApps() throws InterruptedException {
		this.scrollToViewFavoriteAppsSection();
		this.clickFirstFavoriteApp();
		Thread.sleep(2000);
		this.clickBackButton();
	}

	private void clickFirstFavoriteApp() {
		this.scrollToViewFavoriteAppsSection();
		FavAppFirst.click();
	}

	private void scrollToViewFavoriteAppsSection() {
		FavoriteAppsSection.click();
	}

	public void testViewAllAppsLink() throws InterruptedException {
		this.scrollToViewFavoriteAppsSection();
		this.clickViewAllAppsLink();
		Thread.sleep(5000);
		this.clickBackButton();
	}

	private void clickViewAllAppsLink() {
		this.scrollToViewFavoriteAppsSection();
		ViewAllAppsLink.click();
	}

	public void testBannerAdDeepLink() throws InterruptedException {
		this.scrollToViewFavoriteAppsSection();
		this.clickBannerAppDeepLink();
		Thread.sleep(5000);
		this.clickBackButton();
	}

	private void clickBannerAppDeepLink() {
		BannerAds.get(1).click();
	}

}
