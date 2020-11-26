package core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {

	@Rule
	TestName testName = new TestName();

	@After
	public void finaliza() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File(
				"target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));

		if (DriverFactory.getDriver() != null) {
			DriverFactory.killDriver();
		}

	}

	public void finalizar() {
		if (DriverFactory.getDriver() != null) {
			if (Propriedades.FECHAR_BROWSER) {
				DriverFactory.killDriver();
			}
		}
	}

}
