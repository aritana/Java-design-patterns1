package br.com.aritana.loja.imposto;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

public interface Imposto {
  public BigDecimal calcular(Orcamento orcamento);
}
