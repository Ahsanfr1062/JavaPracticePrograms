class A {
    double dim1;
    double dim2;
    double area() {
        System.out.println("this is reallt very good");
        return 0;
    }
}
class B extends A {
    double area() {
        System.out.print("okefovred");
        return dim1*dim2;
    }
}
public class methodoverride {
    public static void main(String args[]) {
        A L = new A();
        B T = new B();
        L.dim1= 34.0;
        L.dim2 = 54.0;
        T.dim1 = 5.0;
        T.dim2 = 2.0;
        double at = L.area();
        double af = T.area();
        System.out.println("at="+at+"af"+af);

    }
}