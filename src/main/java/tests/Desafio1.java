package tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import core.BaseTest;
import core.Propriedades;
import pages.PageAddDoces;

public class Desafio1 extends BaseTest {
	PageAddDoces pageAddDoces = new PageAddDoces();

	@Test
	public void desafio1(){		
		pageAddDoces.expandirCategorias();
		pageAddDoces.selecionarDoces();
		pageAddDoces.addBrigadeiroCarrinho();
		pageAddDoces.addAlfajorCarrinho();
		pageAddDoces.expandirCategorias();
		pageAddDoces.selecionarTodos();
		pageAddDoces.abrirCarrinho();
		pageAddDoces.aumentarQntdBrigadeiros(4);
		pageAddDoces.finalizarCompra();
		assertEquals("Pedido realizado com sucesso!", pageAddDoces.obterMensagemPedidoRealizado());
		pageAddDoces.clicarBtnFechar();
	}

	
}
