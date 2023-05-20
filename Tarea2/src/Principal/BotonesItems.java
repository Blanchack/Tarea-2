package Principal;

import Tarea1.Expendedor;

import javax.swing.*;
import java.awt.*;

public class BotonesItems extends JPanel {
    RadioButtonConImagen sprite;
    RadioButtonConImagen coca;
    RadioButtonConImagen snickers;
    RadioButtonConImagen super8;

    ButtonGroup group;

    BotonesItems(){
        sprite = new RadioButtonConImagen("res/sprite.png", 100, 100);
        coca = new RadioButtonConImagen("res/coca.png", 100, 100);
        snickers = new RadioButtonConImagen("res/snickers.png", 100, 100);
        super8 = new RadioButtonConImagen("res/super8.png", 100, 100);

        this.setLayout(new GridLayout(2, 2));

        this.add(sprite);
        this.add(super8);
        this.add(coca);
        this.add(snickers);

        group = new ButtonGroup();

        sprite.addButtonGroup(group);
        coca.addButtonGroup(group);
        snickers.addButtonGroup(group);
        super8.addButtonGroup(group);
    }

    public int idDelProductoSeleccionado(){
        if(sprite.isSelected()){
            return Expendedor.SPRITE;
        }
        else if(snickers.isSelected()){
            return Expendedor.SNICKERS;
        }
        else if(coca.isSelected()){
            return Expendedor.COCA;
        }
        else if(super8.isSelected()){
            return Expendedor.SUPER8;
        }
        else{
            return -1;
        }
    }
}
