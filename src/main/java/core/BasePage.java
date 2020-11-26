package core;

import org.openqa.selenium.By;
import static core.DriverFactory.getDriver;

public class BasePage {

	public void clicar(By by) {
		getDriver().findElement(by).click();
	}

	public void clicar(String id) {
		clicar(By.id(id));
	}

	public String obterMensagem(By by) {
		return getDriver().findElement(by).getText();
	}

	public String obterMensagem(String id) {
		return obterMensagem(By.id(id));
	}

}
