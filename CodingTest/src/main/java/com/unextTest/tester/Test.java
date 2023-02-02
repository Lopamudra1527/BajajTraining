package com.unextTest.tester;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.unextTest.beans.Referal;
import com.unextTest.beans.User;
import com.unextTest.service.ManageReferal;
import com.unextTest.service.ManageUser;
public class Test {

	public static void main(String[] args) {
        ManageUser m=new ManageUser();
        ManageReferal mr=new ManageReferal();
        @SuppressWarnings("resource")
	   ApplicationContext context= new ClassPathXmlApplicationContext("com/unextTest/resource/appContext.xml");
       User user=(User)context.getBean("obj"); 
       User user1=(User)context.getBean("obj1"); 
       Referal referal= (Referal)context.getBean("refObj");
        
        Scanner input = new Scanner(System.in);
        int option = 0;
        m.addUser(user);
        m.addUser(user1);
        mr.addReferal(referal);
        menuUser();
        	do {
            
            option = input.nextInt();
            
            switch (option) {
            case 1:   
            	    System.out.print("What is the User Id ? ");
                    int userId= input.nextInt();
            	    System.out.print("What is the User Name ? ");
            	    String name = input.nextLine();
                    input.next();
                    System.out.print("What is the User phone number? ");
                    int number= input.nextInt();
                    User us=new User(userId,name,number);
                if (!m.findUser(us.getId())) {
                 m.userList.add(us);
               }
                else {
                    System.out.println(
                        "User already exists in the User list");
               }
                menuUser();
                break;
            case 2:                
                int rId = 01;
                m.deleteUser(rId);
                menuUser();
                break;
                
            case 3:
                m.display();
                menuUser();
                break;
            case 4:
 
                int rIdNo = 01;
                m.updateUser(rIdNo, input);
                menuUser();
                break;
            case 5:
                System.out.print(
                    "What is the user id ? ");
                int id = input.nextInt();
 
                if (!m.findUser(id)) {
                    System.out.println(
                        "User id does not exist\n");
                }
                menuUser();
                break;
            case 6:
            	    System.out.print("What is the Referal Name ? ");
            	    String name1 = input.nextLine();
                    input.next();
                    System.out.print("What is the User Id ? ");
                    int userId1= input.nextInt();
                    System.out.print("What is the referal id? ");
                    int rId1= input.nextInt();
                    Referal re=new Referal(rId1,name1,userId1);
            	if (!mr.findReferal(re.getReferalId())) {
                    mr.referalList.add(re);
                  }
                   else {
                       System.out.println(
                           "Referal already exists in the Referal list");
                  }
            	menuUser();

                   break;
            case 7:
            	 int rId2 = 100;
                 mr.deleteReferal(rId2);
                 menuUser();
                 break;
            case 8:
            	mr.display();
            	menuUser();
                break;
            case 9:

                int rIdNo1 = 100;
                mr.updateReferal(rIdNo1, input); 
                menuUser();
                break;
            case 10:
            	 System.out.print(
                         "What is the referal id ? ");
                     int id1 = input.nextInt();
      
                     if (!mr.findReferal(id1)) {
                         System.out.println(
                             "referal id does not exist\n");
                     }
                     menuUser();
                     break;
            case 11:
            	 System.out.print(
                         "What is the referal id ? ");
                     int id11 = input.nextInt();
                     System.out.println(m.findUserByReferalId(id11));
                     menuUser();
      
                     break;
            default:
                System.out.println("\nEnter correct option :\n");
                menuUser();
                break;
            }
        }
        while (option != 0);
        	
     
	}
	
	public static void menuUser()
    {
        System.out.println("MENU");
        System.out.println("1: Add User");
        System.out.println("2: Delete User");
        System.out.println("3: Display User");
        System.out.println("4: Update User");
        System.out.println("5: Find User");
        System.out.println("6: Add Referal");
        System.out.println("7: Delete Referal");
        System.out.println("8: Display Referal");
        System.out.println("9: Update Referal");
        System.out.println("10: Find Referal");
        System.out.println("11: Find User data");
        System.out.println("0: Exit program");
        
        System.out.print("Enter your selection : ");
    }
	
}
