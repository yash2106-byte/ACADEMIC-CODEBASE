//Write a java program that will create one child thread. The child thread has to display all odd numbers between m and n, and the main thread will display all the even numbers between m and n.
import java.util.*;

class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range (m n): ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("Even numbers:");
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {  
                System.out.print(" " + i);
            }
        }

        Odd obj = new Odd(m, n);
        Thread t = new Thread(obj);  
        t.start();
    }
}

class Odd implements Runnable {
    int m, n;

    Odd(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public void run() {
        System.out.println("\nOdd numbers:");
        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {  
                System.out.print(" " + i);
            }
        }
    }
}
