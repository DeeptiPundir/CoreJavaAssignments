package assignment02;

public class EmployeeSalary {
    public static void main(String[] args) {

        int noOfDays =7;
        Employee emp = new Manager1();
        double sal = emp.incentive + emp.totalSalary();
        System.out.println("Salary of Manager is " + sal);


        Employee emp1 = new Labour();
        double overTime = noOfDays * emp1.overtime;
        double sal1 = overTime + emp1.totalSalary();
        System.out.println("Salary of Labour is " + sal1);

    }
}
