package rob.nonMainGames.sideGames.RebellionPD;

import javax.swing.*;

public class MainClass extends JFrame {
    public MainClass() {
        add(new Panel());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        setSize(410, 315);
        setTitle("REBELLION");
    }

    public static void main(String[] args) {
        new MainClass();
    }
}
