package rob.mainGame;

import javax.swing.*;
import java.awt.*;

public class battleRoom {
    private Image image;
    public static int x, y;

    public battleRoom() {
        ImageIcon i = new ImageIcon(this.getClass().getResource("battleRoom.png"));
        image = i.getImage();
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }
}
