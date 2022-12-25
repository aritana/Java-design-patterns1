package br.com.aritana.loja.orcamento.situacao;

import br.com.aritana.loja.Orcamento;

public class Reprovado extends SituacaoOrcamento {
  @Override
  public void finalizar(Orcamento orcamento) {
    orcamento.setSituacao(new Finalizado());
  }
}
