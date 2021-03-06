package br.ufrj.dcc.comp2.ple.raphael.lista1.programa3.figuras;

import java.util.ArrayList;

import br.ufrj.dcc.comp2.ple.raphael.lista1.programa3.plano.Ponto2D;

/** Classe que representa um trapézio e seus aspectos.
 * 
 *	@author Raphael Mesquita &lt;raphafm.rf@gmail.com&gt;
 */
public class Trapezio {
  private ArrayList<Ponto2D> pontos = new ArrayList<>();

  /**
   * Método construtor. Imprime o perímetro e área deste trapézio.
   * @param A uma <code>Coordenada2D</code>
   * @param B uma <code>Coordenada2D</code>
   * @param C uma <code>Coordenada2D</code>
   * @param D uma <code>Coordenada2D</code>
   */
  public Trapezio(Ponto2D A, Ponto2D B, Ponto2D C, Ponto2D D) {
    this.pontos.add(A);
    this.pontos.add(B);
    this.pontos.add(C);
    this.pontos.add(D);

    System.out.println("Trapézio");
    System.out.printf("O perímetro do trapézio é %.3f\n", calculaPerimetro());
    System.out.printf("A área do trapézio é %.3f\n", calculaArea());
  }

  /**
   * Verifica se os pontos passados por argumento representam um trapézio.
   * <p>
   * Dados os pontos passados, verifica se existe um, e somente um, par de retas paralelas, 
   * retornando se a condição foi satisfeita.
   * </p>
   * 
   * @param A uma <code>Coordenada2D</code>
   * @param B uma <code>Coordenada2D</code>
   * @param C uma <code>Coordenada2D</code>
   * @param D uma <code>Coordenada2D</code>
   * 
   * @return <b>boolean</b>
   */
  public static boolean ehTrapezio(Ponto2D A, Ponto2D B, Ponto2D C, Ponto2D D) {
    if( (Ponto2D.paralelos(A, B, C, D) && !Ponto2D.paralelos(A, D, B, C)) ||
        (!Ponto2D.paralelos(A, B, C, D) && Ponto2D.paralelos(A, D, B, C))
      ) {
        return true;
      }

    return false;
  }

  /**
   * Calcula o perímetro deste trapézio.
   * <p>
   * Calcula a distância entre seus vértices e soma.
   * </p>
   * @return <b>double</b> perimetro
   */
  public double calculaPerimetro() {
    Ponto2D A = pontos.get(0);
    Ponto2D B = pontos.get(1);
    Ponto2D C = pontos.get(2);
    Ponto2D D = pontos.get(3);

    double perimetro = A.distancia(B) + B.distancia(C) + C.distancia(D) + D.distancia(A);

    return perimetro;
  }

  /**
   * Calcula a área deste trapézio.
   * <p>
   * Divide o trapézio em dois triângulos pela diagonal e soma suas áreas.
   * </p>
   * @return <b>double</b> area
   */
  public double calculaArea() {
    Ponto2D A = pontos.get(0);
    Ponto2D B = pontos.get(1);
    Ponto2D C = pontos.get(2);
    Ponto2D D = pontos.get(3);

    Triangulo triangulo1 = new Triangulo(A, B, C, false);
    Triangulo triangulo2 = new Triangulo(A, D, C, false);

    double area = triangulo1.calculaArea() + triangulo2.calculaArea();

    return area;
  }
}
