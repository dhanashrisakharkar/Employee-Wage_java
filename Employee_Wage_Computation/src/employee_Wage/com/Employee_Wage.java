package employee_Wage.com;

public class Employee_Wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome To Employee Wage Computation In Java");
		int Wage_Per_Hour = 20;
		int Full_Day_Hour = 8, Part_Time_Hour = 4;
		int Total_Working_Day = 20;
		int Total_Hours = 100;
		int Days = 0;
		int Hours = 1;
		int Total_Wages = 0;

		while (Days <= Total_Working_Day && Hours <= Total_Hours) {

			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println(empCheck);
			switch (empCheck) {
			case 1:
				System.out.println("Employee is present ");
				int Daily_Wage = Wage_Per_Hour * Full_Day_Hour;
				int FWages_Month = Daily_Wage * Total_Working_Day;
				System.out.printf("Full Time employee Monthly Wage Is :-", FWages_Month);
				System.out.println(FWages_Month);
				Hours = Hours + Full_Day_Hour;
				Total_Wages = Total_Wages + Daily_Wage;

				break;
			case 2:
				System.out.println("Employee is present ");
				int Part_Time_Wage = Wage_Per_Hour * Part_Time_Hour;
				int PWages_Month = Part_Time_Wage * Total_Working_Day;
				System.out.printf("Par Time employee Daily Wage Is :-", PWages_Month);
				System.out.println(PWages_Month);
				Hours = Hours + Full_Day_Hour;
				Total_Wages = Total_Wages + Part_Time_Wage;
				break;
			default:
				System.out.println("Employee Is Absent");
				break;
			}

			Days++;
			System.out.println("Employee Earn Total Wages is :-" + Total_Wages);
		}
	}
}