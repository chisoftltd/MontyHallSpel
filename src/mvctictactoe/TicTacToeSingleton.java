/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctictactoe;

import java.util.Random;

/**
 *
 * @author Benjamin Chinwe 2016. A singleton class.
 */
public class TicTacToeSingleton {

    private static TicTacToeSingleton theSingleton;
    private static int colorValue;

    /* A private Constructor prevents any other 
    * class from instantiating.
     */
    private TicTacToeSingleton() {
    }

    static {
        try {
            theSingleton = new TicTacToeSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Singleton instance not created");
        }
    }

    /* Static 'instance' method */
    public static TicTacToeSingleton getInstance() {
        return theSingleton;
    }

    /* Other methods protected by singleton-ness. This method 
    randomise the background color of the gameButton in the
    TicTacToeView class */
    protected static int colorMethod() {
        Random buttonColor = new Random();

        for (int i = 0; i < 10; i++) {
            colorValue = buttonColor.nextInt(250) + 1;
        }
        return colorValue;
    }
}
