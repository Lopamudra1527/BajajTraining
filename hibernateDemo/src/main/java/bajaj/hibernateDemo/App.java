package bajaj.hibernateDemo;







import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.*;


import com.hibernateDemo.entity.Demo;
import com.hibernateDemo.entity.Employee;
import com.hibernateDemo.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println( "Hello World!" );
       
       Demo demo=new Demo();
       demo.setId(1);
       demo.setName("Lopa");
       demo.setSalary(100000);
       
       
/*        It activate Hibernate Framework*/
 //      Configuration cfg=new Configuration();
  /*      It read both cfg file and mapping files.
        if you haven't followed the name pattern of hibernate config file, mention it in cfg.configure();
        It checks whether the config file is syntactically correct or not.  */      
//        cfg.configure();
        
//        method gathers the meta-data which is in the cfg Object. 
//        From cfg object it takes the JDBC information and create a JDBC Connection.
       
        SessionFactory factory=HibernateUtil.getSessionFactory();
//        Session object is used to perform CRUD operations.
        Session session=factory.openSession();
        
        
        
//        //To create
//        session.save(demo);
//        transaction.commit();
//        
//        //To read
//        Query query = session.createQuery("from Demo");
//        List demo5 = query.list();
//        for(Demo demos : demo5)
//        {
//      System.out.println();
//        }
////        
//        //To retrieve - get()
//        Demo demo1=session.get(Demo.class, 1);
//        System.out.println(demo1.getName());
//        
////        To get by id
//        Demo demo6=session.byId(Demo.class).getReference(1);
//        System.out.println(demo6.getSalary());
//        
//        
//        //To update
//        Demo demo3=session.get(Demo.class, 1);
//        demo3.setId(2);
//        session.save(demo3);        
//        System.out.println(demo3.getId()+" "+demo3.getName()+" "+demo3.getSalary());
//      
//        //To retrieve - load()
//      Demo demo2=session.load(Demo.class, 1);
//      System.out.println(demo2.getName());
//      
//        
//        //To delete
//        Demo demo4=session.get(Demo.class, 1);
//        session.remove(demo4);
//        transaction.commit();
//        
        
        Employee employee=new Employee();
        employee.setId(1);
        employee.setEmail("sriya@gmail.com");
        employee.setName("priya");
        employee.setSalary(100000.00);
        employee.setJoiningDate(new Date());
        employee.setStatus(true);
        
        Employee employee1=new Employee();
        employee1.setId(2);
        employee1.setEmail("lopa@gmail.com");
        employee1.setName("lopa");
        employee1.setSalary(560000.00);
        employee1.setJoiningDate(new Date());
        employee1.setStatus(true);
        
        Employee employee2=new Employee();
        employee2.setId(3);
        employee2.setEmail("xxx@gmail.com");
        employee2.setName("xxx");
        employee2.setSalary(123400.00);
        employee2.setJoiningDate(new Date());
        employee2.setStatus(true);
       
        
        Transaction transaction=session.beginTransaction(); 
        
        session.save(employee);
        session.save(employee1);
        session.save(employee2);
        
        List<Employee> list=session.createQuery("from Employee",Employee.class).list();
        for(Employee e: list)
        	{System.out.println(e);}
        
        Employee employee3 =session.get(Employee.class, 3);
        session.delete(employee3);
        
        transaction.commit();
        
        session.close();
    }
}
