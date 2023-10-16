import java.text.DecimalFormat;
import java.util.Random;

public class E2 {
    public static void main(String[] args) {
        System.out.println(generateRandomDouble());
    }
    public static String generateRandomDouble(){
        Random random = new Random();
        return new DecimalFormat("#0.0")
                .format(random.nextDouble());
    }
}

