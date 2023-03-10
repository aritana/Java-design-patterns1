package br.com.aritana.loja.desconto;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

public class DescontoOrcamentoMaisDeCincoItens  extends  Desconto{

  public DescontoOrcamentoMaisDeCincoItens(Desconto proximo) {
    super(proximo);
  }

  public BigDecimal efetuarCalculo(Orcamento orcamento) {
      return orcamento.getValor().multiply(new BigDecimal("0.1"));
  }

  @Override
  public boolean deveAplicar(Orcamento orcamento) {
    return orcamento.getQuantidadeItens() > 5;
  }
}
