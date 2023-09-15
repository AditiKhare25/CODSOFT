import java.util.Scanner;

public class GradeCalculator{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String name;
        int m1,m2,m3,m4,m5;
        int sum;
        float percentage;
        String grade;

        System.out.println("Enter The name of student:");
        name=sc.next();
        System.out.println("enter 5 subject's marks(out of 100):");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
       
        sum=m1+m2+m3+m4+m5;

        percentage=(float)(sum/6.0);

        if(percentage>=90){
            grade="A";
        }
        else if(percentage<=90 && percentage>=60){
            grade="B";
        }
        else{
            grade="C";
        }
        
        System.out.println("Name of Student:"+name);
        System.out.println("Total marks obtained out of 600:"+sum);
        System.out.println("Percentage of student:"+percentage);
        System.out.println("Grade obtained:"+grade);


    }
}