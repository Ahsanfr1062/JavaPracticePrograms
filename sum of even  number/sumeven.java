import java.util.Scanner;
public class sumeven {
    public static void main(String args[])
    {
        int sum=0;
        Scanner imp = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = imp.nextInt();
        System.out.println("Sum of Even Number are:");
        for(int i =2;i<=n;i=i+2)
        {
            sum = sum+i;
        }
        System.out.println(sum);

    }
}