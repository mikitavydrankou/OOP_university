import java.util.ArrayList;

public class TestPerson {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person();
        p1.name = "Sasha";
        boolean zawiera = list.contains(p1.name);
        if(zawiera == true){
            System.out.println("Zawiera");
        }
        else {
            System.out.println("Nie zawiera");
        }
    }
}

class Person{
    public String name;
}

