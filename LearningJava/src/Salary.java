//////////////////////////////////////////////////////////////////////
//
//      Author: Alessandro Demela
//      Date: 30/10/2020
//      This program shows an example of function in Java calculating 
//      the salary for an employee
//
//////////////////////////////////////////////////////////////////////

public class Salary {
    private static final int HOURS_PER_DAY = 8;
    private static final int WEEK_PER_YEAR = 52;

    public static double computeSalary(int hoursPerWeek, int moneyPerHour, int vacationDays){
        double salary = WEEK_PER_YEAR * hoursPerWeek * moneyPerHour - HOURS_PER_DAY * vacationDays;

        return salary;
    }
    public static void main(String[] args) {
        int HOURS_PER_WEEK = 40;
        int MONEY_PER_HOUR = 12;

        int VACATION_DAYS = 20;

        double salary = computeSalary(HOURS_PER_WEEK, MONEY_PER_HOUR, VACATION_DAYS);

        System.out.println(salary);
    }
}
