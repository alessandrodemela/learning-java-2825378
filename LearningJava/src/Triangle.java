//////////////////////////////////////////////////////////////////////
//
//      Author: Alessandro Demela
//      Date: 30/10/2020
//      Class to describe a triangle
//
//////////////////////////////////////////////////////////////////////

public class Triangle {
    double base, height, sideLengthOne, sideLengthTwo, sideLengthThree;
    
    static int numOfSides = 3;

    public Triangle(double base, double height, double sideLengthOne, double sideLengthTwo, double sideLengthThree){

        this.base = base;
        this.height = height;
        this.sideLengthOne = sideLengthOne;
        this.sideLengthTwo = sideLengthTwo;
        this.sideLengthThree = sideLengthThree;
    }

    public double findArea() {
        return this.base * this.height / 2;
    }
}
