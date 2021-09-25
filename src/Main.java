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
        System.out.print("Podaj liczbę A: ");
        int liczbaA = scan.nextInt();
        System.out.print("Podaj liczbę B: ");
        int liczbaB = scan.nextInt();

        int dodawanie = liczbaA + liczbaB;
        int odejmowanie = liczbaA - liczbaB;
        int mnozenie = liczbaA * liczbaB;
        int dzielenie = liczbaA / liczbaB;
        int modulo = liczbaA % liczbaB;

        System.out.println("Dodawanie: " + dodawanie);
        System.out.println("Odejmowanie: " + odejmowanie);
        System.out.println("Mnożenie: " + mnozenie);
        System.out.println("Dzielenie: " + dzielenie);
        System.out.println("Modulo: " + modulo);
    }
}
