//3. Write a program to create a class named Shape. 
// It should contain two methods, draw() and erase().  
// Create subclasses Circle, Triangle and Square that override draw() and erase().  
// Create objects of each subclass, assign them to Shape reference and call methods.

class Driver
{
    public static void main(String[] args)
    {
        Shape s;

        s = new Circle();
        s.draw();
        s.erase();

        s = new Triangle();
        s.draw();
        s.erase();

        s = new Square();
        s.draw();
        s.erase();
    }
}

class Shape
{
    void draw()
    {
        System.out.println("Drawing Shape");
    }
    void erase()
    {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
    void erase()
    {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Triangle");
    }
    void erase()
    {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape
{
    void draw()
    {
        System.out.println("Drawing Square");
    }
    void erase()
    {
        System.out.println("Erasing Square");
    }
}
