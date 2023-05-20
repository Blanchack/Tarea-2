package Wrappers;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel{

    public PanelComprador(){

        //this.setLayout(null);
        this.setBounds(370,0,490,400);
        this.setBackground(Color.green);

    }

    public void paint (Graphics g){

        g.setColor(Color.black);
        g.drawRect(450,80,490,400);
        g.setColor(Color.GREEN);
        g.fillRect(451,81,488,398);

    }
}
