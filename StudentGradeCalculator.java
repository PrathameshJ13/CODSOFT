import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        int n = sc.nextInt();
        double[] marks = new double[n];
        double TotalMarks = 0.0;
        for(int i=0;i<n;i++)
        {
             System.out.println("Enter marks in subject "+(i+1)+"(out of 100):");
             marks[i] = sc.nextDouble();
             TotalMarks += marks[i];
        }
        
        double Average=calculateAverage(TotalMarks,n);
        double AveragePercentage=calculateAveragePercentage(TotalMarks,n);
        String grade=AssignGrade(AveragePercentage);
        
        System.out.println("TotalMarks : "+TotalMarks);
        System.out.println("Average : "+Average);
        System.out.println("AveragePercentage :"+AveragePercentage);
        System.out.println("Grade :"+grade);
;    }

public static Double calculateAverage(double TotalMarks,int n)
{
    return TotalMarks / n ;
}

public static Double calculateAveragePercentage(double TotalMarks,int n)
{
    return (TotalMarks / (n * 100)) * 100;
}

public static String AssignGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else if (averagePercentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}