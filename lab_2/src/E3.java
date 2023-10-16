import java.util.Random;

public class E3 {
    public static void main(String[] args) {
        System.out.println(generateRandomIntInRange(30, 20));
    }
    public static double generateRandomIntInRange(int a, int b){
        if(b < a){
            int tmp = b;
            b = a;
            a = tmp;
        }

        Random random = new Random();
        return random.nextInt(b - a + 1)+a;
    }
}
