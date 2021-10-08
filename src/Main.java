import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        System.out.println("Pierwszy przykład:");
        double[] tab1 = new double[5];
        for (int i = 0; i < tab1.length; i++)
        {
            tab1[i] = i + 12.5;
        }

        for (int i = 0; i < tab1.length; i++)
        {
            System.out.print(tab1[i] + ", ");
        }

        System.out.println("\nDrugi przykład\n");

        double[] tab2 = {12.72, 25.876, 4, 100.123, 65.85};

        for (double variable1: tab2)
        {
            System.out.println(variable1);
        }

        System.out.println("\nTrzeci przykład:\n");
        
        Scanner scan = new Scanner(System.in);
        double[] tab3 = new double[5];
        System.out.println("Wprowadź kolejno 5 elementów tablicy: ");
        for (int i = 0; i < tab3.length; i++)
        {
            tab3[i] = scan.nextDouble();
        }

        System.out.println("\nOtrzymana tablica: ");
        for (double variable2: tab3)
        {
            System.out.print(variable2 + ", ");
        }
    }
}
