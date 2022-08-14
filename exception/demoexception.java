import java.util.Scanner;
public class demoexception {
    public static void main(String[] args) {
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of index");
        index= sc.nextInt();
        int a[] = new int[3];
        a[0]=2;
        a[1] = 5;
        a[2] = 10;
        System.out.println("enter the number to which you want to divude the array");
        int div = sc.nextInt();
        try{
        System.out.println("the value of index is "+a[index]);
        System.out.println("after dividing the value is:"+ a[index]/div);
        }
        catch(Exception e ) {
            System.out.println("exceptoin occured Right Now!");
            System.out.println(e);
        }


        }
}