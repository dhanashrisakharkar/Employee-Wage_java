package employee_Wage.com;

public class Employee_Wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome To Employee Wage Computation In Java");
		int Wage_Per_Hour = 20;
		int Full_Day_Hour = 8, Part_Time_Hour = 4;
		int Total_Working_Day = 20;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println(empCheck);
		switch (empCheck) {
		case 1:
			System.out.println("Employee is present ");
			int Daily_Wage = Wage_Per_Hour * Full_Day_Hour;
			int FWages_Month = Daily_Wage * Total_Working_Day;
			System.out.printf("Full Time employee Monthly Wage Is :-", FWages_Month);
			System.out.println(FWages_Month);
			break;
		case 2:
			System.out.println("Employee is present ");
			int Part_Time_Wage = Wage_Per_Hour * Part_Time_Hour;
			int PWages_Month = Part_Time_Wage * Total_Working_Day;
			System.out.printf("Par Time employee Daily Wage Is :-", PWages_Month);
			System.out.println(PWages_Month);
			break;
		default:
			System.out.println("Employee Is Absent");
			break;
		}

	}

}
