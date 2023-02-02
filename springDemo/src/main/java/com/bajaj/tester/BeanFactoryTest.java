package com.bajaj.tester;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource; 

import com.bajaj.beans.Employee;
public class BeanFactoryTest {  
    public static void main(String[] args) { 
    	Resource r=new ClassPathResource("com/bajaj/resource/applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);           
        Employee e=(Employee)factory.getBean("obj");  
        e.display();            
    }  
}  