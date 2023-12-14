import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Produkt2 {
    private String nazwa;
    private double cena;
    private LocalDate dataWaznosci;

    public Produkt2(String nazwa, double cena, LocalDate dataWaznosci) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataWaznosci = dataWaznosci;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }

    @Override
    public String toString() {
        return "Produkt2{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", dataWaznosci=" + dataWaznosci +
                '}';
    }
}

class ProduktComparator implements Comparator<Produkt2> {
    @Override
    public int compare(Produkt2 p1, Produkt2 p2) {
        return p1.getDataWaznosci().compareTo(p2.getDataWaznosci());
    }

    public static void main(String[] args) {
        List<Produkt2> listaProduktow = new ArrayList<>();
        listaProduktow.add(new Produkt2("Chleb", 2.5, LocalDate.of(2023, 12, 31)));
        listaProduktow.add(new Produkt2("Mleko", 1.5, LocalDate.of(2023, 12, 15)));
        listaProduktow.add(new Produkt2("Jajka", 3.0, LocalDate.of(2023, 12, 20)));
        listaProduktow.add(new Produkt2("Ser", 4.0, LocalDate.of(2023, 12, 25)));
        listaProduktow.add(new Produkt2("Masło", 2.0, LocalDate.of(2023, 12, 10)));



        Collections.sort(listaProduktow, new ProduktComparator());
        
        for (Produkt2 produkt : listaProduktow) {
            System.out.println(produkt);
        }
    }
}
