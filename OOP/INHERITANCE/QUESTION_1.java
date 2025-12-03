// Write a program that creates a class Account that have members customer name, account number. 
// Account has constructor to initialize its members and method display() to show the result. 
// Create a child class Savings_Account that is derived from Account class. 
// Savings_Account have members min_bal and saving_bal. Use show() to display its details. 
// Then create another child class Account_details from Savings_Account class have members 
// deposit, withdrawl and a method show1() to show its details. 
// Child classes have constructors of their own. 
// Create a driver class that creates a record of customer and display all its details.

import java.util.*;
import java.lang.*;

class Driver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name;
        int acc, min, saving, depo, with;

        System.out.println("enter the name ");
        name = sc.nextLine();

        System.out.println("enter the accountnumber");
        acc = sc.nextInt();

        System.out.println("enter minimum balance ");
        min = sc.nextInt();

        System.out.println("enter present balance ");
        saving = sc.nextInt();

        System.out.println("enter amount you want to depo ");
        depo = sc.nextInt();

        System.out.println("enter the amount you want to withdr ");
        with = sc.nextInt();

        Details ac = new Details(name, acc, min, saving, depo, with);
        ac.show1();
    }
}

class Account
{
    String name;
    int acc;

    Account(String name, int acc)
    {
        this.name = name;
        this.acc = acc;
    }

    void display()
    {
        System.out.println("the name of the customer is " + name);
        System.out.println("the account number is " + acc);
    }
}

class Saving extends Account
{
    int min, saving;

    Saving(String name, int acc, int min, int saving)
    {
        super(name, acc);
        this.min = min;
        this.saving = saving;
    }

    void show()
    {
        display();
        System.out.println("min balance required for this " + min);
        System.out.println("present balance " + saving);
    }
}

class Details extends Saving
{
    int depo, with;

    Details(String name, int acc, int min, int saving, int depo, int with)
    {
        super(name, acc, min, saving);
        this.depo = depo;
        this.with = with;
    }

    void show1()
    {
        show();
        System.out.println("amount you want to depo " + depo);

        if ((saving + depo) - with > min)
        {
            System.out.println("amount withdrawn successfully " + with);
        }
        else
        {
            System.out.println("min bal should be maintained");
        }
    }
}

