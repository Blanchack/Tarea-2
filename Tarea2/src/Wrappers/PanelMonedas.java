package Wrappers;

import Tarea1.*;

import Principal.RadioButtonConImagen;

import javax.swing.*;
import java.awt.*;

public class PanelMonedas extends JPanel {
    private RadioButtonConImagen m100;
    private RadioButtonConImagen m500;
    private RadioButtonConImagen m1000;
    private RadioButtonConImagen m1500;

    ButtonGroup group;

    BotonesMonedas(){
        m100 = new RadioButtonConImagen("res/100.png", 100, 100);
        m500 = new RadioButtonConImagen("res/500.png", 100, 100);
        m1000 = new RadioButtonConImagen("res/1000.jpg", 100, 100);
        m1500 = new RadioButtonConImagen("res/1500.jpg", 100, 100);

        this.setLayout(new GridLayout(2, 2));

        this.add(m100);
        this.add(m500);
        this.add(m1000);
        this.add(m1500);

        group = new ButtonGroup();

        m100.addButtonGroup(group);
        m500.addButtonGroup(group);
        m1000.addButtonGroup(group);
        m1500.addButtonGroup(group);
    }

    public Moneda monedaSeleccionada(){
        if(m100.isSelected()){
            return new Moneda100();
        }
        else if(m500.isSelected()){
            return new Moneda500();
        }
        else if(m1000.isSelected()){
            return new Moneda1000();
        }
        else if(m1500.isSelected()){
            return new Moneda1500();
        }
        return null;
    }
}
