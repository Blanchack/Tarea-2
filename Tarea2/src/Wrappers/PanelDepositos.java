package Wrappers;

import Tarea1.Expendedor;

import javax.swing.*;
import java.awt.*;

public class PanelDepositos extends JPanel {
    private int size;
    private int type;
    private Image image;
    private Point pos;

    PanelDepositos(int type, int x, int y){
        this.type = type;

        pos = new Point(x, y);

        String path = "";

        switch (type) {
            case Expendedor.COCA -> path = "res/coca.png";
            case Expendedor.SPRITE -> path = "res/sprite.png";
            case Expendedor.SNICKERS -> path = "res/snickers.png";
            case Expendedor.SUPER8 -> path = "res/super8.png";
            case 100 -> path = "res/100.png";

            default -> System.out.println("Error al cargar imagen");
        }

        if(type == 100) image = new ImageIcon(path).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        else image = new ImageIcon(path).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);



        setVisible(true);
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(pos.x, pos.y, 100, 430);

        for(int i = 0; i < Math.min(7,size); i++){
            int offset;
            if(type == 100) offset = 60;
            else offset = 110;

            g.drawImage(image, pos.x, pos.y + i*offset,this );
        }
        for(int i = 7; i < size; i++){
            int offset;
            if(type == 100) offset = 60;
            else offset = 110;

            g.drawImage(image, pos.x+50, pos.y + (i-7)*offset,this );
        }
    }
}
