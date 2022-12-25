package br.com.aritana.loja.desconto;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

public class DescontoValorMaiorQuinhentos extends  Desconto {

  public DescontoValorMaiorQuinhentos(Desconto proximo) {
    super(proximo);
  }

  public BigDecimal calcular(Orcamento orcamento) {
    if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
      return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }
    //se a regra não for aplicada, retorno o próximo.
    return proximo.calcular(orcamento);
  }
}