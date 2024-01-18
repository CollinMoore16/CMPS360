import javax.swing.JOptionPane;

public class thirdProgram {
    public static void main(String[] args) {
/* */
        int startingNumber = 10;
        String results;
        String inputRequest;

        // asks user for input of guess
        results = JOptionPane.showInputDialog(null, "Guess the lucky number!");

        //logic for input value
        
        if(startingNumber <= 10){
            inputRequest = "Great Guess!";
        } else{
            inputRequest = "sorry try again..";
        }

        //output end result
        JOptionPane.showMessageDialog(null, inputRequest);

       
           
    }
}