package com.vicky.AnnotationQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vicky.AnnotationQualifier.Config.AppConfig;
import com.vicky.AnnotationQualifier.POJO.Shop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext application = new AnnotationConfigApplicationContext(AppConfig.class);
        Shop shop = (Shop)application.getBean("shop");
        shop.shop();
        
    }
}
