package zwierzeta;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(30);
        Animal animal1 = new Animal(20);
        findMax(animal1,animal);
    }

    public static<T extends Animal> T findMax(T element1, T element2){
        T bigger;
        if(element1.wiek>element2.wiek){
            bigger = element1;
        }   else {
            bigger = element2;
        }
        return bigger;
    }
}
