class A {
    double width,height,depth; 
A(double w,double h,double d) 
{
   width = w;
   height = h;
   depth = d;
}
A(double c){
    width = height = depth = c;
}
A() {
    width = 1;
    height = 2;
    depth = 3;
}
}
public class sumeven {
    public static void main(String args[])
    {
        A obj1 = new A(2,34,5);
        A obj2 = new A(334);
        A obj3 = new A();
        System.out.println("obj1 ="+obj1.depth +"obj2="+obj2.width+"obj3 ="+obj3.height);
}
}