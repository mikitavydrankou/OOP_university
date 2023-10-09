import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj godzinę: ");
        int a = input.nextInt();
        System.out.println("Podaj minuty: ");
        int b = input.nextInt();
        System.out.println("Podaj sekundy: ");
        int c = input.nextInt();

        if(a < 12 && b < 60 && c < 60){
            System.out.println("Poprawna godzina!");
        }
        else {
            System.out.println("Błąd!");
        }
    }
}
