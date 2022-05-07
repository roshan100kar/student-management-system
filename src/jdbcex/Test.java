package jdbcex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.maneger.Student;
import com.student.maneger.StudentDao;

public class Test {

	public static void main(String[] args)throws IOException {
		System.out.println("Welcome to student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to Add student");
			System.out.println("Press 2 to Delete studennt");
			System.out.println("Press 3 to display student");
			System.out.println("press 4 to exit app");
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				//Add stuent
				System.out.println("Enter user name:: ");
				String name = br.readLine();
				System.out.println("Enter user phone number");
				String phone = br.readLine();
				System.out.println("Enter user city");
				String city = br.readLine();
				
				//Create student object to store student data
				Student st = new Student(name, phone, city) ;
			boolean answer = 	StudentDao.insertStudentToDB(st);
			if(answer) {
				System.out.println("Student is addedd successfully");
			}else {
				System.out.println("Something went wrong try again");
			}
				System.out.println(st);
				
				
				
			}else if(c == 2) {
				//delete student
			}else if(c == 3) {
				// Display student
			}else if(c == 4) {
				//exit
				break;
			}else {
				
			}
					
		}
		System.out.println("Thank You for Using my application:: :) ");
	}

}
