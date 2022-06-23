package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerApp {
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args)  {
		System.out.println("enter the number of customers");
		int n = sc.nextInt();
		List<Customer> customers= new ArrayList<>(n);
		for(int i=0; i<n; i++) {
			System.out.println("enter customer"+(i+1)+"details");
			System.out.println("enter id:");
			int id=sc.nextInt();
			System.out.println("enter name:");
			String name=sc.next();
			System.out.println("enter purchaseAmount:");
			int amount=sc.nextInt();
			Customer c= new Customer(id,name,amount);
			customers.add(c);
			
		}
		boolean exit=true;
		while(exit) {
			System.out.println("1.Print Customers");
			System.out.println("2.Update Customers purchase amount");
			System.out.println("3.Exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				for(Customer customer:customers) {
					System.out.println(customer);
				}
				break;
			case 2:
				System.out.println("enter the customer id to be upadated");
				int id1=sc.nextInt();
				int flag=0;
				System.out.println("enter the purchase amount");
				int amount1=sc.nextInt();
				for(Customer customer:customers) {
					if(customer.getId()==id1) {
						customer.setPurchaseAmount(amount1);
						System.out.println("Customer Update");
						System.out.println(customer);
						flag=1;
					}
				}
				if(flag==0) 
					throw new Exceptions("Customer id not found");
					
				
				break;
					case 3:
						exit=false;
				}
			}
		
		}
		

	}


