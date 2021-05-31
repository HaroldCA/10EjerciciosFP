import java.util.Scanner;

public class Ejercicio03 {
    
    static Scanner teclado=new Scanner(System.in);

    public static void Ejercicio03() {
        
      int maximo, A, igual=0, mayor=0, menor=0;
        
      System.out.println("Cuantos numeros desea ingresar:");
      maximo=teclado.nextInt();
     
      for (int num = 1; num <= maximo; num++) {
        System.out.print("Ingrese un numero :");
        String numI=teclado.next();
        if(numI.toUpperCase().equals("0")){ igual++; }
        if(numI.toUpperCase().equals("numI>1")){ mayor=mayor+1; }
        if(numI.toUpperCase().equals("<0")){ menor+=1; }
        System.out.println("");
      }
      //Datos de salida
      System.out.println("De numeros igresados:\n"+igual+" son 0\n"+mayor+" son mayores a 0\n"+menor+" son menores a 0\nEn total son:"+maximo);
      System.out.println("");
    }
}