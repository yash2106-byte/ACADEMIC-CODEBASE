//1.Create a abstract class Bank that has abstract method getROI(). 
//Create two classes SBI, PNB, BOI inherited from Bank. 
//Create a driver class that prints the rate of interest of each bank 
//using super class memory reference. 

class Driver
{
    public static void main(String[] args)
    {
        bank b;

        b = new SBI();
        System.out.println("the roi of sbi is " + b.ROI());

        b = new ICICI();
        System.out.println("the roi of icici is " + b.ROI());

        b = new BOI();
        System.out.println("the roi of boi is " + b.ROI());
    }
}

abstract class bank
{
    abstract int ROI();
}

class SBI extends bank
{
    int ROI()
    {
        return 6;
    }
}

class ICICI extends bank
{
    int ROI()
    {
        return 7;
    }
}

class BOI extends bank
{
    int ROI()
    {
        return 8;
    }
}
