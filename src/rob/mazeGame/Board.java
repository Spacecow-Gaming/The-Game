package rob.mazeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel implements ActionListener {

    private Player player;
    private Maze maze;
    public static boolean isGameOver = false;

    public Board() {
        addKeyListener(new adapter());
        setFocusable(true);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);

        maze = new Maze();
        player = new Player();

        Timer timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        Graphics2D g2d2 = (Graphics2D) g;

        if (isGameOver) {
            g.dispose();
            g.drawString("You Won!\nYour Score was " + Player.fouls, 350, 200);
        } else {


            g2d2.drawImage(maze.getImage(), maze.getX(), maze.getY(), this);
            g2d.drawImage(player.getImage(), player.getX(), player.getY(), this);

            Toolkit.getDefaultToolkit().sync();
            g.dispose();
        }
    }

    public void actionPerformed(ActionEvent e) {
        player.move();
        repaint();
    }

    private class adapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }

        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }
    }
}