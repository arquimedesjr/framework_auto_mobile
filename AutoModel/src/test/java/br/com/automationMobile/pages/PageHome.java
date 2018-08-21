package br.com.automationMobile.pages;

import org.openqa.selenium.By;

public class PageHome {

	private By buttonAdd = By.id("com.simpler.dialer:id/add_image_view");

	private By buttonMenu = By.id("com.simpler.dialer:id/overflow_image_view");

	private By buttonMenuTeclado = By.id("com.simpler.dialer:id/dialpad_fab");

	private By buttonCancela = By.id("android:id/button2");

	public By getButtonCancela() {
		return buttonCancela;
	}

	public By getButtonAdd() {
		return buttonAdd;
	}

	public By getButtonMenu() {
		return buttonMenu;
	}

	public By getButtonMenuTeclado() {
		return buttonMenuTeclado;
	}

}
