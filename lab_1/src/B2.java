// Napisz program, który przyjmuje trzy liczby całkowite jako argumenty i
// zwraca największą z nich. Zastosuj instrukcje warunkowe do porównania liczb.

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a:");
        double a = input.nextDouble();
        System.out.println("Podaj b:");
        double b = input.nextDouble();
        System.out.println("Podaj c:");
        double c = input.nextDouble();

        double max = Math.max(a,b);
        max = Math.max(max, c);

        System.out.println("Największa: " + max);
    }
}
