public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Zebra");

        System.out.println(animal.toString());

        Animal animal2 = new Animal("Zebra");

        Cat kot = new Cat("Filemon");

        System.out.println(kot);

        animal.makeSound();
        kot.makeSound();

        Animal animal3 = new Cat("Bonifacy");
        animal3.makeSound();
        System.out.println(animal3);

        //----------------------------//


    }
}