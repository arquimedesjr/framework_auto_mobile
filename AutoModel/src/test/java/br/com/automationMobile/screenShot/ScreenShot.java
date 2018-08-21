package br.com.automationMobile.screenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ScreenShot {

	private static ScreenShot sreenShot;


	public static ScreenShot getInstace() {

		if (sreenShot == null) {
			sreenShot = new ScreenShot();
		}
		return sreenShot;
	}

	public void takeScreenShotTest(AndroidDriver<WebElement> driver) {

		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");

		try {
			File diretorio = new File("src/test/resources/Evidencia/");
			File imagem = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			if (diretorio.exists()) {
				FileUtils.copyFile(imagem, new File(diretorio.getAbsolutePath() + "//" + sdf.format(data) + ".png"));

			} else {
				diretorio.mkdir();
				FileUtils.copyFile(imagem, new File(diretorio.getAbsolutePath() + "//" + sdf.format(data) + ".png"));
			}
		} catch (

		IOException e) {
			e.printStackTrace();
		}
	}

}
