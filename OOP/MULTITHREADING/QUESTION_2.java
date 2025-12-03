//3.Write a java program that will create one thread [using Runnable interface]. 
//The main thread will read a number and the newly created thread checks the 
//number is Armstrong number or not

import java.util.*;
import java.lang.*;

class Driver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();

        Arm obj = new Arm(num);     

        Thread t = new Thread(obj); 
        t.start();                  
    }
}

class Arm implements Runnable
{
    int number;

    Arm(int number)
    {
        this.number = number;
    }

    public void run()
    {
        int temp = number;
        int num = 0;
        int neww = 0;

        while(temp != 0)
        {
            num = temp % 10;
            neww += num * num * num;
            temp = temp / 10;
        }

        if(neww == number)
        {
            System.out.println("the number is an armstrong");
        }
        else
        {
            System.out.println("the number is not an armstrong");
        }
    }
}
