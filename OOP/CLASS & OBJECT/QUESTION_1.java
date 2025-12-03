//1.	Write a program to print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average. Define another driver class to demonstrate the basic operation.
import java.util.*;
import java.lang.*;
class Driver
{
    public static void main(String[] args)
    {
        Average a = new Average();
        a.input();
        a.cal();
        a.print();
    }
}
class Average
{
    int n1,n2,n3;
    Scanner sc = new Scanner(System.in);
    void input()
    {
    System.out.print("enter three numbers");
    n1=sc.nextInt();
    n2=sc.nextInt();
    n3=sc.nextInt();
    }
    float avg;
    void cal()
    {
        avg=(n1+n2+n3)/3;
    }
    void print()
    {
        System.out.println("The avg of three numbers are"+avg);
    }
}
