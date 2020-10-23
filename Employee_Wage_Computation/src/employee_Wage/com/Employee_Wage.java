package employee_Wage.com;

public class Employee_Wage {
	public static int Hours = 0;
	public static int Total_Wages = 0;
	public static int Daily_Wage = 0;
	public static int Days = 0;

	public static int Company(String Company, int Total_Working_Day, int Total_Hours, int Wage_Per_Hour) {
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

		}
		return Total_Wages;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***************Welcome To Employee Wage Computation*****************");

		int CompanyCheck = (int) (Math.floor(Math.random() * 10) % 3 + 1);
		System.out.println(CompanyCheck);

		switch (CompanyCheck) {
		case 1:
			int Infosys = Company("Infosys", 20, 100, 30);
			System.out.println("Employee Earn Total Wages in Infosys Company Is :-" + Infosys);
			break;
		case 2:
			int TechMahindra = Company("TechMahindra", 25, 60, 40);
			System.out.println("Employee Earn Total Wages in TechMahindra Company Is :-" + TechMahindra);
			break;

		case 3:
			int Eton = Company("TechMahindra", 28, 80, 60);
			System.out.println("Employee Earn Total Wages in Eton Company Is :-" + Eton);
			break;

		default:
			System.out.println("No Company Is their");
			break;

		}

	}
}