//2.	Write a program to create a class named 'Student' with members 'name', 'roll_no', ‘branch’. Declare two methods to input the student details and display the details of the student. Create a driver class to test the functionalities of the above class.
import java.util.*;
import java.lang.*;
class Driver
{
    public static void main(String[] args)
    {
        Student st = new Student();
        st.input();
        st.display();
    }
}
class Student
{
    int roll_no;
    String name,branch;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.print("enter the name of the student ");
        name=sc.nextLine();
        System.out.print("enter the branch of the student ");
        branch=sc.nextLine();
        System.out.print("enter the roll no of the student ");
        roll_no=sc.nextInt();
    }
    void display()
    {
        System.out.println("name of the student = "+name);
        System.out.println(" branch of the student = "+branch);
        System.out.println("roll_no of the student = "+roll_no);
    }
}
