package AndroidApp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;

import io.appium.java_client.remote.MobilePlatform;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author M Mehedi Zaman
 */

public class Base {

	private static AppiumDriverLocalService service;
	protected static AndroidDriver<AndroidElement> driver;
	
	@BeforeClass
	public static AndroidDriver<AndroidElement> beforeClass()
			throws MalformedURLException {
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();

		if (service == null || !service.isRunning()) {
			throw new AppiumServerHasNotBeenStartedLocallyException(
					"An appium server node is not started!");
		}

		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,
				MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability("autoGrantPermissions", "true");

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
				cap);
		return driver;

	}

	@AfterClass
	public static void afterClass() {
		if (driver != null) {
			driver.quit();
		}
		if (service != null) {
			service.stop();
		}
	}

}
