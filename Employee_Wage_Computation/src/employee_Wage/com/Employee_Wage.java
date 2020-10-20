package employee_Wage.com;

public class Employee_Wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome To Employee Wage Computation In Java");
		int Is_Full_Time = 1, Is_Part_Time=2,Wage_Per_Hour = 20, Full_Day_Hour = 8, Part_Time_Hour = 4;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println(empCheck);
		if (empCheck == Is_Full_Time) {
			System.out.println("Employee is present ");
			int Daily_Wage = Wage_Per_Hour * Full_Day_Hour;
			System.out.printf("Daily Employee wage is :-", Daily_Wage);
			System.out.println(Daily_Wage);
		} else if (empCheck == Is_Part_Time) {
			System.out.println("Employee is present ");
			int Part_Time_Wage = Wage_Per_Hour * Part_Time_Hour;
			System.out.printf("Daily Employee wage is :-",Part_Time_Wage );
			System.out.println(Part_Time_Wage);
		} 
		else {
			System.out.println("Employee is absent");
		}

	}

}
