//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Double[] tab = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 1.10, 1.11, 1.12};
        Employee e1 = new Employee("Robert", tab);
        Employee e2;

        try {
            e2 =(Employee) e1.clone();
        } catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }

        e1.salaries[5] = 999.9;

        System.out.println(e2.salaries[5].toString());
    }
}