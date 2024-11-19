package com.Advanto;

import java.util.Scanner;

import com.Advanto.Implemented.TRPClass;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	TRPClass t=new TRPClass();
    	//t.insert_buses();
    	
    	boolean flag =true;
        while(flag) {
        	System.out.println("Select one of the below:");
        	System.out.println("1:Resiter new user:");
        	System.out.println("2:Search buses:");
        	System.out.println("3:Cancel your ticket:");
        	System.out.println("4:Update info from the ticket:");
        	System.out.println("5:Exit....");
        	int choice= sc.nextInt();
        	switch (choice) {
			case 1:t.login();
			break;
			
			case 2:t.showBuses();
			break;
			
			case 3:t.cancel();
			break;
			
			case 4:t.updateInfo();
			break;
			
			case 5:System.out.println("Thank you for your participation.......");
			flag=false;
			break;

			default:System.out.println("You are out of choice.........");
				break;
			}
        }
         
    }
}
