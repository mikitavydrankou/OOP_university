package zwierzeta;

public class Dog extends Animal{
    int wiek;

    public Dog(int wiek) {
        super(wiek);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "wiek=" + wiek +
                '}';
    }
}
