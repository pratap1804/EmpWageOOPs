public class Attendance {

	public static void main(String args[]) {
	
	final int Wage_Per_Hour = 20;
	final int Full_Day_Hours =8;
	final int Part_Time_Hours =4;
	int Working_Days_Per_Month=20;
	int Total_Hours=0;
	System.out.println("Welcome to Employee Wage Problem");
	double res = Math.random();
	
	if(res > 0.5) {
		System.out.println("Employee is Present");
		System.out.println("Enter 1 if Employee is FullTime Present And 2 if Employee is PartTime Present:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			
			int totalFullTimeMonthlyWage1=0;
			while(Total_Hours < 101 && Working_Days_Per_Month <21) {
			totalFullTimeMonthlyWage1=Attendance.calculateWageFullTime(Wage_Per_Hour, Full_Day_Hours,Working_Days_Per_Month);
			Total_Hours++;
			Working_Days_Per_Month++;
			}
			System.out.println("FullTime Monthly Total Wage Of Employee is: "+totalFullTimeMonthlyWage1);
			break;
		case 2:
			int totalPartTimeMonthlyWage1=0;
			while((Total_Hours < 101 && Working_Days_Per_Month <21)) {
				totalPartTimeMonthlyWage1=Attendance.calculateWagePartTime(Wage_Per_Hour,Part_Time_Hours,Working_Days_Per_Month );
				Total_Hours++;
				Working_Days_Per_Month++;
			} 
			System.out.println("PartTime Monthly Total Wage Of Employee is: "+totalPartTimeMonthlyWage1);
			}
		} else {
		System.out.println("Employee is Absent");
		}
	}
	
	static int calculateWageFullTime(int Wage_Per_Hour,int Full_Day_Hours, int Working_Days_Per_Month ) {
		int totalWage = Wage_Per_Hour*Full_Day_Hours*Working_Days_Per_Month;
			return totalWage;
}
	static int calculateWagePartTime(int Wage_Per_Hour,int Part_Time_Hours, int Working_Days_Per_Month ) {
		int totalWage = Wage_Per_Hour*Part_Time_Hours*Working_Days_Per_Month;
		return totalWage;
	}
}
