package core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.DriverFactory.getDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BasePage  {

	public void clicar(By by) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), 5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
			getDriver().findElement(by).click();
		} catch (Exception e) {
			throw new NoSuchElementException("Element not found: " + e.getMessage());
		}

	}

	public void clicar(String id) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), 5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
			clicar(By.id(id));
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException("Element not found: " + e.getMessage());
		}
	}
	

	public String obterMensagem(By by) {
		return getDriver().findElement(by).getText();
	}

	public String obterMensagem(String id) {
		return obterMensagem(By.id(id));
	}

}
