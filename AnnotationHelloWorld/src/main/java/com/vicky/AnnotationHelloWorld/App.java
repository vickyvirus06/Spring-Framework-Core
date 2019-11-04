package com.vicky.AnnotationHelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vicky.AnnotationHelloWorld.POJO.Hello;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan(basePackages="com.vicky.AnnotationelloWorld.POJO")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext application = new AnnotationConfigApplicationContext(App.class);
        Hello h = (Hello)application.getBean("helloobj");
        h.show();
    }
}
