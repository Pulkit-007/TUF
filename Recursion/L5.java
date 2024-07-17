package Recursion;

public class L5 {
    //print linear 1 to n using backtrack without using variable i;
    public static void func(int i,int n)
    {
        if(i<1) return;
        func(i-1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n=5;
        func(n,n);
    }
}
