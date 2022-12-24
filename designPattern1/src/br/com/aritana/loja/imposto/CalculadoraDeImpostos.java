package br.com.aritana.loja.imposto;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

public class CalculadoraDeImpostos {
  public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
    return imposto.calcular(orcamento);
  }
}