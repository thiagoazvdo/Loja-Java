package interfaces.conceitos.teste;

import interfaces.conceitos.impressaointerface.Impressora;
import interfaces.conceitos.impressaointerface.ImpressoraHP;
import interfaces.conceitos.pagamentocaixa.Checkout;
import interfaces.conceitos.pagamentocaixa.Compra;
import interfaces.conceitos.pagamentointerface.Cartao;
import interfaces.conceitos.pagamentointerface.Operadora;
import interfaces.conceitos.pagamentointerface.RedeCard;

public class TesteCheckout {

	public static void main(String[] args) {
		Operadora operadora = new RedeCard();
		Impressora impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Joao M Couves");
		cartao.setNumeroCartao("456");
		
		
		Compra compra = new Compra();
		compra.setNomeCliente("Joao Mendonca Couves");
		compra.setProduto("Guarana¡ 1L");
		compra.setValorTotal(6.5);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}

}
