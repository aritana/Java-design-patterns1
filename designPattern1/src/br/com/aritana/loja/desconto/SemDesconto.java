package br.com.aritana.loja.desconto;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

public class SemDesconto extends  Desconto{

  public SemDesconto() {
    super(null);
  }

  public BigDecimal calcular(Orcamento orcamento) {
    return BigDecimal.ZERO;
  }
}
