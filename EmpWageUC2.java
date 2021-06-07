public class EmpWageUC2 {
	public static void main(String args[]) {
	
	final int Wage_Per_Hour = 20;
	final int Full_Day_Hours =8;
	
	System.out.println("Welcome to Employee Wage Calculation");
	double res = Math.random();
	
	if(res > 0.5) {
		System.out.println("Employee is Present");
		int totalWage=Wage_Per_Hour*Full_Day_Hours;
		System.out.println("Total Wage Of Employee is: "+totalWage);
	} else {
		System.out.println("Employee is Absent");
		}
	}
}
