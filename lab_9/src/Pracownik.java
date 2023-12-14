import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pracownik implements Comparable<Pracownik>{
    String name;
    double pensja;
    LocalDate dataZatrudnienia;

    public Pracownik(String name, double pensja, LocalDate dataZatrudnienia) {
        this.name = name;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public String getName() {
        return name;
    }

    public double getPensja() {
        return pensja;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public void setDataZatrudnienia(LocalDate dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }


    @Override
    public int compareTo(Pracownik other){
        return Double.compare(this.pensja, other.pensja);
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "name='" + name + '\'' +
                ", pensja=" + pensja +
                ", dataZatrudnienia=" + dataZatrudnienia +
                '}';
    }

    public static void main(String[] args) {
        List<Pracownik>pracownikList = new ArrayList<>();
        pracownikList.add(new Pracownik("Piotr", 3000, LocalDate.of(2023, 1, 1)));
        pracownikList.add(new Pracownik("Alex", 2000, LocalDate.of(2023, 2, 2)));
        pracownikList.add(new Pracownik("Marcin", 6000, LocalDate.of(2022, 3, 5)));
        pracownikList.add(new Pracownik("Boss", 9999, LocalDate.of(2007, 7, 7)));

        Collections.sort(pracownikList);

        for (Pracownik pracownik : pracownikList) {
            System.out.println(pracownik);
        }
    }
}
