package br.com.automationMobile.stepBusiness;

import br.com.automationMobile.connection.ConnectionAppium;
import br.com.automationMobile.screenShot.ScreenShot;

public class StepBusinessTests {

	private static StepBusinessTests stepB;
	private static ConnectionAppium connection;
	private static ScreenShot screenShot;

	public static StepBusinessTests getInstance() {
		if (stepB == null) {
			stepB = new StepBusinessTests();
			connection = new ConnectionAppium();
			screenShot = new ScreenShot();
		}
		return stepB;
	}

	public void openAppium() throws InterruptedException {
		connection.openAppium();
		Thread.sleep(2000);
		screenShot.takeScreenShotTest(connection.getDriver());
	}

	public void clickButtonMenu() throws InterruptedException {
		connection.getDriver().findElement(connection.getPgHome().getButtonMenu()).click();
		Thread.sleep(2000);
		screenShot.takeScreenShotTest(connection.getDriver());
	}

	public void clickButtonMenuTeclado() throws InterruptedException {
		connection.getDriver().findElement(connection.getPgHome().getButtonMenuTeclado()).click();
		Thread.sleep(2000);
		screenShot.takeScreenShotTest(connection.getDriver());

	}

	public void keyboardDielerDigits(String string) throws InterruptedException {
		if (connection.getPgKeyboardDialer().getFieldDigits() == null) {
			connection.getDriver().findElement(connection.getPgKeyboardDialer().getFieldDigits()).clear();
		}
		connection.getDriver().findElement(connection.getPgKeyboardDialer().getFieldDigits()).sendKeys(string);
		Thread.sleep(2000);
		screenShot.takeScreenShotTest(connection.getDriver());

	}

	public void keyboardDieler(String string) throws InterruptedException {
		if (connection.getPgKeyboardDialer().getFieldDigits() == null) {
			connection.getDriver().findElement(connection.getPgKeyboardDialer().getFieldDigits()).clear();
			Thread.sleep(2000);
			screenShot.takeScreenShotTest(connection.getDriver());
		}

		for (char ch : string.toCharArray())
			if (ch == '1') {
				connection.getDriver().findElement(connection.getPgKeyboardDialer().getButtonOne()).click();
			} else if (ch == '2') {
				connection.getDriver().findElement(connection.getPgKeyboardDialer().getButtonTwo()).click();
			} else if (ch == '3') {
				connection.getDriver().findElement(connection.getPgKeyboardDialer().getButtonThree()).click();
			} else if (ch == '4') {
				connection.getDriver().findElement(connection.getPgKeyboardDialer().getButtonFour()).click();
			} else if (ch == '5') {
				connection.getDriver().findElement(connection.getPgKeyboardDialer().getButtonFive()).click();
			} else if (ch == '6') {
				connection.getDriver().findElement(connection.getPgKeyboardDialer().getButtonSix()).click();
			} else if (ch == '7') {
				connection.getDriver().findElement(connection.getPgKeyboardDialer().getButtonSeven()).click();
			} else if (ch == '8') {
				connection.getDriver().findElement(connection.getPgKeyboardDialer().getButtonEight()).click();
			} else if (ch == '9') {
				connection.getDriver().findElement(connection.getPgKeyboardDialer().getButtonNine()).click();
			} else if (ch == '0') {
				connection.getDriver().findElement(connection.getPgKeyboardDialer().getButtonZero()).click();
			}
		Thread.sleep(2000);
		screenShot.takeScreenShotTest(connection.getDriver());
	}

	public void closeApp() throws InterruptedException {
		Thread.sleep(2000);
		screenShot.takeScreenShotTest(connection.getDriver());
		connection.getDriver().closeApp();
	}

	public void clickButtonAdd() throws InterruptedException {
		// driver.findElement(pgHome.getButtonAdd()).click();
		connection.getDriver().findElement(connection.getPgHome().getButtonAdd()).click();
		Thread.sleep(2000);
		screenShot.takeScreenShotTest(connection.getDriver());
	}

	public void clickButtonCancelar() throws InterruptedException {
		connection.getDriver().findElement(connection.getPgHome().getButtonCancela()).click();
		Thread.sleep(2000);
		screenShot.takeScreenShotTest(connection.getDriver());
	}

}
