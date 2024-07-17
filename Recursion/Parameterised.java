package Recursion;

public class Parameterised {
    //sum of n natural numbers using parameterised way
    public static void func(int i,int sum){
        if(i<1) {
            System.out.println(sum);
            return;
        }
        func(i-1,sum+i);

    }

    public static void main(String[] args) {
        int n=5;
        func(n,0);

    }
}
