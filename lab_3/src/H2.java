public class H2 {
    public static void main(String[] args) {
        if (palindrom("na1an")) {
            System.out.println("jest palindromem");
        } else {
            System.out.println("nie jest palindromem");
        }
    }

    public static boolean palindrom(String arg) {
        if (arg == null) {
            return false;
        }
        String reversedWord = new StringBuilder(arg).reverse().toString();

        return arg.equals(reversedWord);
    }
}