package Recursion;

public class L4 {
    public static void func(int i,int n)
    {
        if(i<1) return;
        System.out.println(i);
        func(i-1,n);

    }

    public static void main(String[] args) {
        int n=5;
        func(5,n);
    }
}
