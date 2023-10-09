import java.util.Scanner;

public class С17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = input.nextInt();
        int i = 1;
        int potega = 1;
        int silnia = 1;
        int licznik = 0;
        while (i<=n){
            potega *= 3;
            silnia *= i;
            System.out.println("Podaj liczbe nr " + i);
            int a = input.nextInt();
            if(potega < a && a < silnia){
                licznik++;
            }
            i++;
        }
        System.out.println("licznik: " + licznik);
    }
}
