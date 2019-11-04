package com.vicky.BeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vicky.BeanAnnotation.Config.Config;
import com.vicky.BeanAnnotation.POJO.Mobile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext application = new AnnotationConfigApplicationContext(Config.class);
       Mobile mobile = (Mobile)application.getBean("mobileBean");
       mobile.show();
    }
}
