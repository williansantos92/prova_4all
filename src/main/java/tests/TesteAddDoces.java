package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pages.PageAddDoces;

public class TesteAddDoces {
	PageAddDoces pageAddDoces = new PageAddDoces();	
	
	
	@Test
	public void addDoces() {
		pageAddDoces.AcessaTelaInicial();
		pageAddDoces.expandirCategorias();
		pageAddDoces.selecionarDoces();
		pageAddDoces.addBrigadeiroCarrinho();
		pageAddDoces.addAlfajorCarrinho();
		pageAddDoces.expandirCategorias();
		pageAddDoces.selecionarTodos();
		pageAddDoces.abrirCarrinho();
		pageAddDoces.addMaisBrigadeiros(4);
		pageAddDoces.finalizarCompra();
		assertEquals("Pedido realizado com sucesso!", pageAddDoces.obterMensagemFinal());
		pageAddDoces.clicarBtnFechar();
	}
	

}
