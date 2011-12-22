/**
 * @author Xiao G. Wu
 * CS111A - Inclass assignment 
 * @version 1.0 12/22/2011
 */ 

/**
 * This class tests the Cube class
 */


public class TestCube {
    public static void main(String[] args) {
        Cube goldCube = new Cube(10, 19.3);

        System.out.println("Cube's mass is: " + goldCube.getMass() + " g/cm^3");
    }
}
