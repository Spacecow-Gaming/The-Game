package rob.nonMainGames.sideGames.ToasterQuest;

import javax.swing.*;

public class MainClass extends JFrame {
    public MainClass() {
        add(new Panel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("Toaster Quest");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainClass();
    }
}
