package com.hibernateDemo.util;


//HibernateUtil - This is the helper class to bootstrap hibernate SessionFactory. In most Hibernate applications, the SessionFactory should be instantiated once during application initialization. The single instance should then be used by all code in a particular process, and any Session should be created using this single SessionFactory. The SessionFactory is thread-safe and can be shared; a Session is a single-threaded object.

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hibernateDemo.entity.Demo;
import com.hibernateDemo.entity.Employee;
import com.hibernateRelations.model.Adress;
import com.hibernateRelations.model.AdressMTM;
import com.hibernateRelations.model.AdressType;
import com.hibernateRelations.model.EmployeeDetails;
import com.hibernateRelations.model.EmployeeDetailsMTM;
import com.hibernateRelations.model.EmployeeDetailsOneToMany;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory()
    {
    	if(sessionFactory==null)
    	{
    		Configuration configuration=new Configuration();
    		Properties properties=new Properties();
    		properties.put(Environment.DRIVER, "org.postgresql.Driver");
    		properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/Test");
    		properties.put(Environment.USER, "postgres");
    		properties.put(Environment.PASS, "Finserv@2023");
    		properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
    	    properties.put(Environment.HBM2DDL_AUTO, "create");
    	    properties.put(Environment.SHOW_SQL, true);
    	    
    	    configuration.setProperties(properties);
          // configuration.addAnnotatedClass(Demo.class);
           // configuration.addAnnotatedClass(Employee.class);
    	    
    	  //  configuration.addAnnotatedClass(EmployeeDetails.class);
    	    //configuration.addAnnotatedClass(Adress.class);
    	    
    	    configuration.addAnnotatedClass(AdressType.class);
    	    configuration.addAnnotatedClass(EmployeeDetailsOneToMany.class);    	
    	    
    	   // configuration.addAnnotatedClass(AdressMTM.class);
    	    //configuration.addAnnotatedClass(EmployeeDetailsMTM.class);    	    
    	    //    	    ServiceRegistry holds the services that Hibernate will need during bootstrapping and at runtime.
    	    ServiceRegistry serviceregistry= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
    	    sessionFactory=configuration.buildSessionFactory(serviceregistry);
    	}
		return sessionFactory;
    	
    }
}
