// 8. Design a class ‘ComplexNum’ to manipulate Complex numbers.
// It should have:
// - real and imaginary as data members
// - parameterized constructor
// - displayCompNumber()
// - addCompNumber()
// Test using another Driver class.

import java.util.*;

class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real part of 1st number:");
        int r1 = sc.nextInt();
        System.out.println("Enter imaginary part of 1st number:");
        int i1 = sc.nextInt();

        System.out.println("Enter real part of 2nd number:");
        int r2 = sc.nextInt();
        System.out.println("Enter imaginary part of 2nd number:");
        int i2 = sc.nextInt();

        ComplexNum c1 = new ComplexNum(r1, i1);
        ComplexNum c2 = new ComplexNum(r2, i2);

        System.out.print("First number: ");
        c1.displayCompNumber();

        System.out.print("Second number: ");
        c2.displayCompNumber();

        ComplexNum result = c1.addCompNumber(c2);

        System.out.print("Addition = ");
        result.displayCompNumber();
    }
}

class ComplexNum {

    int real, img;

    ComplexNum(int real, int img) {
        this.real = real;
        this.img = img;
    }

    void displayCompNumber() {
        System.out.println(real + "+" + img + "i");
    }

    ComplexNum addCompNumber(ComplexNum c) {
        int r = this.real + c.real;
        int i = this.img + c.img;
        return new ComplexNum(r, i);
    }
}
