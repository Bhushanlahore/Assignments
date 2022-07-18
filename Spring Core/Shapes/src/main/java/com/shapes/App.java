package com.shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        
        Circle c = (Circle) context.getBean("c1");
        System.out.println("CIRCLE:- ");
        System.out.println("Area of circle: "+c.area());
        System.out.println("circumference of circle: "+c.side());
        System.out.println("===================================");
        
        Rectangle r = (Rectangle) context.getBean("r1");
        System.out.println("RECTANGLE:- ");
        System.out.println("Area of Rectangle: "+r.area());
        System.out.println("Perimeter of Rectangle: "+r.side());
        System.out.println("===================================");
        
        Square s = (Square) context.getBean("s1");
        System.out.println("SQUARE:- ");
        System.out.println("Area of Square: "+s.area());
        System.out.println("Perimeter of Square: "+s.side());
    }
}
