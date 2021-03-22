/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author 40757
 */
public class ControlPanel extends JPanel {

    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    JButton loadBtn = new JButton("Load");
    JButton resetBtn = new JButton("Reset");
    JButton exitBtn = new JButton("Exit");


    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //change the default layout manager (just for fun)
        setLayout(new GridLayout(1, 4));
        //add all buttons ...TODO
        add(saveBtn);
        add(loadBtn);
        add(resetBtn);
        add(exitBtn);
        //configure listeners for all buttons
        saveBtn.addActionListener(this::save);
        loadBtn.addActionListener(this::load);
        resetBtn.addActionListener(this::reset);
        exitBtn.addActionListener(this::exit);
  
    }

    private void save(ActionEvent e) {
        try {
            
            ImageIO.write(frame.canvas.image, "PNG", new File("d:/test.png"));
            
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
    private void load(ActionEvent e) {
        try {
            
            ImageIO.write(frame.canvas.image, "PNG", new File("d:/test.png"));
            
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
    private void reset(ActionEvent e) {
        System.exit(0);
    }
    
    private void exit(ActionEvent e) {
        System.exit(0);
    }

}
