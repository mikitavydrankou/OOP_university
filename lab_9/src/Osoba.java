import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Osoba implements Comparable<Osoba>{
    public String imie;
    public int wzrost;
    public LocalDate dataUrodzenia;

    public Osoba(String imie, int wzrost, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.wzrost = wzrost;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public int getWzrost() {
        return wzrost;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    @Override
    public int compareTo(Osoba o) {
        // Porównanie malejące według wzrostu
        return Integer.compare(o.wzrost, this.wzrost);
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wzrost=" + wzrost +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }

    public static void main(String[] args) {
        // Tworzenie listy 5 obiektów klasy Osoba
        List<Osoba> listaOsob = new ArrayList<>();
        listaOsob.add(new Osoba("Anna", 165, LocalDate.of(1990, 5, 15)));
        listaOsob.add(new Osoba("Jan", 180, LocalDate.of(1985, 8, 22)));
        listaOsob.add(new Osoba("Ewa", 160, LocalDate.of(1995, 3, 10)));
        listaOsob.add(new Osoba("Piotr", 175, LocalDate.of(1980, 11, 7)));
        listaOsob.add(new Osoba("Katarzyna", 170, LocalDate.of(1992, 9, 25)));

        // Sortowanie listy według wzrostu (malejąco)
        Collections.sort(listaOsob);

        // Wyświetlanie posortowanej listy
        for (Osoba osoba : listaOsob) {
            System.out.println(osoba);
        }
    }
}
