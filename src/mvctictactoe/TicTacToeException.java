/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctictactoe;

import java.io.IOException;

/**
 *
 * @author Benjamin Chinwe 2016
 * To handle exceptions in TicTacToe
 */
public class TicTacToeException extends IOException{ 
    public TicTacToeException (){
        super(); // Argumentless call to super IOException class
    }
    public TicTacToeException (String message){
        super(message); // Argumentled call to super IOException class
    }
    public TicTacToeException (String message, Throwable cause){
        super(message, cause);
    }
    
    public TicTacToeException (Throwable cause){
        super(cause);
    }
}
