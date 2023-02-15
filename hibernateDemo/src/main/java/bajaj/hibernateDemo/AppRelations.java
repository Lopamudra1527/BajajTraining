package bajaj.hibernateDemo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.*;
import org.hibernate.SessionFactory;

import com.hibernateDemo.util.HibernateUtil;
import com.hibernateRelations.model.Adress;
import com.hibernateRelations.model.AdressMTM;
import com.hibernateRelations.model.AdressType;
import com.hibernateRelations.model.EmployeeDetails;
import com.hibernateRelations.model.EmployeeDetailsMTM;
import com.hibernateRelations.model.EmployeeDetailsOneToMany;

public class AppRelations {

	public static void main(String[] args)
	{
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		
//One to One mapping
/*		Adress ad=new Adress();
		ad.setId(201);
		ad.setAdress("Odisha");
		
		
		EmployeeDetails ed=new EmployeeDetails();
		ed.setId(101);
		ed.setName("Lopa");
		ed.setAdress(ad);
		
		ad.setEdt(ed);
		
	    session.save(ad);
	    session.save(ed);
		
	  EmployeeDetails empdet=session.get(EmployeeDetails.class, 101);
	  System.out.println(empdet.getName());
	  System.out.println(empdet.getAdress().getAdress());
		
	  Adress adress=session.get(Adress.class, 201);
	  System.out.println(adress.getId());
	  System.out.println(adress.getEdt().getName());
	  
	    transaction.commit();*/
	   
//One to Many Mapping
	  AdressType at=new AdressType(101,"pune","Office");
		AdressType at1=new AdressType(102,"Blr","Home");
	    
		AdressType at3=new AdressType(103,"cbe","Office");
		AdressType at4=new AdressType(104,"odisha","Home");
	    
	    
	    List<AdressType> adlist=new ArrayList<AdressType>();
	    adlist.add(at);
	    adlist.add(at1);
	    
	    List<AdressType> adlist1=new ArrayList<AdressType>(); 
		adlist1.add(at4);
		adlist1.add(at3);
		
		EmployeeDetailsOneToMany ed= new EmployeeDetailsOneToMany();
		ed.setId(201);
		ed.setName("Lopaa");
		ed.setAdress(adlist);
		session.save(ed);
		
		EmployeeDetailsOneToMany ed1= new EmployeeDetailsOneToMany();
		ed1.setId(202);
		ed1.setName("Nandhu");
		ed1.setAdress(adlist1);
		session.save(ed);
		session.save(ed1);
		
		at.setEd(ed);
		at1.setEd(ed);
		at3.setEd(ed1);
		at4.setEd(ed1);
		
		session.save(at);
	    session.save(at1);
	    session.save(at3);
	    session.save(at4);
	    

//		EmployeeDetailsOneToMany ed11=session.get(EmployeeDetailsOneToMany.class, 201);
//		System.out.println("Name of the Employee "+ed11.getName());
//		for(AdressType at2:ed11.getAdress())
//		{
//			System.out.println("Adress: "+at2.getAdress()+" Adress Type of the Employee: "+at2.getAdressType());
//		}
//		
//		EmployeeDetailsOneToMany ed12=session.get(EmployeeDetailsOneToMany.class, 202);
//		System.out.println("Name of the Employee "+ed12.getName());
//		for(AdressType at2:ed12.getAdress())
//		{
//			System.out.println("Adress: "+at2.getAdress()+" Adress Type of the Employee: "+at2.getAdressType());
//			
//			
//		}
//		
//		AdressType adtype=session.get(AdressType.class, 101);
//		System.out.println("Name of the Employee: "+adtype.getEd().getName()+" Adress type: "+adtype.getAdressType());
		
	    
	    EmployeeDetailsOneToMany ed11=session.get(EmployeeDetailsOneToMany.class, 201);
	    session.delete(ed11);
	    transaction.commit(); 
		
//ManyToMany
		
	/*	AdressMTM  ad=new AdressMTM(1,"pune");
		AdressMTM ad1=new AdressMTM(2,"blr");
		
		List<AdressMTM> list1=new ArrayList<AdressMTM>();
		list1.add(ad);
		list1.add(ad1);
		
		EmployeeDetailsMTM e=new EmployeeDetailsMTM(101,"Lopaa");
		EmployeeDetailsMTM e1=new EmployeeDetailsMTM(102,"XXX");
		
		List<EmployeeDetailsMTM> list2=new ArrayList<EmployeeDetailsMTM>();
		list2.add(e);
		list2.add(e1);
		
		ad.setEmtm(list2);
		e.setAdmtm(list1);
		
		session.save(e);
		session.save(e1);
	
		session.save(ad);
		session.save(ad1);
		
		transaction.commit();
		session.close();
		factory.close();*/
	}

}
