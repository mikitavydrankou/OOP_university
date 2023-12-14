import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>, Cloneable{
    String name;
    double averageGrade;
    int yearsOfStudy;

    public Student(String name, double averageGrade, int yearsOfStudy){
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearsOfStudy = yearsOfStudy;
    }

    public Student(String name){
        this.name = name;
    }
    public Student(double averageGrade){
        this.averageGrade = averageGrade;
    }
    public Student(int yearsOfStudy){
        this.yearsOfStudy = yearsOfStudy;
    }

    public String toString(){
        return "[" + averageGrade + " " +yearsOfStudy+"]" ;
    }
    public Student(double averageGrade, int yearsOfStudy){
        this.averageGrade = averageGrade;
        this.yearsOfStudy = yearsOfStudy;
    }

    public static void main(String[] args) {
        ArrayList<Student>studentList = new ArrayList<>();
        studentList.add(new Student(4.0, 2));
        studentList.add(new Student(3.8, 3));
        studentList.add(new Student(4.6, 2));
        studentList.add(new Student(4.0, 1));
        System.out.println(studentList);

        //Collections.sort(studentList, new StudentAverageComparator());

        studentList.sort(new StudentAverageComparator());

        ArrayList<Student>studentList2 = new ArrayList<>();
        studentList.add(new Student(4.0, 2));
        studentList.add(new Student(3.8, 3));
        studentList.add(new Student(4.6, 2));
        studentList.add(new Student(4.0, 1));

        studentList2.sort(new StudentYearComparator().reversed());

        System.out.println(studentList);
        System.out.println(studentList2);

    }
    @Override
    public int compareTo(Student o){
        if(Double.compare(o.averageGrade,this.averageGrade)==0)
            return this.yearsOfStudy-o.yearsOfStudy;
        return Double.compare(o.averageGrade,this.averageGrade);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class StudentAverageComparator implements Comparator<Student>{
    public int compare(Student o1, Student o2){
        return Double.compare(o2.averageGrade,o1.averageGrade);
    }
}

class StudentYearComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        return o1.yearsOfStudy - o2.yearsOfStudy;
    }
}