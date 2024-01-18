package Mod1;

import javax.swing.JOptionPane;

public class problem {
    public static void main(String[] args) {

        int startingNumber = 10;
        String results;
        String inputRequest;

        // asks user for input of guess
        results = JOptionPane.showInputDialog(null, "Guess the number 1 - 10!");

        //logic for input value

        if(startingNumber == 6){
            inputRequest = "Great Guess!";
        } else{
            inputRequest = "sorry try again..";
        }

        //output end result
        JOptionPane.showMessageDialog(null, inputRequest);
           
    }
}