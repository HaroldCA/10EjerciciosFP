import java.util.Scanner;

public class E01deotramanera{

  public static void main(String[] args) {
    int año;
    double salarioI, salarioR;
    for (int año=1; año<=6; año++) {
     salarioI=1500;
     salarioR=salarioI*Math.pow(1.1,año);
     System.out.println("El salario en el año "+año+" es: $"+salarioR);
     System.out.println();
    }
  }
}