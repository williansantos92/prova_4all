package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pages.PageAddDoces;

public class TesteAddDoces {
	PageAddDoces pageAddDoces = new PageAddDoces();	
	
	
	@Test
	public void desafio1() {
		pageAddDoces.AcessaTelaInicial();
		pageAddDoces.expandirCategorias();
		pageAddDoces.selecionarDoces();
		pageAddDoces.addBrigadeiroCarrinho();
		pageAddDoces.addAlfajorCarrinho();
		pageAddDoces.expandirCategorias();
		pageAddDoces.selecionarTodos();
		pageAddDoces.abrirCarrinho();
		pageAddDoces.aumentarQntdBrigadeiros(4);
		pageAddDoces.finalizarCompra();
		assertEquals("Pedido realizado com sucesso!", pageAddDoces.obterMensagemFinal());
		pageAddDoces.clicarBtnFechar();
	}
	
	@Test
	public void desafio2() {
		pageAddDoces.AcessaTelaInicial();
		pageAddDoces.expandirCategorias();
		pageAddDoces.selecionarBebidas();
		pageAddDoces.addTodosProdutos(3);
		pageAddDoces.expandirCategorias();
		pageAddDoces.selecionarTodos();
		pageAddDoces.addRisoles();
		//pageAddDoces.abrirCarrinho();
				
	}
	

}
