import java.io.Serializable;

public class Student implements Serializable {

    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else return "D";
    }

    @Override
    public String toString() {
        return id + "," + name + "," + marks + "," + getGrade();
    }
}