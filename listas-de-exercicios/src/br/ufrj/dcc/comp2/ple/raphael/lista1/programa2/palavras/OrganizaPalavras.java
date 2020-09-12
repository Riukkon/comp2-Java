package br.ufrj.dcc.comp2.ple.raphael.lista1.programa2.palavras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/** Classe para ordenar palavras em ordem alfabetica.
 * 
 * @author Raphael Mesquita &lt;raphafm.rf@gmail.com&gt;
 */
public class OrganizaPalavras {
  public static void main(String[] args) {
    organizaPalavras();
  }

  /**
   * Metodo que ordena palavras em ordem alfabetica e as imprime linha a linha.
   * <p>
   * Recebe da entrada padrao uma String com palavras separadas por espaços.
   * Em seguida a transforma em uma <code>List&lt;String&gt;</code> e ordena em ordem alfabetica.
   * Elas, entao, sao impressas na saida padrao, cada palavra em uma linha.
   * </p>
   */
  public static void organizaPalavras() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite as palavras para ordená-las em ordem alfabética");
    String entrada = scanner.nextLine();
    
    String entradaDividida[] = entrada.split(" ");
    List<String> listaEntrada = new ArrayList<>();

    for(String palavra : entradaDividida) listaEntrada.add(palavra);
    
    Collections.sort(listaEntrada, String.CASE_INSENSITIVE_ORDER);

    for(String palavra : listaEntrada) System.out.println(palavra);
    
    scanner.close();
  }
}