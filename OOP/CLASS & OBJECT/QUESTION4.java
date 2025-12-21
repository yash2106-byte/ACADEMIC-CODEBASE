//5.	Write a program to declare a class employee with data members empid, ename, dept, sal. Add a method getData(), putData() to accept and display the details of n employees. Define a driver class to create the objects of employee class and perform basic operations.

import java.util.*;

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();

            System.out.println("\nEnter details of employee " + (i + 1));

            System.out.print("Enter name: ");
            String ename = sc.nextLine();

            System.out.print("Enter ID: ");
            int empid = sc.nextInt();

            System.out.print("Enter salary: ");
            int sal = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter department: ");
            String dept = sc.nextLine();

            emp[i].getData(empid, sal, ename, dept);
        }

        System.out.println("\nEmployee Details");
        for (int i = 0; i < n; i++) {
            emp[i].putData();
        }
    }
}

class Employee {
    int empid, sal;
    String ename, dept;

    void getData(int empid, int sal, String ename, String dept) {
        this.empid = empid;
        this.sal = sal;
        this.ename = ename;
        this.dept = dept;
    }

    void putData() {
        System.out.println("Name       : " + ename);
        System.out.println("Employee ID: " + empid);
        System.out.println("Salary     : " + sal);
        System.out.println("Department : " + dept);
    }
}
