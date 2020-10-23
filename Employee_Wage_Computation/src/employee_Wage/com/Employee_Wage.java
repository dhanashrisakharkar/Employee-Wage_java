package employee_Wage.com;

import java.util.Scanner;

public class Employee_Wage {
	public static int Hours = 0;
	public static int Total_Wages = 0;
	public static int Daily_Wage = 0;
	public static int Days = 0;

	public static void Company(String Company, int Total_Working_Day, int Total_Hours, int Wage_Per_Hour) {
		int Days = 0;
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
			Total_Wages = Total_Wages + Daily_Wage;
			System.out.println("Total Wage Per Employee :- " + Total_Wages);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***************Welcome To Employee Wage Computation*****************");

		Scanner sc = new Scanner(System.in);
		String companyName = null;

		int exit = 0;
		while (exit == 0) {
			System.out.println("Enter your choice");
			System.out.println("1.\t EXIT\t 2.\t calculate Employee Wage");
			int choice1 = sc.nextInt();
			if (choice1 == 1) {
				exit = 1;
			} else {
				System.out.println("Enter company name");
				companyName = sc.next();
				System.out.println("Enter Working days in a month");
				int Total_Working_Day = sc.nextInt();
				System.out.println("Enter Working hours in a month");
				int Total_Hours = sc.nextInt();
				System.out.println("Enter emp wage per hour");
				int Wage_Per_Hour = sc.nextInt();
				Company(companyName, Total_Working_Day, Total_Hours, Wage_Per_Hour);
			}
		}
		sc.close();
	}
}