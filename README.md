# java-course

``` java
System.out.println("Hello");
```

``` java
public class SwapNumbers {

    public static void main(String[] args) {

        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
```

``` java
        System.out.println("Output generated");
```

``` java
import java.lang.Math;   

public class RandomNumberExample1  
{   
    public static void main(String args[])   
    {   
    // Generating random numbers  
    System.out.println("1st Random Number: " + Math.random());   
    System.out.println("2nd Random Number: " + Math.random());  
    System.out.println("3rd Random Number: " + Math.random());   
    System.out.println("4th Random Number: " + Math.random());   
    }   
}
```
``` java
//First.java  
import java.applet.Applet;  
import java.awt.Graphics;  

public class First extends Applet{
    public void paint(Graphics g){  
        g.drawString("welcome",150,150);  
    }
} 
```
