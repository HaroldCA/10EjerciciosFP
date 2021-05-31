import java.util.Scanner;

public class Ejercicio05{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int billetesde50, billetesde10, billetesde20, cantidad, monedasde5;
        int monedasde10, monedasde1;
        System.out.print("Ingresa el valor de billetes de 50: ");
        billetesde50 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 10: ");
        billetesde10 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 20: ");
        billetesde20 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 5: ");
        monedasde5 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 10: ");
        monedasde10 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 1 peso: ");
        monedasde1 = in.nextInt();
        in.nextLine();
        cantidad=monedasde10 *10+monedasde5 *5+monedasde1+billetesde10*10+billetesde20*20+billetesde50*50;
        System.out.println("Valor de cantidad de dinero: " + cantidad);
    }

}