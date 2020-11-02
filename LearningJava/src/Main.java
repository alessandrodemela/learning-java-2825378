//////////////////////////////////////////////////////////////////////
//
//      Author: Alessandro Demela
//      Date: 30/10/2020
//      Main class for Triangle.java
//
//////////////////////////////////////////////////////////////////////


public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        double triangeAArea = triangleA.findArea();
        System.out.println(triangeAArea);

        StudentClass studA = new StudentClass("Pippo","Baudo",2021,29.4);

        System.out.println(studA.expYearToGraduate);

        studA.incrementYearToGraduate();

        System.out.println(studA.expYearToGraduate);

    }
    
}
