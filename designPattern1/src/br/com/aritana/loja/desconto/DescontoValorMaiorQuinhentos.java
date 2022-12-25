package br.com.aritana.loja.desconto;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

public class DescontoValorMaiorQuinhentos extends  Desconto {

  public DescontoValorMaiorQuinhentos(Desconto proximo) {
    super(proximo);
  }

  public BigDecimal efetuarCalculo(Orcamento orcamento) {
      return orcamento.getValor().multiply(new BigDecimal("0.05"));
  }

  @Override
  public boolean deveAplicar(Orcamento orcamento) {
    return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
  }
}