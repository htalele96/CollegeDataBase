package collegeData;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadKeyBoardData {
	
	ArrayList<Student> studentList=new ArrayList<Student>();

	public void readStudentData(int studentCount,Scanner scan) {
		 
		for (int i = 0; i < studentCount; i++) {
			
			System.out.println("studentId");
			int studId=scan.nextInt();
			scan.nextLine();
			
			System.out.println("studentName");
			String studName=scan.nextLine();
			
			Student stud=new Student(studId,studName);
			studentList.add(stud);
		}
	}
	
	public void displayStudentData(int studentCount) {
		
		for (int i = 0; i < studentCount; i++) {
			
			Student studentData=studentList.get(i);		
			System.out.println(studentData);

		}

	}
	
}
