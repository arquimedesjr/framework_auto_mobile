package br.com.automationMobile.stepDefinition;

import br.com.automationMobile.screenShot.ScreenShot;
import br.com.automationMobile.stepBusiness.StepBusinessTests;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	private StepBusinessTests stepB;
	private ScreenShot screenShot;

	@SuppressWarnings("static-access")
	@Given("^inicializo aplicacao mobile$")
	public void inicializo_aplicacao_mobile() throws Throwable {
		stepB.getInstance().openAppium();
	}

	@SuppressWarnings("static-access")
	@When("^crio um contato novo$")
	public void crio_um_contato_novo() throws Throwable {
		stepB.getInstance().clickButtonAdd();
		stepB.getInstance().clickButtonCancelar();
	}

	@SuppressWarnings("static-access")
	@Then("^finalizo o aplicativo$")
	public void finalizo_o_aplicativo() throws Throwable {
		stepB.getInstance().closeApp();

	}

	@SuppressWarnings("static-access")
	@When("^realizo uma ligacao \"([^\"]*)\"$")
	public void realizo_uma_ligacao(String arg1) throws Throwable {
		stepB.getInstance().clickButtonMenuTeclado();
		stepB.getInstance().keyboardDieler(arg1);

	}

	@SuppressWarnings("static-access")
	@Then("^finalizo a ligacao$")
	public void finalizo_a_ligacao() throws Throwable {
		stepB.getInstance().closeApp();
	}

}
