import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        int liczbaIntA = 12, liczbaIntB = 20;
        double liczbaDoubleA = 25.25, liczbaDoubleB = 8.50;
        System.out.println(liczbaIntA == 12 && liczbaIntB == 10);  //false
        System.out.println(liczbaIntA == 11 || liczbaIntB != 10);  //true
        System.out.println(liczbaIntA >= 12 && liczbaIntB < 100);  //true
        System.out.println(liczbaIntA < 8 || liczbaIntB == 10);  //false
        System.out.println((liczbaIntA < 8 | liczbaIntB == 20) && liczbaIntA == 12); //true
        System.out.println(liczbaIntA == liczbaIntB || liczbaIntB > 10);  //true
        liczbaIntA = liczbaIntA + (int)liczbaDoubleB;
        System.out.println(liczbaIntA);
        System.out.println(liczbaDoubleA + liczbaIntA);

    }
}
