public class Samochod {
    private Silnik silnik;

    public Samochod(Silnik silnik) {
        this.silnik = silnik;
    }

    public void start(){
        silnik.urochom();
    }

    public void stop(){
        silnik.zatrzyma();
    }
}
