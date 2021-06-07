public class EmpWageUC5{
	public static void main(String args[]) {
	
	final int Wage_Per_Hour = 20;
	final int Full_Day_Hours =8;
	final int Part_Time_Hours =4;
	final int Working_Days_Per_Month=20;
	
	System.out.println("Welcome to Employee Wage Problem");
	double res = Math.random();
	
	if(res > 0.5) {
		System.out.println("Employee is Present");
		System.out.println("Enter 1 if Employee is FullTime Present And 2 if Employee is PartTime Present:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			int totalFullTimeMonthlyWage=Wage_Per_Hour*Full_Day_Hours*Working_Days_Per_Month;
			System.out.println("FullTime Monthly Total Wage Of Employee is: "+totalFullTimeMonthlyWage);
			break;
		case 2:
			int totalPartTimeMonthlyWage=Wage_Per_Hour*Part_Time_Hours*Working_Days_Per_Month;
			System.out.println("PartTime Monthly Total Wage Of Employee is: "+totalPartTimeMonthlyWage);
		}
	} else {
		System.out.println("Employee is Absent");
		}
	}
}
