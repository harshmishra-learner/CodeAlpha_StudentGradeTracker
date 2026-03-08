import java.io.*;
import java.util.ArrayList;

public class StudentManager {

    public static void exportCSV(ArrayList<Student> students) {

        try (FileWriter writer = new FileWriter("students.csv")) {

            writer.write("ID,Name,Marks,Grade\n");

            for(Student s : students)
                writer.write(s + "\n");

            System.out.println("Exported to students.csv");

        } catch(Exception e) {
            System.err.println("Error exporting to CSV: " + e.getMessage());
        }
    }
}