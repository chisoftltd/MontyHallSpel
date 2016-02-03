/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chisoft.montyhallspel;

import javax.swing.JOptionPane;

/**
 *
 * @author Chisoft
 */
public class MontyHallMain {

    private static int numberOfAttampts;
    private static int numberOfBoxes;
    public static void main(String[] args) {
        numberOfAttampts = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Attempts: "));
        numberOfBoxes = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Boxes: "));
        
        SwitchingBox switchingBox = new SwitchingBox(numberOfAttampts, numberOfBoxes);
        NoSwitchingBox noSwitchingBox = new NoSwitchingBox(numberOfAttampts, numberOfBoxes);
        
    }
    
}
