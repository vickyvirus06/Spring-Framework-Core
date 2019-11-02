package com.vicky.DIDependentObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vicky.DIDependentObject.POJO.Mobile;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext application = new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");
       System.out.println("\n---------------Android Mobile----------");
       Mobile android = (Mobile)application.getBean("mobileobj");
       
       System.out.println(android);
       
       System.out.println("\n\n----------Apple Mobile-------------");
       
       Mobile apple=(Mobile)application.getBean("mobileobj1");
       
       System.out.println(apple);
    }
}
