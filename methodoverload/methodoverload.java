class Math {
    int Sum() {
        return 2*2;
    }
    int Sum(int a ,int b) {
          return a+b;
    }
    double Sum(double n) {
        return n*n;
    }
    
}

public class methodoverload {
    public static void main(String args[]) {
        Math obj1 = new Math();
      int np = obj1.Sum();
        int tp = obj1.Sum(2,3);
        double op = obj1.Sum(33);
        System.out.println("np = "+np+"\n"+"tp="+tp+"\n"+"op="+op+"\n");

    }
}