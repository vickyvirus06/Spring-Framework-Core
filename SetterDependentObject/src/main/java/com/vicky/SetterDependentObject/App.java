package com.vicky.SetterDependentObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vicky.SetterDependentObject.POJO.Mobile;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext application = new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");
       Mobile android = (Mobile) application.getBean("mobileobj");
       System.out.println(android);
    }
}
