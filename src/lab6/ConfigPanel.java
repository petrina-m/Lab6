/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.Color;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author 40757
 */
public class ConfigPanel extends JPanel {

    final MainFrame frame;
    JLabel label; // we’re drawing regular polygons
    JSpinner sidesField; // number of sides
    JComboBox colorCombo; // the color of the shape
    JComboBox shapeCombo;
    JComboBox actionCombo;
    JLabel sidesLabel;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //create the label and the spinner

        sidesLabel = new JLabel("Number of sides:");
        sidesField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        sidesField.setValue(6); //default number of sides
        //create the colorCombo, containing the values: Random and Black

        colorCombo = new JComboBox(new String[]{"Black", "Random Color"});

        shapeCombo = new JComboBox(new String[]{"Circle", "Polygon"});
        actionCombo = new JComboBox(new String[]{"Add", "Remove"});

          add(sidesLabel); 
          add(sidesField);
   

         add(colorCombo);
         add(shapeCombo);
         add(actionCombo);
    }

}
