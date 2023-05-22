package Wrappers;

import Tarea1.*;

import javax.swing.*;
import java.awt.*;

public class PanelProducto extends JPanel {

    String path;
    Point pos;
    Image image;

    PanelProducto(int x, int y, int type){
        pos = new Point(x, y);

        path = "";
        switch (type) {
            case Expendedor.COCA -> path = "res/coca.png";
            case Expendedor.SPRITE -> path = "res/sprite.png";
            case Expendedor.SNICKERS -> path = "res/snickers.png";
            case Expendedor.SUPER8 -> path = "res/super8.png";
            case 100 -> path = "res/100.png";

            default -> System.out.println("Error al cargar imagen");
        }
        image = new ImageIcon(path).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(image, pos.x, pos.y, this);
    }
}
