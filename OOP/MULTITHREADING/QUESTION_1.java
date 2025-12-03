//1.Write a java program that will create the reference of the thread and 
//display the details of the reference thread. 
//(It should display class, name of thread, priority, group name)
import java.util.*;
import java.lang.*;

class Multi
{
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();   

        System.out.println("Class of thread : " + t.getClass());
        System.out.println("Thread name before changing : " + t.getName());
        System.out.println("Priority of thread : " + t.getPriority());
        System.out.println("Thread group name : " + t.getThreadGroup().getName());
        t.setName("MY");
        System.out.println("Thread name after changing : " + t.getName());
    }
}
