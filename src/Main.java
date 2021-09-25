import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int myAge = 26;
        if (myAge % 3 == 0)
            System.out.println("Podzielny przez 3");
        else
            System.out.println("Niepodzielny przez 3");


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        int myIndex = 56701;
        String evenNumber = (myIndex % 2 == 0) ? "prawda" : "fałsz";
        System.out.println("Czy numer indeksu 56701 jest parzysty? " + evenNumber);
        boolean evenNumber2 = (myIndex % 2 == 0);
        System.out.println("Czy numer indeksu 56701 jest parzysty? " + evenNumber2); //boolean

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę zmiennoprzecinkową:");
        double liczbaA = scan.nextDouble();

        if (liczbaA == 10)
        {
            System.out.println("Liczba jest równa 10");
        }
        else if (liczbaA < 10)
        {
            System.out.println("Liczba jest mniejsza niż 10");
        }
        else if (liczbaA > 10 && liczbaA <= 50)
        {
            System.out.println("Licza mieście się w przedziale między 10 a 50");
        }
        else
        {
            System.out.println("Liczba jest większa od 50!");
        }

    }
}
