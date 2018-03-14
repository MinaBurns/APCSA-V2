//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.ArrayList;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		Scanner keyboard = new Scanner(System.in);
		out.println("How many classes are there?");
		int numClasses = keyboard.nextInt();
		ArrayList<Class> ClassList = null;
		for (int i = 0; i < numClasses; i++)
		{
			out.println("What is the name of this class?");
			String name = keyboard.nextLine();
			out.println("How many students are in this class?");
			int numStudents = keyboard.nextInt();
			keyboard.nextLine();
			
			Class theClass = new Class (name, numStudents);
			ClassList.add(theClass);
			
			for (int j = 0; j < numStudents; j++)
			{
				out.println("Enter the name of student " + (j+1));
				String studentname = keyboard.nextLine();
				out.println("Enter the grades for " + studentname);
				out.println("Use the format x-grades ( 2 - 100 100) :");
				String gradeList = keyboard.nextLine();
				Student newStudent = new Student(studentname, gradeList);
			}
			out.println(theClass);
			
		}
		
		




















	}		
}