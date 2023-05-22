package Principal;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;

public class RadioButtonConImagen extends JPanel {
    private JRadioButton boton = new JRadioButton();
    private JLabel imagen;
    private Border marco = BorderFactory.createLineBorder(Color.black);

    public RadioButtonConImagen(String path, int ancho, int largo){
        ImageIcon Icon = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(ancho, largo, Image.SCALE_DEFAULT));
        imagen = new JLabel(Icon);
        this.setBorder(marco);
        add(boton);
        add(imagen);
    }

    public void addButtonGroup(ButtonGroup grupo){
        grupo.add(boton);
    }

    public void addActionListener(ActionListener listener) {
        boton.addActionListener(listener);
    }

    public boolean isSelected(){
        return boton.isSelected();
    }
}
