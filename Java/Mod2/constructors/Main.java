package Mod2.constructors;

public class Main {
    int x;

    //Create the class constructor
    public Main() {
        x = 10;
    }
    
    public static void main(String[] args) {
        Main myOBj = new Main();
        System.out.println(myOBj.x);
    }
}
