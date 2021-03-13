package collegeData;

import java.util.Scanner;

public class TestCollegeData {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of student");
		
		int studentCount=scan.nextInt();
		scan.nextLine();

		ReadKeyBoardData keyboardData = new ReadKeyBoardData();
		keyboardData.readStudentData(studentCount, scan);
		keyboardData.displayStudentData(studentCount);
		
		scan.close();
	}
		
}
