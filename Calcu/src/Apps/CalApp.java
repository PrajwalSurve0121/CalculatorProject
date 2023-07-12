package Apps;

import java.util.Scanner;

import Dao.CalImple;

public class CalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CalImple d=new CalImple();
//		d.Numbers();
		char c;
		do
		{
			System.out.println("...................Enter Choice From Below............................");
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
			int choice=sc.nextInt();
			
			
				
				System.out.println("Enter first Number");
				int a=sc.nextInt();
				System.out.println("Enter Second Number");
				int b=sc.nextInt();
				
		
			
			switch(choice)
			{
			case 1:
				int output=d.Addition(a, b);
				System.out.println(output);
			break;
			case 2:
				int output1=d.Substraction(a, b);
				System.out.println(output1);
			break;
			case 3:
				int Output2=d.Multiplication(a, b);
				System.out.println(Output2);
			break;
			case 4:
				int Output3=d.Division(a, b);
			    System.out.println(Output3); 
			break;
			default:System.out.println("Invalid Choice");
			}
			System.out.println("................................Do you Want To Continue.......................");
			c=sc.next().charAt(0);
		}while(c=='y' || c=='Y');  

		sc.close();
	}

}
