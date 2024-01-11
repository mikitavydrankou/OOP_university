package printer;

public interface Printer {
    void drukuj(String text);
}

class StandardowyPrinter implements Printer{
    @Override
    public void drukuj(String text){
        System.out.println(text);
    }
}

class NieStandardowyPrinter implements Printer{
    @Override
    public void drukuj(String text){
        StringBuilder wynik = new StringBuilder(text);
        System.out.println(wynik.reverse().toString());
    }
}

class biuro{
    private Printer printer;

    public biuro(Printer printer) {
        this.printer = printer;
    }

    public void drukujDokument(String text){
        printer.drukuj(text);
    }
}

class main{
    public static void main(String[] args) {
        biuro b1 = new biuro(new StandardowyPrinter());
        biuro b2 = new biuro(new NieStandardowyPrinter());

        b1.drukujDokument("dokument_1");
        b2.drukujDokument("dokument_2");
    }
}
