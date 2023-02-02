package com.unextTest.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.unextTest.beans.Referal;
import com.unextTest.beans.User;

public class ManageReferal {
    public LinkedList<Referal> referalList;
    
    
    public ManageReferal()
    {
    	referalList=new LinkedList<Referal>();
    }
    
    public void addReferal(Referal referal)
    {
    	if (!findReferal(referal.getReferalId())) {
            referalList.add(referal);
        }
        else {
            System.out.println("User already exists");
        }
    }
    
    public boolean findReferal(int id)
    {
    	for (Referal l : referalList) {
            if (l.getReferalId() == id) { 
                System.out.println(l);
                return true;
            }
        }
        return false;
    }	
    
    public void deleteReferal(int id)
    {
    	Referal referalDel = null;
        for (Referal ll : referalList) {
            if (ll.getReferalId() == id) {
                referalDel = ll;
            }
        }
        if (referalDel == null) {
            System.out.println("No record Exists");
        }
        else {
 
            referalList.remove(referalDel);
            System.out.println("Successfully removed");
        }
    }
    
    public Referal findReferalRecord(int id)
    {
        for (Referal l : referalList) {
            if (l.getReferalId() == id) {
                return l;
            }
        }
 
        return null;
    }
//    public User findUserByUserId(int id)
//    {
//    	
//    	for (User l : mu.userList) {
//            if (l.getId() == id) {
//                return l;
//            }
//        }
//		return null;
//    	
//    }
    public void updateReferal(int id, Scanner input)
    {
 
        if (findReferal(id)) {
            Referal rec = findReferalRecord(id);
            System.out.print("Enter updated id");
            int idNumber = input.nextInt();
 
            
            System.out.print("Enter updated referal ame");
            String name = input.nextLine();
 
            rec.setReferalId(id);
            rec.setReferalName(name);
            System.out.println(
                "Updated");
        }
        else {
            System.out.println(
                "Referal Not Found in the list");
        }
    }
    
    public void display()
    {
    	if(referalList.isEmpty())
    	{
    		System.out.println("No referals available");
    	}
    	else
    	{
    		for(Referal r:referalList)
    		{
    			System.out.println(r);
    		}
    	}
    }
    
}