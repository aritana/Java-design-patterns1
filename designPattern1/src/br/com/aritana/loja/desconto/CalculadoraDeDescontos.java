package br.com.aritana.loja.desconto;

import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;
import javax.print.DocFlavor.READER;

public class CalculadoraDeDescontos {

  public BigDecimal calcular(Orcamento orcamento){

    if(orcamento.getQuantidadeItens()>5){
      return  orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
    return  BigDecimal.ZERO;
  }
}
