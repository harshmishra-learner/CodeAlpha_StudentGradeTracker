import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DashboardFrame extends JFrame {

    ArrayList<Student> students = new ArrayList<>();
    JTextArea display;

    public DashboardFrame() {

        setTitle("Student Management Dashboard");
        setSize(600,500);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();

        JButton add = new JButton("Add");
        JButton view = new JButton("View");
        JButton delete = new JButton("Delete");
        JButton chart = new JButton("Show Chart");
        JButton export = new JButton("Export CSV");

        topPanel.add(add);
        topPanel.add(view);
        topPanel.add(delete);
        topPanel.add(chart);
        topPanel.add(export);

        add(topPanel,BorderLayout.NORTH);

        display = new JTextArea();
        add(new JScrollPane(display),BorderLayout.CENTER);

        add.addActionListener(e -> addStudent());
        view.addActionListener(e -> viewStudents());
        delete.addActionListener(e -> deleteStudent());
        chart.addActionListener(e -> new ChartPanel(students));
        export.addActionListener(e -> StudentManager.exportCSV(students));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void addStudent() {

        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID"));
        String name = JOptionPane.showInputDialog("Enter Name");
        int marks = Integer.parseInt(JOptionPane.showInputDialog("Enter Marks"));

        students.add(new Student(id,name,marks));
    }

    void viewStudents() {

        display.setText("");

        for(Student s : students)
            display.append(s + "\n");
    }

    void deleteStudent() {

        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to delete"));

        students.removeIf(s -> s.id == id);
    }
}