public class Employee implements Cloneable{
    String name;
    Double[] salaries = new Double[12];

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Employee(String name, Double[] salaries){
        this.name = name;
        this.salaries = salaries;
    }

}
