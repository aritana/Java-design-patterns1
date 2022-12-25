package br.com.aritana.loja.orcamento.situacao;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

/**
 * State pattern: cada estado vira uma classe com seus comportamentos.
 */
public class EmAnalise extends SituacaoOrcamento {

  public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
    return orcamento.getValor().multiply(new BigDecimal("0.05"));
  }

  @Override
  public void aprovar(Orcamento orcamento) {
    orcamento.setSituacao(new Aprovado());
  }

  @Override
  public void reprovar(Orcamento orcamento) {
    orcamento.setSituacao(new Reprovado());
  }


}
