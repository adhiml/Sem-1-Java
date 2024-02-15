/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;




public class L10Q1 {
    public static void main (String [] args) {
        
        Employee [] e = new Employee [3];
        
        e[0] = new Permanent("Employee A", 'A');
        e[1] = new Contract("Employee B", 2500);
        e[2] = new Temporary ("Employee C", 67);
        
        for (int i = 0; i < 3; i++) {
            e[i].display();
            System.out.println("");
        }
    }
}

abstract class Employee {
    
    // protected = permits access inside the same package and by subclasse
    
    protected String name;
    protected String type;
    protected double salary;
    
    Employee (String name, String type) {
        
        this.name = name;
        this.type = type;
    }
    
    public void display () {
        System.out.printf("Name: %s \nEmployee Category: %s \nTotal Salary: RM%.2f\n", this.name,this.type, this.salary);
    }
}

class Permanent extends Employee {
    
    private char category;
    
    Permanent (String name, char category) {
        
        super(name, "Permanent");
        this.category = category;
        this.setSalary();
    }
    
    public void setSalary () {
        
        switch (this.category) {
            case 'A' -> this.salary = 4000;
            case 'B' -> this.salary = 3000;
            case 'C' -> this.salary = 2000;
        }
    }
}

class Contract extends Employee {
    
    private final int Income = 500;
    private double totalSales;
    
    Contract (String name, double totalSales) {
        
        // cannot use this.name because name is not initialize in the subclass
        
        super(name, "Contract");
        this.totalSales = totalSales;
        this.setSalary();
    }
    
    public void setSalary () {
        
        // this.salary = 500 + totalSales * 0.5 also can
        
        this.salary = Income + totalSales * 0.5;
    }
}

class Temporary extends Employee {
    
    private double hoursWork;
    private int payRate = 15;
    
    Temporary (String name, double hoursWork) {
        
        super(name, "Contract");
        this.hoursWork = hoursWork;
        this.setSalary();
    }
    
    public void setSalary () {
        this.salary = this.hoursWork * payRate;
    }
}

