import javax.swing.*;

public class App {
    // protected static class 
    
    public static void main(String[] args) throws Exception {
        JFrame mainFrame = new JFrame("Main Frame");
        int HEIGHT = 800;
        int WIDTH = 900;
        ButtonPanel panel = new ButtonPanel(HEIGHT, WIDTH);
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);
        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }
}
