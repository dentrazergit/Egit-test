import java.util.Scanner;


public class GradeBook {

	private String courseName;
	private int grades[][];
	private int total;
	private int gradeCounter;
	
	public GradeBook(String name, int [][]gArray){
		
		courseName = name;
		grades = gArray;
	}
	
	public void setCourseName(String name){
		courseName = name;
	}
	public String getCourseName(){
		return courseName;
	}
	public void displayMessage(){
		System.out.println("Welcome to the course!!!!!");
		System.out.println("Course name is : "+getCourseName());
	}
	
	public void processGrades(){
		
		outputGrades();
		
		System.out.println("Avarages of grades: "+totalGrades());
		System.out.println("Maximum grade was: "+maxGrade());
		System.out.println("Min grade was: "+minGrade());
		
		outputGradeBarChart();
	}

	private void outputGradeBarChart() {
		// TODO Auto-generated method stub
		System.out.println("Grade chart");
		int freq[] = new int [11];
		for(int i = 0;i<grades.length;i++){
			for(int j=0;j<grades[i].length;j++){
				++freq[grades[i][j]/10];
			}
		}
		for(int i = 0;i<freq.length;i++){
			if(i==10){
				System.out.print("100 - ");
			}else{
				System.out.print(i*10+" - "+((i*10)+9)+" ");
			}
			for(int s = 0;s<freq[i];s++)
			System.out.print("*");
			System.out.println();
		}
		
	}

	private int maxGrade() {
		// TODO Auto-generated method stub
		int max = 0;
		for(int i = 0;i<grades.length;i++){
			for(int j =0;j<grades[i].length;j++){
			if(grades[i][j]>max){
				max = grades[i][j];
			}}
		}
		return max;
	}
	private int minGrade() {
		// TODO Auto-generated method stub
		int min = grades[0][0];
		for(int i = 0;i<grades.length;i++){
			for(int j =0;j<grades[i].length;j++){
			if(grades[i][j]<min){
				min = grades[i][j];
			}}
		}
		return min;
	}

	private int totalGrades() {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i = 0;i<grades.length;i++){
			for(int j =0;j<grades[i].length;j++){
			total = total +grades[i][j];
		}}
		return total;
	}
	private double avarageGrades(int[] sethOfGrades) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i = 0;i<sethOfGrades.length;i++){
			
			total = total +sethOfGrades[i];
		}
		return (double)(total /sethOfGrades.length);
	}

	private void outputGrades() {
		// TODO Auto-generated method stub
		System.out.println("Class grade was: ");
		for(int i = 0;i<grades[0].length;i++){
			System.out.print("\tTest "+i);
		}
		System.out.println("Avarage");
		for(int i = 0;i<grades.length;i++){
			System.out.print("Student "+i+" ");
			for(int j = 0;j<grades[0].length;j++){
				System.out.print(grades[i][j]+"\t");
				
				
			}
			double avarage = avarageGrades(grades[i]);
			System.out.print(avarage);
			System.out.println();
		}
	}
	
	
}
