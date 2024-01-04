import java.util.Arrays;

public class MinValue{

    public static <T extends Comparable<T>> T minValue(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("pusta");
        }

        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // Przykłady użycia
        Integer[] intArray = {4, 2, 8, 1, 6};
        Double[] doubleArray = {2.5, 1.2, 3.7, 0.8, 2.0};
        String[] stringArray = {"jabłko", "pomarańcza", "banan", "truskawka"};

        try {
            System.out.println("najmniejsza wartość w intArray: " + minValue(intArray));
            System.out.println("najmniejsza wartość w doubleArray: " + minValue(doubleArray));
            System.out.println("najmniejsza wartość w stringArray: " + minValue(stringArray));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Person[] peopleArray = {
                new Person("Jan", 30),
                new Person("Anna", 25),
                new Person("Marek", 35)
        };

        try {
            System.out.println("Najmłodsza osoba: " + minValue(peopleArray).getName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}
