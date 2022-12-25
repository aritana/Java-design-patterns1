package br.com.aritana.loja.desconto;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

/**
 * Chain Of Responsability pattern
 */
public class CalculadoraDeDescontos {

  public BigDecimal calcular(Orcamento orcamento) {

    Desconto desconto = new DescontoOrcamentoMaisDeCincoItens(
        new DescontoValorMaiorQuinhentos(new SemDesconto()));

    return desconto.calcular(orcamento);
  }

}
