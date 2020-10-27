package employee_Wage.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee_Wage {
	public static int Hours = 0;
	public static int Total_Wages = 0;
	public static int Daily_Wage = 0;
	public static int Days = 0;
	public static int Total_Array_Wage = 0;

	public static int Company(String companyName, int Total_Working_Day, int Total_Hours, int Wage_Per_Hour) {
		int Days = 0;
		ArrayList list = new ArrayList();
		list.add(companyName);
		while (Days <= Total_Working_Day && Hours <= Total_Hours) {

			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println(empCheck);
            
			switch (empCheck) {
			case 1:
				System.out.println("Employee is present");
				Hours = 8;
				break;
			case 2:
				System.out.println("Employee is Present");
				Hours = 4;
				break;
			default:
				System.out.println("Employee Is Absent");
				break;
			}
			Days++;
			Daily_Wage = Wage_Per_Hour * Hours;
			System.out.println("Total Employee Days Is :-" + Days);
			System.out.println("Employee Earn Daily Wage  :-" + Daily_Wage);
			list.add(Daily_Wage);
			Total_Wages = Total_Wages + Daily_Wage;

		}
		list.add(Total_Wages);
        System.out.println(list);
		return Total_Wages;
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***************Welcome To Employee Wage Computation*****************");

		Scanner sc = new Scanner(System.in);
		String companyName = null;

		int exit = 0;
		while (exit == 0) {
			int i=1;
			System.out.println("Enter your choice");
			System.out.println("1. calculate Employee Wage \n 2.exit");
			int choice1 = sc.nextInt();
			System.out.println("Enter the no of company");
			int No = sc.nextInt();
			while( i >= No)
			{
			if (choice1 == 1) {
		
				System.out.println("Enter company name");
				companyName = sc.next();
				System.out.println("Enter Working days in a month");
				int Total_Working_Day = sc.nextInt();
				System.out.println("Enter Working hours in a month");
				int Total_Hours = sc.nextInt();
				System.out.println("Enter emp wage per hour");
				int Wage_Per_Hour = sc.nextInt();
				System.out.println("Total Employee Wage Per Month Is :-" + Company(companyName, Wage_Per_Hour, Wage_Per_Hour, Wage_Per_Hour));
			}else {
				System.out.println("not acceptable");
			}
				
			
			}
			
			
		}
		sc.close();
	}
}