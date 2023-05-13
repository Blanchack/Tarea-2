package Wrappers;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel{

    public PanelExpendedor(){

        this.setSize(350,400);
        this.setBackground(Color.white);

    }

    public void paint (Graphics g){

        g.setColor(Color.black);
        g.drawRect(80,80,350,400);
        g.setColor(Color.white);
        g.fillRect(81,81,348,398);
    }

}
