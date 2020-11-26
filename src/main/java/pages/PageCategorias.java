package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class PageCategorias extends BasePage {

	public void selecionarCategoria() {
		clicar(By.xpath("//div[@id=open-categories-btn]/img"));
	}

	public void selecionarDoces() {
		clicar(By.id("id=category-1"));
	}

	public void addBrigadeiroCarrinho() {
		clicar(By.id("add-product-4-btn"));
	}

	public void addAlfajorCarrinho() {
		clicar(By.id("add-product-5-btn"));
	}

	public void abrirCarrinho() {
		clicar(By.id("id=cart-products-qtd"));
	}

	public void addProduto(int qnt) {
		for (int i = 0; i < 4; i++)
			clicar(By.xpath("//div[@id=add-product-4-qtd]/span"));
	}

	public void finalizarCompra() {
		clicar(By.id("finish-checkout-button"));
	}

	public String obterMensagem() {
		return obterMensagem(By.xpath("//h2[contains(., 'Pedido realizado com sucesso')]"));
	}

}
