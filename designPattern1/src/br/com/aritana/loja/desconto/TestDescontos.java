package br.com.aritana.loja.desconto;


import br.com.aritana.loja.Orcamento;
import br.com.aritana.loja.desconto.CalculadoraDeDescontos;
import java.math.BigDecimal;

public class TestDescontos {

  public static void main(String[] args) {
    Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"),6);
    Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"),1);

    CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
    System.out.println(calculadoraDeDescontos.calcular(primeiroOrcamento));
    System.out.println(calculadoraDeDescontos.calcular(segundoOrcamento));

  }
}