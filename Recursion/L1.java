package Recursion;

public class L1 {
    static int cnt=0;
    static void print(){
        //base condition
        if(cnt==3)
        {
            return;
        }
        System.out.println(cnt);
        cnt++;
        print();
    }

    public static void main(String[] args) {
        print();
    }
}
