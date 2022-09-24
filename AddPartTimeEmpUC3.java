package com.bridgelabz.EmployeeWageComputationday3;

public class AddPartTimeEmpUC3 extends EmployeeWageComputation{
    public int noOfHoursInDay(String type) {

        switch (type) {

            case FULL_TIME:
                return 8;
            case PART_TIME:
                return 4;
            default:
                return 0;
        }
    }

}
