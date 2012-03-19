package rob.scytheGame;

import javax.swing.*;

public class
        MainClass extends JFrame {

    public MainClass() {

        add(new Board());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(725, 425);
        setLocationRelativeTo(null);
        setTitle("Scythe Game");
        setResizable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainClass();
    }
}