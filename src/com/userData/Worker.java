/*
Сделать класс потомок
- У него будут доп поля(salary, сколько пользователь проработал)
- Методы (поднять ЗП -> если пользователь проработал до 2x лет тогда ЗП увеличивается на 5%,
если проработал 2 - 5 включительно лет то на 10% и более 5 лет на 15%)
 */


package com.userData;

public class Worker extends User {
    public double salary;
    public double workExp;

    public Worker(String firstName, String lastName, String email, String phone, String mobilePhone, String password, int salary, int workExp) {
        super(firstName, lastName, email, phone, mobilePhone, password);
        this.salary = salary;
        this.workExp = workExp;
    }

    public Worker(String email, String password, int salary, int workExp) {
        super(email, password);
        this.salary = salary;
        this.workExp = workExp;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkExp() {
        return this.workExp;
    }

    public void setWorkExp(double workExp) {
        this.workExp = workExp;
    }

    public void increaseSalary() {
        System.out.printf("%s %s worked %s years, salary before review was: %f\n", this.firstName, this.lastName, this.workExp, this.salary);
        if (this.workExp < 2) {
            this.salary += this.salary * 0.05;
            System.out.printf("%s %s worked %s years, salary after review is: %f\n", this.firstName, this.lastName, this.workExp, this.salary);
        } else if (this.workExp >= 2 && this.workExp <= 5) {
            this.salary += this.salary * 0.1;
            System.out.printf("%s %s worked %s years, salary after review is: %f\n", this.firstName, this.lastName, this.workExp, this.salary);
        } else if (this.workExp >= 5) {
            this.salary += this.salary * 0.15;
            System.out.printf("%s %s worked %s years, salary after review is: %f\n", this.firstName, this.lastName, this.workExp, this.salary);
        }
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.printf("Salary: %s Work experience: %s\n", this.salary, this.workExp);
    }
}
