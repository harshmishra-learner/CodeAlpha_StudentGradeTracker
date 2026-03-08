import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class ChartPanel extends JFrame {

    public ChartPanel(ArrayList<Student> students) {

        setTitle("Marks Chart");
        setSize(400,400);
        setVisible(true);

        add(new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);

                int x = 50;

                for(Student s : students) {

                    int height = s.marks * 2;

                    g.fillRect(x,300-height,30,height);
                    g.drawString(s.name,x,320);

                    x += 60;
                }
            }
        });
    }
}