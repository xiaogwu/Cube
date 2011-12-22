/**
 * @author Xiao G. Wu
 * CS111A - Inclass assignment 
 * @version 1.0 12/22/2011
 */ 

/**
 * This class models a Cube with dimensions and density
 */

public class Cube {
    private int dimension;
    private double density;

    public Cube(int dim, double den) {
        dimension = dim;
        density = den;
    }

    public void setDimension(int dim) {
        dimension = dim;
    }

    public void setDensity(double den) {
        density = den;
    }

    public double getVolume() {
        return dimension * dimension * dimension;
    }

    public double getMass() {
        return density * getVolume();
    }
}
