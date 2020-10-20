package employee_Wage.com;

public class Employee_Wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Welcome To Employee Wage Computation In Java");
    int Is_Full_Time = 1;
	int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
     System.out.println(empCheck);
	if (empCheck == Is_Full_Time) {
		System.out.println("Employee is present ");
	} else {
		System.out.println("Employee is absent");
	}


	}

}
