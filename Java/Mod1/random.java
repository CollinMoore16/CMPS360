package Mod1;
import java.util.Random;

class GenerateRandom {
    public static void main( String args[] ) {
  
      Random rand = new Random(); 

      int upperbound = 11;

      int int_random = rand.nextInt(upperbound); 
      
      System.out.println("Random integer value from 0 to" + (upperbound-1) + " : " + int_random);
    }
}
