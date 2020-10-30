//////////////////////////////////////////////////////////////////////
//
//      Author: Alessandro Demela
//      Date: 30/10/2020
//      This program calculates meal price
//
//////////////////////////////////////////////////////////////////////

public class MealCalculator {
    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tip + tax + listedMealPrice;

        System.out.println("Total price is " + result);
        
    }
    public static void main(String[] args) {
        calculateTotalMealPrice(20, 0.10, 0.22);
    }
}
