//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.lang.reflect.Array;

public class Class
{
	private String name;
	//private Student[] studentList;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		studentList=new ArrayList<Student>();
	}
	
	//public Class(String nm, int stuCount)
	public Class(String nm, int stuCount)
	{
		name = nm; 
		studentList = new ArrayList<Student> (stuCount);
		//studentList = new Student[stuCount];
	
	}
	
	public void addStudent(int stuNum, Student s)
	//public void addStudent(Student s)
	{
		studentList.set(stuNum, s);
		//studentList[stuNum] = s;

	}
	
	public void sort()
	{
		//Arrays.sort(studentList);
		Collections.sort(studentList);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double sum = 0.0;
		for(int i = 0; i <studentList.size(); i++)
		{
			sum = sum + getStudentAverage(i);
		}
		classAverage = sum/studentList.size();
		//classAverage = sum/studentList.length;

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		double sum = 0.0;
		int stuNum= 0;
		for(int i = 0; i<studentList.size(); i++)
		{
			if (stuName == studentList.get(i).getName())
			{
				stuNum = i;
			}
		}

		return studentList.get(stuNum).getAverage();
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		sort();
		
		/**double high = Double.MIN_VALUE;
		String hName ="";
		for (int i = 0; i <studentList.length; i++)
		{
			if(getStudentAverage(i)>high)
			{
				high = getStudentAverage(i);
				hName = studentList[i].getName();
			}
		}**/
		return studentList.get(0).getName();
	}

	public String getStudentWithLowestAverage()
	{
		sort();
		/**double low = Double.MAX_VALUE;
		String hName ="";		
		for (int i = 0; i <studentList.length; i++)
		{
			if(getStudentAverage(i)<low)
			{
				low = getStudentAverage(i);
				hName = studentList[i].getName();
			}
		}**/
		return studentList.get(studentList.size()).getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i = 0; i<studentList.size(); i++)
		{
			if(getStudentAverage(i)<failingGrade)
			{
				output = output+studentList.get(i).getName() + " ";
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output= getClassName() + "\n";
		for (int i = 0; i<studentList.size(); i++)
		{
			output = output + studentList.get(i).toString() + "	" + studentList.get(i).getAverage()+ "\n";
		}
		//for (int i = 0; i< studentList.length; i++)
		//{
			//output = output + studentList[i].getName() + "'s average: " + studentList[i].getAverage() + "\n";
		//}
		//output = output + "Failure List:" + getFailureList(60.00) +"\n";
		//output = output + "Highest Average: " + getStudentWithHighestAverage() +"\n";
		//output = output + "Lowest Average: " + getStudentWithLowestAverage()+ "\n";
		//output = output + "Class Average: " + getClassAverage() + "\n";
		return output;
	}  	
}