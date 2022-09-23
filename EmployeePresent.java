package com.bridgelabz.day3;
public class EmployeePresent {
    public static void main(String[] args) {
        EmployeePresent emp = new EmployeePresent();
        emp.getEmpCheck();
    }

    public void getEmpCheck() {
        int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
            switch (empCheck) {
                case 1:
                    System.out.println(" Employee is Present");
                    break;

                default:
                    System.out.println(" Employee is abscent");
                    break;
            }
    }
}