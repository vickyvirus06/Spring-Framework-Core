package com.vicky.AnnotationSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vicky.AnnotationSetter.Configuration.AppConfig;
import com.vicky.AnnotationSetter.POJO.Registration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext application = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Registration reg = (Registration)application.getBean("registrationBean");
        System.out.println(reg);
    }
}
