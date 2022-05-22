import java.util.Scanner;
public class ok {
    public static void main(String args[]) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the Marks of five Subjects:\n");
        float sub_1 = in.nextFloat();
        float sub_2 = in.nextFloat();
        float sub_3 = in.nextFloat();
        float sub_4 = in.nextFloat();
        float sub_5 = in.nextFloat();
        float total,average,percentage;
        char grade;
        total = sub_1+sub_2+sub_3+sub_4+sub_5;
        average = total/5;
        percentage = total*100/500;
        if(average>=90)
        {
            grade = 'A';
        }
        else if(average >=80 && average<90)
        {
            grade = 'B';
        }
        else if(average>=70 && average<80)
        {
            grade = 'C';
        }
        else if(average>=60 && average<70)
        {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
    System.out.println("Total Number are:"+total);
    System.out.println("Average Marks:"+average);
    System.out.println("Percentage:"+percentage +"%");
    System.out.println("Grades are:"+grade);

    }
}