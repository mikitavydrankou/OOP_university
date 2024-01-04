public class Counter<T> {
    private int count = 0;

    public void add(T element) {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter<String> stringCounter = new Counter<>();
        stringCounter.add("Pierwszy element");
        stringCounter.add("Drugi element");

        System.out.println("Liczba dodanych elementów: " + stringCounter.getCount());

        Counter<Integer> integerCounter = new Counter<>();
        integerCounter.add(1);
        integerCounter.add(2);
        integerCounter.add(3);

        System.out.println("Liczba dodanych elementów: " + integerCounter.getCount());
    }
}
