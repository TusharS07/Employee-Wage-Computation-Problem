package com.bridgelabz.EmployeeWageComputationday3;

public class TotalEmpWageUC6 extends EmployeeWageComputation {
    public static final int MAX_HRS_IN_MONTH = 100;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static int totalEmpHR ;
    public static int totalWorkingDay ;
    public static double totalWage;


    public void calTotalEmpWage(int totalEmpHR, int totalWorkingDay) {
        while (totalEmpHR <= MAX_HRS_IN_MONTH && totalWorkingDay <= NUM_OF_WORKING_DAYS) {
            totalWage = totalEmpHR * perHourWage;
            totalWorkingDay++;
        }
        System.out.println("Wages till a condition of total working hours or days is reached for a month " +totalWage);
    }
}
