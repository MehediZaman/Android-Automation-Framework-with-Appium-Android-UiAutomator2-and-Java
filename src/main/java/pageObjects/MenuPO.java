package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class MenuPO {

	private AndroidDriver<AndroidElement> driver;
	public WebDriverWait wait;

	public MenuPO(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 1,
				TimeUnit.SECONDS), this);
	}

	// Close Update Modal / Collapse Menu
	@AndroidFindBy(id = "io.appium.android.apis:id/cross")
	private AndroidElement CloseUpdateModal;

	// Hamburger menu
	@AndroidFindBy(id = "io.appium.android.apis:id/hamburger")
	private AndroidElement MainMenu;

	// Home
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Home']")
	private AndroidElement Home;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Manage Account']")
	private AndroidElement ManageAccount;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='ApiDebug World']")
	private AndroidElement ApiDebugWorld;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Internet Packs']")
	private AndroidElement InternetPacks;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Find my internet pack\"));")
	private AndroidElement FindMyDataPack;

	@AndroidFindBy(id = "io.appium.android.apis:id/validity")
	private AndroidElement DataValidity;

	@AndroidFindBy(id = "io.appium.android.apis:id/item_details")
	private List<AndroidElement> DataPackDetails;
	// private AndroidElement DataPackDetail = DataPackDetails.get(1);

	@AndroidFindBy(id = "io.appium.android.apis:id/search_package")
	private AndroidElement DataPackSearchSubmit;

	@AndroidFindBy(id = "io.appium.android.apis:id/reset")
	private AndroidElement ResetDataPackFilter;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='MyPlan']")
	private AndroidElement MyPlan;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Bundles']")
	private AndroidElement Bundles;

	// 251tk 30D combo
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"251tk 30D combo\"));")
	private AndroidElement Bundle251tk30D;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Value Added Services']")
	private AndroidElement VAS;

	@AndroidFindBy(id = "io.appium.android.apis:id/reset")
	private AndroidElement AddNewVAS;

	@AndroidFindBy(id = "io.appium.android.apis:id/reset")
	private List<AndroidElement> AddNewVasTabs;
	// private AndroidElement MobileAssistTab = AddNewVasTabs.get(0);
	// private AndroidElement MusicTab = AddNewVasTabs.get(1);
	// private AndroidElement NewsTab = AddNewVasTabs.get(2);
	// private AndroidElement SocialTab = AddNewVasTabs.get(3);

	@AndroidFindBy(id = "io.appium.android.apis:id/vas_activate_button")
	private List<AndroidElement> ActiveButtons;
	/*
	 * private AndroidElement ActivateCallManager = ActiveButtons.get(0);
	 * private AndroidElement ActivateRadioDaily = ActiveButtons.get(1);
	 */
	@AndroidFindBy(id = "io.appium.android.apis:id/dialog_dismiss_btn")
	private AndroidElement VasAcceptDialog;

	@AndroidFindBy(id = "io.appium.android.apis:id/remove_all_vas_textview")
	private AndroidElement RemoveAllVas;

	@AndroidFindBy(id = "io.appium.android.apis:id/vas_activate_button")
	private List<AndroidElement> DeactivateButtons;
	/*
	 * private AndroidElement DeactivateVAS = DeactivateButtons.get(0);
	 */

	// Recharge
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Recharge\"));")
	private AndroidElement Recharge;

	@AndroidFindBy(id = "io.appium.android.apis:id/amount_textview")
	private List<AndroidElement> RechargeQuickAmounts;

	@AndroidFindBy(id = "io.appium.android.apis:id/recharge_msisdn")
	private AndroidElement ApiDebugRechargeNumber;

	@AndroidFindBy(id = "io.appium.android.apis:id/amount")
	private AndroidElement RechargeAmountOther;

	@AndroidFindBy(id = "io.appium.android.apis:id/recharge")
	private AndroidElement ConfirmRecharge;

	// Manage FnF
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Manage FnF\"));")
	private AndroidElement ManageFnF;

	// Goon Goon
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Goon Goon\"));")
	private AndroidElement GoonGoon;

	// My Offers
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"My Offers\"));")
	private AndroidElement MyOffers;

	// Win Back
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Win Back\"));")
	private AndroidElement WinBack;

	@AndroidFindBy(id = "io.appium.android.apis:id/add_fnf_mobile_number_et")
	private AndroidElement WinBackApiDebugNumber;

	@AndroidFindBy(id = "io.appium.android.apis:id/btnCheckWinBackEligibility")
	private AndroidElement WinBackEligibilitySubmitButton;

	@AndroidFindBy(id = "android:id/button1")
	private AndroidElement WinBackOKButton;

	@AndroidFindBy(id = "android:id/message")
	private AndroidElement WinBackMessage;

	// ApiDebug Shop
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"ApiDebug Shop\"));")
	private AndroidElement ApiDebugShop;

	// Buy Tickets
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Buy Tickets\"));")
	private AndroidElement BuyTickets;

	// Balance Transfer
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Balance Transfer\"));")
	private AndroidElement BalanceTransfer;

	@AndroidFindBy(id = "io.appium.android.apis:id/add_fnf_mobile_number_et")
	private AndroidElement BTApiDebugNumber;

	@AndroidFindBy(id = "io.appium.android.apis:id/amount_textview")
	private List<AndroidElement> BTQuickAmounts;

	@AndroidFindBy(id = "io.appium.android.apis:id/sent_otp")
	private AndroidElement BTSendOTPButton;

	@AndroidFindBy(id = "io.appium.android.apis:id/btn_check_otp")
	private AndroidElement BalanceTransferGift;

	// Rating for Balance Transfer
	@AndroidFindBy(id = "io.appium.android.apis:id/dialog_rating_rating_bar")
	private AndroidElement RatingBar;

	@AndroidFindBy(id = "io.appium.android.apis:id/dialog_rating_feedback")
	private AndroidElement RatingFeedbackText;

	@AndroidFindBy(id = "io.appium.android.apis:id/dialog_rating_button_feedback_cancel")
	private AndroidElement SubmitRating;

	// Roaming
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Roaming\"));")
	private AndroidElement Roaming;

	// Your roaming is in Progress
	@AndroidFindBy(id = "io.appium.android.apis:id/tv_roaming_active_text")
	private AndroidElement RoamingStatus;

	// Your roaming creation is in progress. It will take approximately 5-10
	// minutes. You will be notified after roaming creation.
	@AndroidFindBy(id = "io.appium.android.apis:id/tv_status")
	private AndroidElement RoamingStatusDetails;

	// Refer a Friend
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Refer a Friend\"));")
	private AndroidElement ReferFriend;

	@AndroidFindBy(id = "io.appium.android.apis:id/tv_ref_code_h")
	private AndroidElement ReferTitle;

	@AndroidFindBy(id = "io.appium.android.apis:id/tv_referral_link")
	private AndroidElement ReferLink;

	@AndroidFindBy(id = "io.appium.android.apis:id/btn_share_ref")
	private AndroidElement ReferShareFriends;

	// android:id/text1
	@AndroidFindBy(id = "android:id/text1")
	private List<AndroidElement> ShareMedia;
	/* private AndroidElement ShareByMail = ShareMedia.get(6); */

	// Type To Address
	@AndroidFindBy(id = "com.google.android.gm:id/to")
	private AndroidElement GmailToAddressText;

	// Send mail
	@AndroidFindBy(id = "com.google.android.gm:id/send")
	private AndroidElement GmailSendButton;

	// Shop Locator
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Shop Locator\"));")
	private AndroidElement ShopLocator;

	// Shop Locator - Search Box
	@AndroidFindBy(id = "io.appium.android.apis:id/editText3")
	private AndroidElement ApiDebugShebaSearchText;

	// Shop Locator - Search Results
	@AndroidFindBy(id = "android:id/text1")
	private List<AndroidElement> SearchApiDebugShebaResultsText;
	/*
	 * private AndroidElement SearchApiDebugShebaFirstResult =
	 * SearchApiDebugShebaResultsText .get(0);
	 */
	// Shop Locator - Cancel Search Results
	@AndroidFindBy(id = "io.appium.android.apis:id/concel_text")
	private AndroidElement ApiDebugShebaCancelSearch;

	// Customer Service
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Customer Service\"));")
	private AndroidElement CustomerService;

	// Customer Service
	@AndroidFindBy(uiAutomator = "io.appium.android.apis:id/create_complain")
	private AndroidElement CreateComplain;

	// Customer Service
	@AndroidFindBy(uiAutomator = "io.appium.android.apis:id/type_spinner")
	private AndroidElement ComplainType;

	// Customer Service - First Dropdown
	@AndroidFindBy(id = "android:id/text1")
	private List<AndroidElement> ComplainListText;
	/*
	 * private AndroidElement Calling = ComplainListText.get(1);
	 */
	// Customer Service - Third Dropdown
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Call Drop']")
	private AndroidElement CallDrop;

	//
	// Customer Service
	@AndroidFindBy(uiAutomator = "io.appium.android.apis:id/area_spinner")
	private AndroidElement ComplainArea;

	// Customer Service
	@AndroidFindBy(uiAutomator = "io.appium.android.apis:id/subarea_spinner")
	private AndroidElement ComplainSubArea;

	// This complain is for My ApiDebug App development
	// Customer Service
	@AndroidFindBy(uiAutomator = "io.appium.android.apis:id/quest_details")
	private AndroidElement ComplainDescription;

	// Customer Service
	@AndroidFindBy(uiAutomator = "io.appium.android.apis:id/next")
	private AndroidElement ComplainNextPage;

	// Customer Service
	@AndroidFindBy(uiAutomator = "io.appium.android.apis:id/complain_quis_edit_text")
	private List<AndroidElement> ComplainQuestions;
	/*
	 * private AndroidElement ComplainQuestion1 = ComplainQuestions.get(0);
	 * private AndroidElement ComplainQuestion2 = ComplainQuestions.get(1);
	 */
	// Customer Service
	@AndroidFindBy(uiAutomator = "android:id/button1")
	private AndroidElement ComplainCalendarOK;

	// Customer Service
	@AndroidFindBy(uiAutomator = "io.appium.android.apis:id/submit")
	private AndroidElement ComplainSubmitButton;

	// About Us
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"About Us\"));")
	private AndroidElement AboutUs;

	// About Us
	@AndroidFindBy(id = "io.appium.android.apis:id/current_my_ApiDebug_version")
	private AndroidElement AppVersion;

	// About Us
	@AndroidFindBy(id = "io.appium.android.apis:id/avaailable_my_ApiDebug_version")
	private AndroidElement AppVersionAvailable;

	// About Us
	@AndroidFindBy(id = "io.appium.android.apis:id/update_btn")
	private AndroidElement UpdateButton;

	// PIN PUK
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"PIN PUK\"));")
	private AndroidElement PinPuk;

	// PIN PUK
	@AndroidFindBy(id = "io.appium.android.apis:id/current_my_ApiDebug_version")
	private AndroidElement PinPukTitle;

	// PIN 1: 1234
	// PUK 1: 46929664
	// PIN PUK
	@AndroidFindBy(id = "io.appium.android.apis:id/pin1")
	private AndroidElement Pin1;

	// PIN PUK
	@AndroidFindBy(id = "io.appium.android.apis:id/puk1")
	private AndroidElement Puk1;

	// Sign Out
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sign Out\"));")
	private AndroidElement SignOut;

	// Sign Out - LOGOUT
	@AndroidFindBy(id = "io.appium.android.apis:id/dialog_rating_button_feedback_cancel")
	private AndroidElement LogOut;

	// io.appium.android.apis:id/dialog_rating_button_feedback_cancel
	@AndroidFindBy(id = "io.appium.android.apis:id/quick_amount_3")
	private AndroidElement RechargeQuick100;

	@AndroidFindBy(id = "io.appium.android.apis:id/any_amount")
	private AndroidElement RechargeQuickOther;

	// Weather
	@AndroidFindBy(id = "io.appium.android.apis:id/tv_temperature")
	private AndroidElement WeatherUpdateCelsius;

	// Favorite Apps
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Favourite apps\"));")
	private AndroidElement FavoriteAppsSection;

	@AndroidFindBy(id = "io.appium.android.apis:id/app1_icon")
	private AndroidElement FavAppFirst;

	// @WithTimeout(time = 35, unit = TimeUnit.SECONDS)
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

	private void hideKeyboardIfVisible() {
		driver.hideKeyboard();
	}

	public void clickCloseModal() {
		CloseUpdateModal.click();
	}

	public void clickMainMenu() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(MainMenu)).click();
	}

	public void clickHome() {
		this.clickMainMenu();
		Home.click();
		CloseUpdateModal.click();
	}

	// Main Menu - Home
	public void testHomeButton() throws InterruptedException {
		this.clickAboutUs();
		this.clickHome();
	}

	// MainMenu
	public void testManageAccount() throws InterruptedException {
		this.clickManageAccount();
		Thread.sleep(2000);
		FavoriteAppsSection.click();
		this.clickFirstFavoriteApp();
		Thread.sleep(5000);
		this.clickBackButton();
	}

	// Manage Account
	public void clickManageAccount() throws InterruptedException {
		this.clickMainMenu();
		ManageAccount.click();
	}

	// ApiDebug World
	public void testApiDebugWorld() throws InterruptedException {
		this.clickApiDebugWorld();
		Thread.sleep(2000);
	}

	public void clickApiDebugWorld() throws InterruptedException {
		this.clickMainMenu();
		ApiDebugWorld.click();
	}

	// Internet Packs
	public void testInternetPacks() throws InterruptedException {
		this.clickInternetPacks();
		this.clickFindMyDataPack();
		this.selectDataPackValidityTab();
		// this.selectDataPackFilter();
		this.submitDataPackFilter();
		this.resetDataPackFilter();
		Thread.sleep(2000);
	}

	public void clickInternetPacks() throws InterruptedException {
		this.clickMainMenu();
		InternetPacks.click();
	}

	public void clickFindMyDataPack() {
		FindMyDataPack.click();
	}

	public void selectDataPackValidityTab() {
		DataValidity.click();
	}

	/*
	 * public void selectDataPackFilter() { DataPackDetail.click(); }
	 */
	public void submitDataPackFilter() {
		DataPackSearchSubmit.click();
	}

	public void resetDataPackFilter() {
		ResetDataPackFilter.click();
	}

	// MyPlan
	public void testMyPlan() throws InterruptedException {
		this.clickMyPlan();
		Thread.sleep(2000);
	}

	public void clickMyPlan() throws InterruptedException {
		this.clickMainMenu();
		MyPlan.click();
	}

	// Bundles
	public void testBundles() throws InterruptedException {
		this.clickBundles();
		Thread.sleep(2000);
		this.scrollToLastBundle();
	}

	public void clickBundles() throws InterruptedException {
		this.clickMainMenu();
		Bundles.click();
	}

	public void scrollToLastBundle() {
		Bundle251tk30D.click();
	}

	/*
	 * // Value Added Services (VAS) public void
	 * testActivateDeactivateRemoveAllVAS() throws InterruptedException {
	 * this.testActivateVAS(); this.testDeactivateVAS();
	 * this.testRemoveAllVAS(); Thread.sleep(2000); this.clickMainMenu(); }
	 * 
	 * public void testActivateVAS() throws InterruptedException {
	 * this.clickVAS(); this.clickSocialTab(); this.clickNewsTab();
	 * this.clickActivateCallManager(); this.clickActivateRadioDaily();
	 * this.clickMainMenu(); }
	 * 
	 * public void testDeactivateVAS() throws InterruptedException {
	 * this.clickVAS(); Thread.sleep(2000); this.clickDeactivateVAS();
	 * Thread.sleep(5000); this.acceptVASModal(); this.clickMainMenu(); }
	 * 
	 * public void clickDeactivateVAS() { DeactivateVAS.click(); }
	 */
	public void testRemoveAllVAS() throws InterruptedException {
		this.clickVAS();
		Thread.sleep(2000);
		this.removeAllVAS();
	}

	public void removeAllVAS() throws InterruptedException {
		this.clickVAS();
		RemoveAllVas.click();
		Thread.sleep(5000);
		this.acceptVASModal();
	}

	public void acceptVASModal() throws InterruptedException {
		VasAcceptDialog.click();
		Thread.sleep(4000);
	}

	public void clickVAS() throws InterruptedException {
		this.clickMainMenu();
		VAS.click();
	}

	/*
	 * public void clickMobileAssistTab() { MusicTab.click(); }
	 * 
	 * public void clickMusicTab() { MusicTab.click(); }
	 * 
	 * public void clickNewsTab() { NewsTab.click(); }
	 * 
	 * public void clickSocialTab() { SocialTab.click(); }
	 * 
	 * public void clickActivateCallManager() throws InterruptedException {
	 * this.clickMusicTab(); ActivateCallManager.click(); Thread.sleep(2000);
	 * this.acceptVASModal(); }
	 * 
	 * public void clickActivateRadioDaily() throws InterruptedException {
	 * this.clickMobileAssistTab(); ActivateRadioDaily.click();
	 * Thread.sleep(2000); this.acceptVASModal(); }
	 */
	public void testRecharge(String msisdn, String amount)
			throws InterruptedException {
		this.checkRechargeQuick(msisdn);
		Thread.sleep(3000);
		checkRechargeQuickOther(msisdn, amount);

	}

	private void clickRechargeQuick50() {
		RechargeQuickAmounts.get(2).click();
	}

	private void checkRechargeQuick(String msisdn) throws InterruptedException {
		this.clickRecharge();
		this.typeRechargeNumber(msisdn);
		this.clickRechargeQuick50();
		submitRecharge();
		Thread.sleep(12000);
	}

	private void checkRechargeQuickOther(String msisdn, String amount)
			throws InterruptedException {
		this.clickRecharge();
		this.typeRechargeNumber(msisdn);
		this.typeRechargeAmount(amount);
		this.hideKeyboardIfVisible();
		Thread.sleep(2000);
		submitRecharge();
		Thread.sleep(10000);
	}

	public void clickRecharge() throws InterruptedException {
		this.clickMainMenu();
		Recharge.click();
	}

	private void typeRechargeAmount(String amount) {
		RechargeAmountOther.clear();
		RechargeAmountOther.sendKeys(amount);
	}

	private void typeRechargeNumber(String msisdn) {
		ApiDebugRechargeNumber.clear();
		ApiDebugRechargeNumber.sendKeys(msisdn);
	}

	public void submitRecharge() throws InterruptedException {
		ConfirmRecharge.click();
		Thread.sleep(3000);
	}

	// Manage FnF
	public void testManageFnF() throws InterruptedException {
		this.clickManageFnF();
		Thread.sleep(2000);
	}

	public void clickManageFnF() throws InterruptedException {
		this.clickMainMenu();
		ManageFnF.click();
	}

	// Goon Goon
	public void testGoonGoon() throws InterruptedException {
		this.clickGoonGoon();
		Thread.sleep(2000);
	}

	public void clickGoonGoon() throws InterruptedException {
		this.clickMainMenu();
		GoonGoon.click();
	}

	// My Offers
	public void testMyOffers() throws InterruptedException {
		this.clickMyOffers();
		Thread.sleep(2000);
	}

	public void clickMyOffers() throws InterruptedException {
		this.clickMainMenu();
		MyOffers.click();
	}

	// Win Back
	public void clickWinBack() throws InterruptedException {
		this.clickMainMenu();
		WinBack.click();
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

	private void typeWinBackNumber(String msisdn) {
		WinBackApiDebugNumber.clear();
		WinBackApiDebugNumber.sendKeys(msisdn);
		this.hideKeyboardIfVisible();
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

	public void testApiDebugShop() throws InterruptedException {
		this.clickApiDebugShop();
		Thread.sleep(7000);
	}

	public void clickApiDebugShop() throws InterruptedException {
		this.clickMainMenu();
		ApiDebugShop.click();
	}

	public void testBuyTickets() throws InterruptedException {
		this.clickBuyTickets();
		Thread.sleep(2000);
	}

	public void clickBuyTickets() throws InterruptedException {
		this.clickMainMenu();
		BuyTickets.click();
	}

	// Balance Transfer
	public void testBalanceTransfer() throws InterruptedException {
		this.clickBalanceTransfer();
		Thread.sleep(2000);
	}

	public void clickBalanceTransfer() throws InterruptedException {
		this.clickMainMenu();
		BalanceTransfer.click();
	}

	public void testRoaming() throws InterruptedException {
		this.clickRoaming();
		Thread.sleep(10000);
	}

	public void clickRoaming() throws InterruptedException {
		this.clickMainMenu();
		Roaming.click();
	}

	public void testReferFriend() throws InterruptedException {
		this.clickReferFriend();
		Thread.sleep(2000);
	}

	public void clickReferFriend() throws InterruptedException {
		this.clickMainMenu();
		ReferFriend.click();
	}

	public void testShopLocator() throws InterruptedException {
		this.clickManageAccount();
		Thread.sleep(2000);
	}

	public void clickShopLocator() throws InterruptedException {
		this.clickMainMenu();
		ShopLocator.click();
	}

	public void testCustomerService() throws InterruptedException {
		this.clickCustomerService();
		Thread.sleep(2000);
	}

	public void clickCustomerService() throws InterruptedException {
		this.clickMainMenu();
		CustomerService.click();
	}

	public void testAboutUs() throws InterruptedException {
		this.clickAboutUs();
		Thread.sleep(2000);
	}

	public void clickAboutUs() throws InterruptedException {
		this.clickMainMenu();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(AboutUs)).click();
	}

	public void testPinPuk() throws InterruptedException {
		this.clickPinPuk();
		Thread.sleep(2000);
	}

	public void clickPinPuk() throws InterruptedException {
		this.clickMainMenu();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(PinPuk)).click();
	}

	public void testSignOut() throws InterruptedException {
		this.clickSignOut();
		Thread.sleep(2000);
		this.clickLogOut();
	}

	private void clickSignOut() throws InterruptedException {
		this.clickMainMenu();
		SignOut.click();
	}

	private void clickLogOut() {
		LogOut.click();
	}

	public void clickBackButton() {
		driver.pressKeyCode(AndroidKeyCode.BACK);
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

}
