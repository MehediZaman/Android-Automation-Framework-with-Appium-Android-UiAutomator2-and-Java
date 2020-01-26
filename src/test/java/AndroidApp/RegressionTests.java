package AndroidApp;

import pageObjects.DashboardPO;
import pageObjects.MenuPO;
import pageObjects.PreloginPO;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

/*
 * @author Senior SDET M Mehedi Zaman
 */

public class RegressionTests extends Base {

	
	@Test(priority = 1,enabled = false)
	public void TestPrelogin() throws MalformedURLException,
			InterruptedException {

		PreloginPO prelogin = new PreloginPO(driver);

		prelogin.testLoginButton();

	}

	// @Test(priority = 1)
	@Test(enabled = false)
	public void TestDashboard() throws MalformedURLException,
			InterruptedException {

		DashboardPO Dash = new DashboardPO(driver);

		Dash.clickCloseModal();

		Dash.testUsageStats();

		Dash.testSmartRecharge();

		Dash.testQuickLinks();

		Dash.testBannerAdPromo();

		Dash.testWeather();

		Dash.testFavApps();

		Dash.testViewAllAppsLink();

		Dash.testBannerAdDeepLink();
	}

	@Test(priority = 1)
	public void TestMenu() throws MalformedURLException, InterruptedException {
		MenuPO menu = new MenuPO(driver);

		menu.clickCloseModal();

		menu.testHomeButton();

		menu.testManageAccount();

		menu.testMyPlan();

		menu.testBundles();

		menu.testRemoveAllVAS();

		menu.testManageFnF();

		menu.testGoonGoon();

		menu.testMyOffers();

		menu.testBuyTickets();

		menu.testBalanceTransfer();

		menu.testRoaming();

		menu.testReferFriend();

		menu.testShopLocator();

		menu.testCustomerService();

		menu.testAboutUs();

		menu.testPinPuk();

		menu.testSignOut();

	}

}
