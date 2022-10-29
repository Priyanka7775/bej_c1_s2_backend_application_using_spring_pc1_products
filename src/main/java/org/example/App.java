package org.example;

import org.example.configration.Config;
import org.example.users.Product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        Product p1=context.getBean("product1",Product.class);
        System.out.println(p1);

        Product p2=context.getBean("product2",Product.class);
        System.out.println(p2);

        Product p3=context.getBean("product3",Product.class);
        System.out.println(p3);

        Product p4=context.getBean("product4",Product.class);
        System.out.println(p4);



    }
}
