package com.bridgelabz.EmployeeWageComputationday3;

public class EmployeeWageComputation {
    public static final String FULL_TIME = "FULL_TIME";
    public static final String PART_TIME = "PART_TIME";
    public static final int perHourWage = 20;


    public static void main(String[] args) {
        //check emp present or not UC1
        EmployeePresentUC1 uc1 = new EmployeePresentUC1();
        uc1.CheckEmpPresent();


        //add part time emp
        AddPartTimeEmpUC3 uc3 = new AddPartTimeEmpUC3();
        int perDayHourFT = uc3.noOfHoursInDay(FULL_TIME);
        int perDayHourPT = uc3.noOfHoursInDay(PART_TIME);
        System.out.println("Full Time Employee per day working Hours are " +perDayHourFT+"hr");
        System.out.println("Part Time Employee per day working Hours are " +perDayHourPT+"hr");

        //calculate employee daily wage UC2
        EmpDailyWageUC2 uc2 = new EmpDailyWageUC2();
        double dailyWageFT = uc2.calculateEmpDailyWage(perHourWage, 8);
        System.out.println(" Full-Time Employee Daily Wage is " +dailyWageFT+"Rs");

        double dailyWagePT = uc2.calculateEmpDailyWage(perHourWage, 4);
        System.out.println("Part-Time Employee Daily Wage is " +dailyWagePT+"Rs");

        //calculate monthly wage of emp UC5
        EmpMonthlyWageUC5 uc5 = new EmpMonthlyWageUC5();
        double monthlyWageFT = uc5.calculateEmpMonthWage(dailyWageFT, 20);
        System.out.println("FULL_TIME employee monthly wage is " +monthlyWageFT+"Rs");

        double monthlyWagePT = uc5.calculateEmpMonthWage(dailyWagePT, 20);
        System.out.println("PART_TIME employee Monthly wage is " +monthlyWagePT+"Rs");

        //calculate total emp wage UC6
        //Wages till a condition of total working hours or days is reached for a month
        TotalEmpWageUC6 uc6 = new TotalEmpWageUC6();
        uc6.calTotalEmpWage(100,20);



    }

}
