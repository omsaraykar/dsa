package _1_Basics.Recurssion;

public class Printing {
    public void oneToN(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        oneToN(n - 1);
        System.out.println(n);
    }

    public void nToOne(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        nToOne(n - 1);
    }

    public static void main(String[] args) {
        Printing obj = new Printing();
        obj.oneToN(5);
        obj.nToOne(5);
    }
}
