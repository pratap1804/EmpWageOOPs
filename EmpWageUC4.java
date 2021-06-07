public class EmpWageUC4{
	public static void main(String args[]) {
	
	final int Wage_Per_Hour = 20;
	final int Full_Day_Hours =8;
	final int Part_Time_Hours =4;
	
	System.out.println("Welcome to Employee Wage Problem");
	double res = Math.random();
	
	if(res > 0.5) {
		System.out.println("Employee is Present");
		System.out.println("Enter 1 if Employee is FullTime Present And 2 if Employee is PartTime Present:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			int totalFullTimeWage=Wage_Per_Hour*Full_Day_Hours;
			System.out.println("FullTime Total Wage Of Employee is: "+totalFullTimeWage);
			break;
		case 2:
			int totalPartTimeWage=Wage_Per_Hour*Part_Time_Hours;
			System.out.println("Total Wage Of Employee is: "+totalPartTimeWage);
		}
	} else {
		System.out.println("Employee is Absent");
		}
	}
}
