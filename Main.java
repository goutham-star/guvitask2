package guvitask2;


class Person2 {
    String name;
    int age;

  
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Employee extends Person2 {
    int employeeID;
    double salary;


    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);  
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonDetails();  
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
       
        Employee emp = new Employee("John", 25, 101, 50000.0);

      
        emp.displayEmployeeDetails();
    }
}

/*Output

Name: John
Age: 25
EmployeeID: 101
Salary: 50000.0
*/


