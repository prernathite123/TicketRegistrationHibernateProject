package com.Advanto.Implemented;


import java.time.LocalDate;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Advanto.Configuration.Connection;
import com.Advanto.Entity.Buses;
import com.Advanto.Entity.RegisterdUsers;
import com.Advanto.Entity.User;
import com.Advanto.Unimplemented.TRPInterface;

public class TRPClass implements TRPInterface{

	Scanner sc=new Scanner(System.in);
	SessionFactory sf=Connection.connect();
	@Override
	public void login() {
		
		System.out.println("Enter your name:");
		String n=sc.next();
		
		System.out.println("Enter your contact details");
		long c=sc.nextLong();
		
		System.out.println("Enter Mail id");
		String e=sc.next();
		
		System.out.println("Enter Password");
		String p=sc.next();
		
		User user1=new User();
		user1.setId(1);
		user1.setUname(n);
		user1.setConNo(c);
		user1.setEmail(e);
		user1.setPassward(p);
		
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(user1);
		
		System.out.println("you have beeen registerd successfully.....");
		tx.commit();
		session.close();
		sf.close();
		
	}

	@Override
	public void showBuses() {
		
		Session session =sf.openSession();
		Criteria c1=session.createCriteria(Buses.class);
		List<Buses> l1=c1.list();
		for(Buses res:l1) {
			System.out.println(res);
		}
		
		System.out.println("Are you want to resevrved ticket:true/false");
		boolean option=sc.nextBoolean();
		
		if(option) {
			bookBus();
		}else {
			System.out.println("Thank you for co-operation!!");
		}
		
		session.close();
		sf.close();
	}
	
	public void bookBus() {
		System.out.println("Enter your bus choice:");
		int choice =sc.nextInt();
		System.out.println("Enter your adhar no:");
		int aadhar=sc.nextInt();
		
		System.out.println("Enter your name:");
		String n=sc.next();
		
		System.out.println("enter your age:");
		int a=sc.nextInt();
		
		System.out.println("Boarding point:");
		String b=sc.next();
		
		System.out.println("destination point:");
		String d=sc.next();
		
		System.out.println("Enter Date of Departure:");
		System.out.println("Enter year:");
		int y=sc.nextInt();
		//y=y-1900;
		
		System.out.println("Enter month:");
		int m=sc.nextInt();
		
		System.out.println("Enter date:");
		int d1=sc.nextInt();
		
		
		
		LocalDate date=LocalDate.of(y,m,d1);
		
		System.out.println("Payment status:True/false");
		boolean status=sc.nextBoolean();
		
		
		
		
		RegisterdUsers ru=new RegisterdUsers(aadhar,n,a,b,d,date,status);
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(ru);
		
		RegisterdUsers ticket=session.get(RegisterdUsers.class, aadhar);
		System.out.println("this is your tichet info:");
		System.out.println(ticket.getName());
		System.out.println(ticket.getAge());
		System.out.println(ticket.getBordingpoint());
		System.out.println(ticket.getDestinationpoint());
		System.out.println(ticket.getAdharNo());
		System.out.println(ticket.getDdateofDeparture());
		
		System.out.println("thank you!!!");
		tx.commit();
		session.close();
		sf.close();
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("if you want to cancel the ticket then Enter your adhar no:");
		int aadhar=sc.nextInt();
		RegisterdUsers ticket=session.get(RegisterdUsers.class,aadhar);
		session.delete(ticket);
		System.out.println("your ticket cancel successfully...");
		tx.commit();
		session.close();
		sf.close();
	}

	@Override
	public User updateInfo() {
	    System.out.println("Enter info for updation");
	    System.out.println("Enter your Aadhaar number:");
	    int a = sc.nextInt();

	    Session session = sf.openSession();
	    RegisterdUsers users = session.get(RegisterdUsers.class, a);
//	    if (users == null) {
//	        System.out.println("User not found!");
//	        session.close();
//	        return null;
//	    }

	    
	    boolean flag = true;

	    while (flag) {
	        System.out.println("1] Update your name");
	        System.out.println("2] Update your age");
	        System.out.println("3] Update your date of departure");
	        System.out.println("4] Update your boarding");
	        System.out.println("5] Update your destination");
	        System.out.println("6] Log out");

	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	            	Transaction tx = session.beginTransaction();
	                System.out.println("Enter your name:");
	                String name = sc.next();
	                users.setName(name);
	                session.update(users); 
	        	    tx.commit();
	                break;

	            case 2:
	            	Transaction tx1 = session.beginTransaction();
	                System.out.println("Enter your age:");
	                int age = sc.nextInt();
	                users.setAge(age);
	                session.update(users); 
	        	    tx1.commit();
	                break;

	            case 3:
	            	Transaction tx2 = session.beginTransaction();
	                System.out.println("Enter year:");
	                int year = sc.nextInt();
	                System.out.println("Enter month:");
	                int month = sc.nextInt();
	                System.out.println("Enter day:");
	                int day = sc.nextInt();
	                LocalDate date = LocalDate.of(year, month, day);
	                users.setDdateofDeparture(date);
	                session.update(users); 
	        	    tx2.commit();
	                break;

	            case 4:
	            	Transaction tx3 = session.beginTransaction();
	                System.out.println("Enter your boarding location:");
	                String boarding = sc.next();
	                users.setBordingpoint(boarding);
	                session.update(users); 
	        	    tx3.commit();
	                break;

	            case 5:
	            	Transaction tx4 = session.beginTransaction();
	                System.out.println("Enter your destination:");
	                String destination = sc.next();
	                users.setDestinationpoint(destination);
	                session.update(users); 
	        	    tx4.commit();
	                break;

	            case 6:
	                flag = false;
	                break;

	            default:
	                System.out.println("Invalid choice!");
	                break;
	        }
	    }

	    
	    session.close();
	    return null;
	}

	
	public void insert_buses() {
		Buses bus1=new Buses(1,"Shivai","MH09 8675","Seatter");
		Buses bus2=new Buses(1,"Shivshai","MH14 8905","Seatter");
		Buses bus3=new Buses(1,"Hirkani","MH34 8689","Seatter/sleeper");
		Buses bus4=new Buses(1,"YashRaj","MH17 8675","Seatter");
		Buses bus5=new Buses(1,"RedBus","MH25 8698","Seatter/slepper");
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(bus1);
		session.save(bus2);
		session.save(bus3);
		session.save(bus4);
		session.save(bus5);
		
		tx.commit();
		session.close();
		sf.close();
	
		
		
		
	}
	

	
}
