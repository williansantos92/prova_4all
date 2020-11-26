package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import core.BasePage;

public class PageAddDoces extends BasePage {
	
	public void AcessaTelaInicial() {
		getDriver().get("https://shopcart-challenge.4all.com/");
	}

	public void expandirCategorias() {
		clicar(By.xpath("//div[@id='open-categories-btn']/img"));
	}

	public void selecionarDoces() {
		clicar(By.id("category-1"));
	}
	
	public void selecionarTodos() {
		clicar(By.id("category-all"));
	}

	public void addBrigadeiroCarrinho() {
		clicar(By.id("add-product-4-btn"));		
	}

	public void addAlfajorCarrinho() {
		clicar(By.id("add-product-5-btn"));
	}

	public void abrirCarrinho() {
		clicar(By.id("cart-products-qtd"));
	}

	public void addMaisBrigadeiros(int qntd) {
		for (int i = 0; i < qntd; i++)
			clicar(By.xpath("//div[@id='add-product-4-qtd']/span"));
	}
		
	public void finalizarCompra() {
		clicar(By.id("finish-checkout-button"));
	}

	public String obterMensagemFinal() {
		return obterMensagem(By.xpath("//h2[contains(., 'Pedido realizado com sucesso')]"));
	}
	
	public void clicarBtnFechar() {
		 clicar(By.xpath("//button[contains(., 'Fechar')]"));
		
	}

}
