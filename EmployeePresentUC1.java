package com.bridgelabz.EmployeeWageComputationday3;

public class EmployeePresentUC1 extends EmployeeWageComputation{

    public void CheckEmpPresent(){
        int FULL_TIME_EMP = 1;
        double empCheck = (int) (Math.floor(Math.random() * 10) % 2);
        if (empCheck == FULL_TIME_EMP) {
            System.out.println("Employee is Present");
        } else
            System.out.println("Employee is absent ");
    }
}
