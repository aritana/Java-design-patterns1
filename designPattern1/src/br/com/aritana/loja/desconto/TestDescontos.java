package br.com.aritana.loja.desconto;


import br.com.aritana.loja.Orcamento;
import java.math.BigDecimal;

/**
 * Template method: the skeleton of an algorithm is in the superclass but
 * lets subclasses override specific steps of the algorithm without changing
 * its structure.
 */
public class TestDescontos {
  public static void main(String[] args) {
    Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"),6);
    Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"),1);

    CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
    System.out.println(calculadoraDeDescontos.calcular(primeiroOrcamento));
    System.out.println(calculadoraDeDescontos.calcular(segundoOrcamento));
  }
}