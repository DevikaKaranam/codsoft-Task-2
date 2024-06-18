import java.util.Scanner;
public class GradeCalculator
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter marks scored (Out of 100) : \n");
System.out.println("Subject-1 Marks : ");
int Subject1marks = scanner.nextInt();
System.out.println("Subject-2 Marks : ");
int Subject2marks = scanner.nextInt();
System.out.println("Subject-3 Marks : ");
int Subject3marks = scanner.nextInt();
double TotalMarks = (Subject1marks + Subject2marks + Subject3marks);
System.out.println("Total Marks Obtained : "+ TotalMarks);
double Average = (double)TotalMarks/3;
System.out.println("Average Percentage : "+ Average);
char Grade;
if(Average>=90)
{
System.out.println("Grade = 'A'");
}
else if(Average>=80)
{
System.out.println("Grade = 'B'");
}
else if(Average>=70)
{
System.out.println("Grade = 'C'");
}
else if(Average>=60)
{
System.out.println("Grade = 'D'");
}
else
{
System.out.println("FAIL");
}

}
}