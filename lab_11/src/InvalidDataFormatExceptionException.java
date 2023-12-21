public class InvalidDataFormatExceptionException extends Exception {
    public InvalidDataFormatExceptionException(String message) {
        super(message);
    }



    public static void main(String[] args) {
        String poprawnyEmail = "jan@example.com";
        String niepoprawnyEmail = "janexample.com";

        try {
            sprawdzFormatDanych(poprawnyEmail);
            System.out.println("Format danych jest poprawny: " + poprawnyEmail);
        } catch (InvalidDataFormatExceptionException e) {
            System.out.println("Błąd: " + e.getMessage());
        }

        try {
            sprawdzFormatDanych(niepoprawnyEmail);
            System.out.println("Format danych jest poprawny: " + niepoprawnyEmail);
        } catch (InvalidDataFormatExceptionException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static void sprawdzFormatDanych(String dane) throws InvalidDataFormatExceptionException {
        // Tutaj możesz zdefiniować wzorzec, np. sprawdzając, czy dane są adresem e-mail
        String wzorzecEmail = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        if (!dane.matches(wzorzecEmail)) {
            throw new InvalidDataFormatExceptionException("Niepoprawny format danych: " + dane);
        }
    }
}
