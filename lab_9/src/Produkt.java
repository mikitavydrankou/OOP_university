import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Produkt implements Comparable<Produkt>{
    String nazwa;
    double cena;
    LocalDate dataProdukcji;

    public Produkt(String nazwa, double cena, LocalDate dataProdukcji) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataProdukcji = dataProdukcji;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setDataProdukcji(LocalDate dataProdukcji) {
        this.dataProdukcji = dataProdukcji;
    }

    public int compareTo(Produkt other){
        return this.dataProdukcji.compareTo(other.dataProdukcji);
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", dataProdukcji=" + dataProdukcji +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Produkt> produktList = new ArrayList<>();
        produktList.add(new Produkt("Produkt1", 25.99, LocalDate.of(2023, 1, 15)));
        produktList.add(new Produkt("Produkt2", 19.99, LocalDate.of(2023, 2, 5)));
        produktList.add(new Produkt("Produkt3", 30.49, LocalDate.of(2023, 1, 5)));
        produktList.add(new Produkt("Produkt4", 15.75, LocalDate.of(2023, 3, 10)));
        produktList.add(new Produkt("Produkt5", 12.99, LocalDate.of(2023, 2, 1)));

        Collections.sort(produktList);

        for(Produkt produkt : produktList){
            System.out.println(produkt);
        }
    }

}
