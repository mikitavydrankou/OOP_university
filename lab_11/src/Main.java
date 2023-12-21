public class Main {
    public static void main(String[] args) {
        KierownikWycieczki kierownik = new KierownikWycieczki(new Koncert());
        kierownik.zalatwBilety();
        kierownik = new KierownikWycieczki(new BramkaNaAutostradzie());
        kierownik.zalatwBilety();
        kierownik = new KierownikWycieczki(new LotMiedzynarodowy());
        kierownik.zalatwBilety();




        Printer standardowyPrinter = new StandardowyPrinter();
        Biuro biuro = new Biuro(standardowyPrinter);
        biuro.drukujDokument("Wydruk");



        Silnik benzynowySilnik = new BenzynowySilnik();
        Samochod samochod = new Samochod(benzynowySilnik);
        samochod.start();
        samochod.stop();



        Uzytkownik uzytkownik = new Uzytkownik(new Email());
        uzytkownik.powiadomOModernizacji("modernizacja");


    }
}