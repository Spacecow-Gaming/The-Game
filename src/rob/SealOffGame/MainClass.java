package rob.SealOffGame;

import javax.swing.*;

public class MainClass extends JFrame {
    public MainClass() {

        add(new Panel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 300);
        setLocationRelativeTo(null);
        setTitle("Seal Off");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainClass();
    }
}
