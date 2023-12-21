import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Podaj pierwszą liczbę: ");
                int liczba1 = scanner.nextInt();

                System.out.print("Podaj drugą liczbę: ");
                int liczba2 = scanner.nextInt();

                int wynik = dzielenie(liczba1, liczba2);
                System.out.println("Wynik dzielenia: " + wynik);
                break; // Jeśli wszystko przebiegło pomyślnie, kończymy pętlę

            } catch (InputMismatchException e) {
                System.out.println("Błąd! Wprowadź poprawną liczbę.");
                scanner.nextLine(); // Czyszczenie bufora wejściowego
            } catch (ArithmeticException e) {
                System.out.println("Błąd! Nie można dzielić przez zero.");
            }
        }

        scanner.close();
    }

    private static int dzielenie(int liczba1, int liczba2) {
        if (liczba2 == 0) {
            throw new ArithmeticException("Nie można dzielić przez zero.");
        }
        return liczba1 / liczba2;
    }
}
