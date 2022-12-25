package br.com.aritana.loja.pedido.acao;

import br.com.aritana.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

  public void executarAcao(Pedido pedido){
    System.out.println("Enviando e-mail com dados do pedido");
  }
}
