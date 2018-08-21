package br.com.automationMobile.pages;

import org.openqa.selenium.By;

public class PageStart {

	private By buttonIniciar = By.id("com.simpler.dialer:id/button");

	// private By buttonIniciar = By.linkText("Iniciar");

	private By buttonPermitir = By.id("com.android.packageinstaller:id/permission_allow_button");

	private By buttonNegar = By.id("com.android.packageinstaller:id/permission_deny_button");

	public By getButtonIniciar() {
		return buttonIniciar;
	}

	public By getButtonPermitir() {
		return buttonPermitir;
	}

	public By getButtonNegar() {
		return buttonNegar;
	}

}
