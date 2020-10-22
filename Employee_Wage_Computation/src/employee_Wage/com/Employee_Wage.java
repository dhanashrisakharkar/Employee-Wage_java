package employee_Wage.com;

public class Employee_Wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome To Employee Wage Computation In Java");
		int Wage_Per_Hour = 20;
		int Total_Working_Day = 20;
		int Total_Hours = 100;
		int Days = 0;
		int Hours = 1;
		int Total_Wages = 0;
		int Daily_Wage = 0;

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
			Total_Wages = Total_Wages + Daily_Wage;
			System.out.println("Employee Earn Daily Wage  :-" + Daily_Wage);
			System.out.println("Employee Earn Total Wages is :-" + Total_Wages);
		}
	}
}