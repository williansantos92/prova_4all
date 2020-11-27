package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import core.BasePage;
import core.Propriedades;
import project_constantes.Constantes;

public class PageAddDoces extends BasePage {

	public void AcessaTelaInicial() {
		getDriver().get(Constantes.URL);
	}

	public void expandirCategorias() {
		clicar(By.xpath("//div[@id='open-categories-btn']/img"));
	}

	public void selecionarDoces() {
		clicar(By.id("category-1"));
	}

	public void selecionarBebidas() {
		clicar(By.id("category-0"));
	}

	public void selecionarTodos() {
		clicar(By.id("category-all"));
	}

	public void addBrigadeiroCarrinho() {
		clicar(By.id("add-product-4-btn"));
	}

	public void addRisoles() {
		clicar("add-product-3-btn");
	}

	public void addAlfajorCarrinho() {
		clicar(By.id("add-product-5-btn"));
	}

	public void addCocaCarrinho() {
		clicar(By.id("add-product-0-btn"));
	}

	public void addFantaUvaCarrinho() {
		clicar(By.id("add-product-1-btn"));
	}

	public void addAAguaMineralSemGasCarrinho() {
		clicar(By.id("add-product-2-btn"));
	}

	public void abrirCarrinho() {
		clicar(By.id("cart-products-qtd"));
	}

	public void aumentarQntdBrigadeiros(int qntd) {
		for (int i = 0; i < qntd; i++)
			clicar(By.xpath("//div[@id='add-product-4-qtd']/span"));
	}

	public void aumentarQntdRisoles(int qntd) {
		for (int i = 0; i < qntd; i++)
			clicar(By.xpath("//div[@id='add-product-3-qtd']/span"));
	}

	public void diminuirQntdRisoles(int qntd) {
		for (int i = 0; i < qntd; i++)
			clicar(By.xpath("//div[@id='remove-product-3-qtd']/span"));
	}

	public void finalizarCompra() {
		clicar(By.id("finish-checkout-button"));
	}

	public String obterMensagemPedidoRealizado() {
		return obterMensagem(By.xpath("//h2[contains(., 'Pedido realizado com sucesso!')]"));
	}

	public String obterMensagemValorotal() {
		return obterMensagem("price-total-checkout");
	}

	public void clicarBtnFechar() {
		clicar(By.xpath("//button[contains(., 'Fechar')]"));

	}

	
}
