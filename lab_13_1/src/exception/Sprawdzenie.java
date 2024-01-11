package exception;

public class Sprawdzenie {
    public static void main(String[] args) {
        try {
            SprawdzFormatDanych("aa");
        }catch (NiepoprawnyFormatDanychException E){
            System.out.println("Zle jest bardzo nie super");
            System.out.println(E.getMessage());
        }
    }

    public static void SprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        if(dane.length() < 3){
            throw new NiepoprawnyFormatDanychException("Zle jest");
        } else{
            System.out.println("qitesjest super");
        }
    }
}