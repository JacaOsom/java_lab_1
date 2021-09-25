import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        byte zmiennaByte = 56;
        short zmiennaShort = 2845;
        int zmiennaInt2 = 92845;
        long zmiennaLong = 123000123000L;
        float zmiennaFloat = 22.12f;
        double zmiennaDouble = 60124582.5658;
        boolean zmiennaBoolean = true; //or false
        char zmiennaChar = 'c';
        String zmiennaString = "Wyższa Szkoła Bankowa";
        System.out.println("zmienna byte = " + zmiennaByte);
        System.out.println("zmienna short = " + zmiennaShort);
        System.out.println("zmienna int = " + zmiennaInt);
        System.out.println("zmienna long = " + zmiennaLong);
        System.out.println("zmienna float = " + zmiennaFloat);
        System.out.println("zmienna double = " + zmiennaDouble);
        System.out.println("zmienna boolean = " + zmiennaBoolean);
        System.out.println("zmienna char = " + zmiennaChar);
        System.out.println("zmienna string = " + zmiennaString);
        System.out.println();

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        int liczbaA = 78, liczbaB = 24;
        int dodawanie = liczbaA + liczbaB;
        int odejmowanie = liczbaA - liczbaB;
        int mnozenie = liczbaA * liczbaB;
        int dzielenie = liczbaA / liczbaB;
        int modulo = liczbaA % liczbaB;
        System.out.println("Dodawanie " + liczbaA + " + " + liczbaB + " = " + dodawanie);
        System.out.println("Odejmowanie " + liczbaA + " - " + liczbaB + " = " + odejmowanie);
        System.out.println("Mnożenie " + liczbaA + " * " + liczbaB + " = " + mnozenie);
        System.out.println("Dzielenie " + liczbaA + " / " + liczbaB + " = " + dzielenie);
        System.out.println("Modulo " + liczbaA + " % " + liczbaB + " = " + modulo);
        System.out.println();

        double liczbaX = 12.25, liczbaY = 10.10;
        double dodawanie2 = liczbaX + liczbaY;
        double odejmowanie2 = liczbaX - liczbaY;
        double mnozenie2 = liczbaX * liczbaY;
        double dzielenie2 = liczbaX / liczbaY;
        double modulo2 = liczbaX % liczbaY;
        System.out.println("Dodawanie " + liczbaX + " + " + liczbaY + " = " + dodawanie2);
        System.out.println("Odejmowanie " + liczbaX + " - " + liczbaY + " = " + odejmowanie2);
        System.out.println("Mnożenie " + liczbaX + " * " + liczbaY + " = " + mnozenie2);
        System.out.println("Dzielenie " + liczbaX + " / " + liczbaY + " = " + dzielenie2);
        System.out.println("Modulo " + liczbaX + " % " + liczbaY + " = " + modulo2);

    }
}
