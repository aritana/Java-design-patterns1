package br.com.aritana.loja.imposto;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

public class ICMS  implements Imposto {
  public BigDecimal calcular(Orcamento orcamento) {
    return orcamento.getValor().multiply(new BigDecimal("0.1"));
  }


}
