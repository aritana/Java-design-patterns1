package br.com.aritana.loja.desconto;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

/**
 * Chain Of Responsability pattern
 */
public class CalculadoraDeDescontos {

  public BigDecimal calcular(Orcamento orcamento) {

    Desconto cadeiaDeDescontos = new DescontoOrcamentoMaisDeCincoItens(
        new DescontoValorMaiorQuinhentos(new SemDesconto()));

    return cadeiaDeDescontos.calcular(orcamento);
  }

}
