package Dao;

import java.util.Scanner;

import Beans.CalDetails;

public class CalImple implements Calinfo{
	Scanner sc=new Scanner(System.in);
//	CalDetails d;
	int a;
	int b;
	
//	CalImple f=new CalImple();
	CalDetails c=new CalDetails(a,b);

	@Override
	public int Addition(int a,int b) {
		// TODO Auto-generated method stub
//		f.Numbers();
//		System.out.println("Enter first Number");
//		a=sc.nextInt();
//		System.out.println("Enter Second Number");
//		b=sc.nextInt();
		return a+b;		
	}

	@Override
	public int Substraction(int a,int b) {
		// TODO Auto-generated method stub
//		f.Numbers();
//		System.out.println("Enter first Number");
//		a=sc.nextInt();
//		System.out.println("Enter Second Number");
//		b=sc.nextInt();
return a-b;		
	}

	@Override
	public int Multiplication(int a,int b) {
		// TODO Auto-generated method stub
//		f.Numbers();
//		System.out.println("Enter first Number");
//		a=sc.nextInt();
//		System.out.println("Enter Second Number");
//		b=sc.nextInt();
		return a*b;
	}

	@Override
	public int Division(int a,int b) {
		// TODO Auto-generated method stub
//		f.Numbers();
//		System.out.println("Enter first Number");
//		a=sc.nextInt();
//		System.out.println("Enter Second Number");
//		b=sc.nextInt();
		return a/b;		
	}

}
