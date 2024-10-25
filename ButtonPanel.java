import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel{
    private JButton bursariesButton = new JButton("Bursaries");
    private JButton skillsButton = new JButton("Skills Trainings");
    private JButton workButton = new JButton("Available Work");

    public ButtonPanel(int height, int width){
        bursariesButton.setActionCommand("bursaries");
        workButton.setActionCommand("work");
        bursariesButton.addActionListener(new ButtonListener());
        workButton.addActionListener(new ButtonListener());
        bursariesButton.setSize(100, 10);
        skillsButton.setSize(100, 10);
        workButton.setSize(100, 10);
        setSize((int)width/2, (int)height/2);
        setLayout(new GridLayout(0, 1));
        add(bursariesButton);
        add(skillsButton);
        add(workButton);
    }
}