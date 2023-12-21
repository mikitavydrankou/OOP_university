public class AgeChecker {
    public static void main(String[] args) {
        try {
            checkAge(25);  // Przykładowa wartość wieku
            checkAge(15);  // Przykładowa wartość wieku poniżej 18
            checkAge(30);  // Kolejna przykładowa wartość wieku
        } catch (IllegalArgumentException pidor) {
            System.out.println("Błąd: " + pidor.getMessage());
        }
    }

    public static void checkAge(int age){
        if(age<18){
            throw new IllegalArgumentException("No piwo");
        } else{
            System.out.println("Masz piwo, twój wiek: " + age);
        }
    }
}
