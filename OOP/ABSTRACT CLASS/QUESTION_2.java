//3.Create an abstract class 'Shape' with three abstract methods.
//RectangleArea(len, bre), SquareArea(side), CircleArea(rad)
//Create a class 'Area' that implements all methods and print area.

class Driver
{
    public static void main(String[] args)
    {
        Shape s;
        s = new Area();

        System.out.println("Area of Rectangle = " + s.RectangleArea(10, 20));
        System.out.println("Area of Square = " + s.SquareArea(5));
        System.out.println("Area of Circle = " + s.CircleArea(7));
    }
}

abstract class Shape
{
    abstract float RectangleArea(int len, int bre);
    abstract float SquareArea(int side);
    abstract float CircleArea(int rad);
}

class Area extends Shape
{
    float RectangleArea(int len, int bre)
    {
        return len * bre;
    }

    float SquareArea(int side)
    {
        return side * side;
    }

    float CircleArea(int rad)
    {
        return 3.14f * rad * rad;
    }
}
