package com.vicky.HelloWorld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vicky.HelloWorld.POJO.Hello;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource rs = new ClassPathResource("resources/spring.xml");
        BeanFactory factory = new XmlBeanFactory(rs);
        Hello h1 = (Hello) factory.getBean("test");
        h1.greet("vicky");
    }
}
