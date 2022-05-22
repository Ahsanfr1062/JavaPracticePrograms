import java.util.Scanner;
public class tableany {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the Value of which you want to print the table:");
        int imp = in.nextInt();
        System.out.println("Here is the Table of"+imp);
        for(int i =1;i <=10;i++)
        {
            System.out.println(imp+"*"+i+"="+imp*i);
        }

    }
}