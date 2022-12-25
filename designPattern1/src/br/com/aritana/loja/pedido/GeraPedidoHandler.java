package br.com.aritana.loja.pedido;

import br.com.aritana.loja.Orcamento;
import br.com.aritana.loja.pedido.acao.AcaoAposGerarPedido;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
  //construtor com injecao de dependencias

  private List<AcaoAposGerarPedido> acoes;

  /**Observer pattern**/
  public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
    this.acoes = acoes;
  }

  public void execute(GeraPedido dados) {
    Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
    Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

    acoes.forEach(a -> a.executarAcao(pedido));
  }
}