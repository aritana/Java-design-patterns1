package br.com.aritana.loja.orcamento.situacao;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

  public void aprovar(Orcamento orcamento) {
    throw new DomainException("Orçamento não pode ser aprovado!");//sobrescrito nas classes filhas
  }

  public void reprovar(Orcamento orcamento) {
    throw new DomainException("Orçamento não pode ser reaprovado!");//sobrescrito nas classes filhas
  }

  public void finalizar(Orcamento orcamento) {
    throw new DomainException("Orçamento não pode ser finalizado!");//sobrescrito nas classes filhas
  }

  public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
    return BigDecimal.ZERO;
  }
}
