package br.com.aritana.loja.pedido;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Command Handler pattern: pass requests as a method arguments.
 * separar dados dos comandos com dependências
 */
public class GeraPedido  {
  private String cliente;
  private BigDecimal valorOrcamento;
  private int quantidadeItens;

  //injecao dependencias: pedido repository
  public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
    this.cliente = cliente;
    this.valorOrcamento = valorOrcamento;
    this.quantidadeItens = quantidadeItens;
  }
  public String getCliente() {
    return cliente;
  }

  public BigDecimal getValorOrcamento() {
    return valorOrcamento;
  }

  public int getQuantidadeItens() {
    return quantidadeItens;
  }
}
