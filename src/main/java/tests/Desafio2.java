package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import core.BaseTest;
import core.DriverFactory;
import pages.PageAddDoces;


public class Desafio2 extends BaseTest{
	PageAddDoces pageAddDoces = new PageAddDoces();
	DriverFactory driver;
	@Test
	public void desafio2() throws InterruptedException {
		pageAddDoces.expandirCategorias();
		pageAddDoces.selecionarBebidas();
		pageAddDoces.addCocaCarrinho();
		pageAddDoces.addFantaUvaCarrinho();
		pageAddDoces.addAAguaMineralSemGasCarrinho();
		pageAddDoces.expandirCategorias();
		Thread.sleep(5000);
		pageAddDoces.selecionarTodos();
		Thread.sleep(5000);
		pageAddDoces.addRisoles();
		pageAddDoces.abrirCarrinho();
		pageAddDoces.aumentarQntdRisoles(9);
		pageAddDoces.diminuirQntdRisoles(5);		
		
		assertEquals("R$ 36,00", pageAddDoces.obterMensagemValorotal());
		
		pageAddDoces.finalizarCompra();
		assertEquals("Pedido realizado com sucesso!", pageAddDoces.obterMensagemPedidoRealizado());
		
		pageAddDoces.clicarBtnFechar();
		
	}
}

