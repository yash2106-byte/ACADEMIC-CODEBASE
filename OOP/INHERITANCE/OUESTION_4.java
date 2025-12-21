//Create a class Figure with instance members dim1 and dim2. Use constructor and area() that returns the area of figure. Create a derived class Rectangle derived from Figure and area() that returns the area of rectangle. Create another derived class Triangle and Square that has area() which returns area of Triangle and Square respectively. Derived class have appropriate constructor. Using method overriding concept test the functionalities of derived class by creating objects and super class memory references in Driver class.
class Driver {
    public static void main(String[] args) {

        Figure f;

        f = new Rectangle(10, 20);
        System.out.println("Area of Rectangle: " + f.area());

        f = new Triangle(10, 20);
        System.out.println("Area of Triangle: " + f.area());

        f = new Square(10);
        System.out.println("Area of Square: " + f.area());
    }
}

class Figure {
    int dim1, dim2;

    Figure(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    int area() {
        return 0; 
    }
}


class Rectangle extends Figure {

    Rectangle(int l, int b) {
        super(l, b);
    }

    
    int area() {
        return dim1 * dim2;
    }
}


class Triangle extends Figure {

    Triangle(int b, int h) {
        super(b, h);
    }

 
    int area() {
        return (dim1 * dim2) / 2;
    }
}
class Square extends Figure {

    Square(int side) {
        super(side, side);
    }
    int area() {
        return dim1 * dim2;
    }
}
