public class Student {
    public String firstName;
    public String secondName;
    public String fieldOfStudy;

    public Student(String firstName, String secondName, String fieldOfStudy){
        this.firstName = firstName;
        this.secondName = secondName;
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String firstName, String secondName){
        this(firstName, secondName, "WMiI");
    }
}

