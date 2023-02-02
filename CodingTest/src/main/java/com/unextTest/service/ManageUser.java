package com.unextTest.service;

import java.util.LinkedList;
import java.util.Scanner;

import com.unextTest.beans.Referal;
import com.unextTest.beans.User;

public class ManageUser {
    public LinkedList<User> userList;
    ManageReferal mr=new ManageReferal();
    
    public ManageUser()
    {
    	userList=new LinkedList<User>();
    }
    
    public void addUser(User user)
    {
    	if (!findUser(user.getId())) {
            userList.add(user);
        }
        else {
            System.out.println("User already exists");
        }
    }
    public User findUserByReferalId(int id)
    {
    	int p=0;
    	
       for(Referal ref: mr.referalList)
       {
    	   if(ref.getReferalId()==id)
    	   {
    		   p=ref.getUserId();
    	   }
       }
       System.out.println(p);
       for (User user1: userList) {
           if (user1.getId() == p) { 
               System.out.println(user1);
               
           }
       }
       return null;
    	
    }
    public boolean findUser(int id)
    {
    	for (User l : userList) {
            if (l.getId() == id) { 
                System.out.println(l);
                return true;
            }
        }
        return false;
    }	
    
    public void deleteUser(int id)
    {
    	User userDel = null;
        for (User ll : userList) {
            if (ll.getId() == id) {
                userDel = ll;
            }
        }
        if (userDel == null) {
            System.out.println("No record Exists");
        }
        else {
 
            userList.remove(userDel);
            System.out.println("Successfully removed");
        }
    }
    
    public User findUserRecord(int id)
    {
        for (User l : userList) {
            if (l.getId() == id) {
                return l;
            }
        }
 
        return null;
    }
    
    public void updateUser(int id, Scanner input)
    {
 
        if (findUser(id)) {
            User rec = findUserRecord(id);
            System.out.print("Enter updated id");
            int idNumber = input.nextInt();
 
            System.out.print("Enter Updated contact number");
            int contactNumber = input.nextInt();
            input.nextLine();
            System.out.print("Enter updated name");
            String name = input.nextLine();
 
            rec.setId(idNumber);
            rec.setName(name);
            rec.setNumber(contactNumber);
            System.out.println(
                "Updated");
        }
        else {
            System.out.println(
                "Record Not Found in the list");
        }
    }
    
    public void display()
    {
    	if(userList.isEmpty())
    	{
    		System.out.println("No users available");
    	}
    	else
    	{
    		for(User u:userList)
    		{
    			System.out.println(u);
    		}
    	}
    }
    
}
