public class Person {
    private String firstName;
    protected String lastName;

    public Person(){

    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class Employee extends Person {
    public Employee(){

    }

    public Employee(String firstName, String lastName){
        super(firstName, lastName);
    }


    private void display(){

    }
}
