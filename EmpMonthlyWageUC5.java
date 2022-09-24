package com.bridgelabz.EmployeeWageComputationday3;

public class EmpMonthlyWageUC5 extends EmployeeWageComputation{
    public double calculateEmpMonthWage(double perDayWage, int workingDay) {
        return perDayWage * workingDay;
    }

}
