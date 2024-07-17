package Recursion;

public class functional {
    //functional way to do sum of n natural numbers
    public static int func(int n)
    {
        if(n==0) return 0;
        return n+func(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(func(5));
    }
}
