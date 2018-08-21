package br.com.automationMobile.connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import br.com.automationMobile.pages.PageHome;
import br.com.automationMobile.pages.PageKeyboardDialer;
import br.com.automationMobile.pages.PageStart;
import io.appium.java_client.android.AndroidDriver;

public class ConnectionAppium {
	private static ConnectionAppium connection;
	private AndroidDriver<WebElement> driver;
	private PageStart pgStart;
	private PageHome pgHome;
	private PageKeyboardDialer pgKeyboardDialer;

	public void openAppium() {
		try {
			final DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "LGK430C64TTSLF");
			capabilities.setCapability("platformName", "android");
			capabilities.setCapability("noReset", "true");
			capabilities.setCapability("newCommandTimeout", "30000");
			capabilities.setCapability("app",
					"C:\\Desenvolvimento\\Workspace_Estudos\\AutoModel\\src\\test\\resources\\apk\\dialersimpler.apk");

			setDriver(new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));
			setPgStart(PageFactory.initElements(this.driver, PageStart.class));
			setPgHome(PageFactory.initElements(this.driver, PageHome.class));
			setPgKeyboardDialer(PageFactory.initElements(this.driver, PageKeyboardDialer.class));

			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} catch (MalformedURLException e) {
			e.getStackTrace();
			e.getMessage();
		}

	}

	public static ConnectionAppium getConnection() {
		return connection;
	}

	public static void setConnection(ConnectionAppium connection) {
		ConnectionAppium.connection = connection;
	}

	public AndroidDriver<WebElement> getDriver() {
		return driver;
	}

	public void setDriver(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}

	public PageStart getPgStart() {
		return pgStart;
	}

	public void setPgStart(PageStart pgStart) {
		this.pgStart = pgStart;
	}

	public PageHome getPgHome() {
		return pgHome;
	}

	public void setPgHome(PageHome pgHome) {
		this.pgHome = pgHome;
	}

	public PageKeyboardDialer getPgKeyboardDialer() {
		return pgKeyboardDialer;
	}

	public void setPgKeyboardDialer(PageKeyboardDialer pgKeyboardDialer) {
		this.pgKeyboardDialer = pgKeyboardDialer;
	}

}
