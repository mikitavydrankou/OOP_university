import java.util.Scanner;

public class wariant_k {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe");
        int a = input.nextInt();
        System.out.println("Podaj drugą liczbe");
        int b = input.nextInt();

        while (a<=b){
            if (a%2==0){
                System.out.println(a);
            }
    a++;
        }
    }
}
