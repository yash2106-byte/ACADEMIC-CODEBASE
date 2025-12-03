//Write a java program that will create one thread [using extends]. The main thread will read a number and check the number is prime or composite and the same time the new thread will check the number palindrome or not.
import java.util.*;

class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Palindrome t = new Palindrome(num);
        t.start();  

        boolean isPrime = true;
        if (num <= 1) isPrime = false;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println("Main thread → Prime number");
        else
            System.out.println("Main thread → Composite number");
    }
}

class Palindrome extends Thread {

    int number;

    Palindrome(int number) {
        this.number = number;
    }

    public void run() {
        int temp = number, rev = 0;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (rev == number)
            System.out.println("Child thread → Palindrome");
        else
            System.out.println("Child thread → Not a palindrome");
    }
}
