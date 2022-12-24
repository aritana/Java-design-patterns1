package br.com.aritana.loja.imposto;


import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

public class TestImpostos {

  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
    CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
   System.out.println(calculadoraDeImpostos.calcular(orcamento,new ICMS()));
   System.out.println(calculadoraDeImpostos.calcular(orcamento,new ISS()));
  }
}