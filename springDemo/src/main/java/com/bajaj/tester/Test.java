package com.bajaj.tester;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bajaj.beans.Adress;
import com.bajaj.beans.Employee;
public class Test {  
    public static void main(String[] args) {  
    	@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("com/bajaj/resource/applicationContext.xml");
    	  
          Employee e=(Employee)context.getBean(Employee.class); 
         
       e.display();
          
    }  
}  