//////////////////////////////////////////////////////////////////////
//
//      Author: Alessandro Demela
//      Date: 30/10/2020
//      This program calculates meal price
//
//////////////////////////////////////////////////////////////////////

public class MealCalculatorSplitted {
    private static final double N_PEOPLE = 4.;
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tip + tax + listedMealPrice;

        return result;
        
    }
    public static void main(String[] args) {
        double result = calculateTotalMealPrice(20, 0.10, 0.22);

        System.out.println("Price everyone has to pay is " + result/N_PEOPLE);
    }
}
