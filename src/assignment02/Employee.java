package assignment02;


abstract class Employee {

    double salary = 10000;
    double incentive = 1000;
    double overtime = 2000;
    abstract double totalSalary();
}
class Manager1 extends Employee{

    double totalSalary() {
        return salary;
    }
}

class Labour extends  Employee{
    double totalSalary() {
        return salary;
    }
}






