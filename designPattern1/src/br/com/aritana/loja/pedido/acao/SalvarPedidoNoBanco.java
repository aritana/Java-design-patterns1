package br.com.aritana.loja.pedido.acao;

import br.com.aritana.loja.pedido.Pedido;

public class SalvarPedidoNoBanco implements AcaoAposGerarPedido {

  public void executarAcao(Pedido pedido){
    System.out.println("Salvando pedidos no banco de dados");
  }
}
