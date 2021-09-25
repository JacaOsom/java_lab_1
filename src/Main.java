import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = scan.next();
        System.out.print("Podaj Nazwisko: ");
        String nazwisko = scan.next();
        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();
        System.out.print("Podaj numer indeksu: ");
        int nrIndeksu = scan.nextInt();

        System.out.printf("Imię: %s\nNazwisko: %s\nWiek: %d\nNumer indeksu: %d", imie, nazwisko, wiek, nrIndeksu);
        System.out.println();
        System.out.println();
        System.out.println("Imię i nazwisko: " + imie + " " + nazwisko + " Wiek: " + wiek + " Nr Indeksu: " + nrIndeksu);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

    }
}
