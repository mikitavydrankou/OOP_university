public class NiepoprawnyFormatDanychException extends Exception {
    public NiepoprawnyFormatDanychException(String message) {
        super(message);
    }



    public static void main(String[] args) {
        String testowyEmail = "niepoprawny_email";

        try {
            sprawdzFormatDanych(testowyEmail);
            System.out.println("Format danych jest poprawny.");
        } catch (NiepoprawnyFormatDanychException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }

    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        // Tutaj można dodać odpowiednią logikę sprawdzania formatu danych, np. dla adresu e-mail.
        // Poniżej znajduje się przykładowa implementacja dla sprawdzania formatu adresu e-mail.

        // Prosty wzorzec dla adresu e-mail (nie jest idealny, ale na potrzeby przykładu wystarczy).
        String wzorzecEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        if (!dane.matches(wzorzecEmail)) {
            throw new NiepoprawnyFormatDanychException("Niepoprawny format danych. Podany ciąg znaków nie jest adresem e-mail.");
        }
    }
}
