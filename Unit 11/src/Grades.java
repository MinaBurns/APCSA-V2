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

public class Grades
{
	//private double[] grades;
	private ArrayList<Double> grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		//double[] grades = new double[gradeList.charAt(0)];
		int size = Integer.parseInt(gradeList.substring(0,1));
		//grades = new double[size];
		grades = new ArrayList<Double> (size);
		int index = gradeList.indexOf("-");
		for(int i = 0; i<size; i++)
		{
			int start = gradeList.indexOf(" ", index+1);
			index = start+1;
			int end = gradeList.indexOf(" ", index);
			double value = 0.0;
			if(end == -1)
			{
				value = Double.parseDouble(gradeList.substring(start));
			}
			else
			{
				value = Double.parseDouble(gradeList.substring(start,end));
			}
			grades.set(i, value);
			//grades[i] = value;
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		//for(int i = 0; i< grades.length;i++)
		//{
		grades.set(spot, grade);	
		//grades[spot]=grade;
		//}


	}
	
	public double getSum()
	{
		double sum=0.0;
		for(int i = 0; i < grades.size(); i++)
		{
			sum = sum + grades.get(i);
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(int i = 0; i < grades.size(); i++)
		{
			if(low>grades.get(i))
			{
				low = grades.get(i);
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(int i = 0; i < grades.size(); i++)
		{
			if(high<grades.get(i))
			{
				high = grades.get(i);
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
		for(int i = 0; i < grades.size(); i++)
		{
			output = output+grades.get(i) +" ";
		}
		return output;
	}	
}