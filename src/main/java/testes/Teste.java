package testes;

import static core.DriverFactory.getDriver;

import org.junit.Test;

import core.BaseTest;
import pages.PageAddDoces;

public class Teste {
	PageAddDoces pageAddDoces = new PageAddDoces();	
	@Test
	public void a() {
		getDriver().get("https://shopcart-challenge.4all.com/");
		pageAddDoces.selecionarCategoria();
	}

}
