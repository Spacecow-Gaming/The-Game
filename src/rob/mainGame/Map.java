package rob.mainGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Map extends JPanel implements ActionListener {

    private TestRoomTwo tr2;
    private TestRoom tr;
    private TestArea ta;
    public static Player player;


    public Map() {

        addKeyListener(new adapter());
        setFocusable(true);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);

        tr2 = new TestRoomTwo();
        tr = new TestRoom();
        ta = new TestArea();
        player = new Player();

        Timer timer = new Timer(5, this);
        timer.start();

    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        if (player.room.equals("testArea")) {
            g2d.drawImage(ta.getImage(), ta.getX(), ta.getY(), this);
        } else if (player.room.equals("testRoom")) {
            g2d.drawImage(tr.getImage(), tr.getX(), tr.getY(), this);
        } else if (player.room.equals("testRoomTwo")) {
            g2d.drawImage(tr2.getImage(), ta.getX(), ta.getY(), this);
        }

        g2d.drawImage(player.getImage(), player.getX() + 4, player.getY() - 20, (player.getX() + 4 + (player.getWidth() * 2)), (player.getY() + (player.getHeight() * 2) - 20), player.getSprFrame(), player.getSprDir(), (player.getSprFrame() + player.getWidth()), (player.getSprDir() + player.getHeight()), this);
        g2d.drawString(("Position = " + player.getX() + ", " + player.getY()), 300, 300);

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }


    public void actionPerformed(ActionEvent e) {
        player.move();
        if (player.getX() == 10 && player.getY() >= 75 && player.getY() < 95 && player.dx < 0 && player.room.equals("testArea")) {
            player.x = 700;
            player.room = "testRoom";
        } else if (player.getX() == 550 && player.getY() > 78 && player.getY() < 90 && player.dx > 0 && player.room.equals("testRoom")) {
            player.x = 10;
            player.room = "testArea";
        } else if (player.getY() == 350 && player.getX() > 200 && player.getX() < 240 && player.dy > 0 && player.room.equals("testRoom")) {
            player.y = 10;
            player.x = 110;
            player.room = "testRoomTwo";
        } else if (player.getY() == 10 && player.getX() > 95 && player.getX() < 135 && player.dy < 0 && player.room.equals("testRoomTwo")) {
            player.y = 350;
            player.x = 210;
            player.room = "testRoom";
        }
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