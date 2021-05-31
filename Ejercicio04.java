import java.util.Scanner;

public class Ejercicio04{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int total, n;
    System.out.print("Ingresa el total de numero: ");
    total = in.nextInt();
    for (int num = 1; num <= total; num++){
      System.out.print("Ingresa un numero: ");
      n = in.nextInt();
      if (n>0);
      System.out.print("El numero  "+n+" elevado al cubo es: "+n*n*n);
      System.out.println("");
    }
  }
}