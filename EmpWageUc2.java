package practiseProblemsDay3;

public class EmpWageUc2 {

	public static void main(String[] args) {
		// int emp_Full_Time = 1;
		// int emp_Rate_Per_Hr = 20;
		// int empHrs = 8;
		// int empWage = empHrs * emp_Rate_Per_Hr;
		//
		// int randomCheck = (int) ((Math.random() * 10) % 2);
		//
		// if (randomCheck == emp_Full_Time)
		// empHrs = 8;
		// else
		// empHrs = 0;
		// System.out.println("The Employee wage per Day is " + empWage);

		int isPresent = 1;
		int isAbsent = 0;
		int empHrs1 = 8;
		int empHrs2 = 0;
		int empRatePerHr = 20;
		int salary1 = (empHrs1 * empRatePerHr); // (salary1 = 8 * 20 = 160)
		int salary2 = (empHrs2 * empRatePerHr); // (salary2 = 0 * 20 = 0)
		
		int empStatus = (int) (Math.random() * 10) % 2;
		
		if (empStatus == 1)
			System.out.print("The Employee wage per Day is " + salary1);
		else
			System.out.print("The Employee wage per Day is " + salary2);
	}
}
