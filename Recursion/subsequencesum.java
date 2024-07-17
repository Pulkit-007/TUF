package Recursion;

import java.util.ArrayList;

public class subsequencesum {
    public static void PrintSub(int ind, ArrayList<Integer> res,int s,int sum,int [] arr,int n )
    {
        if(ind==n)
        {
            if(s==sum)
            {
                System.out.println(res);
            }
            return;
        }
        res.add(arr[ind]);
        s+=arr[ind];
        PrintSub(ind+1,res,s,sum,arr,n);
        s-=arr[ind];
        res.remove(res.size()-1);
        //not take
        PrintSub(ind+1,res,s,sum,arr,n);
    }

    public static void main(String[] args) {
        int [] arr={1,2,1};
        int n=3;
        int sum=2;
        ArrayList<Integer> res=new ArrayList<>();
        PrintSub(0,res,0,sum,arr,n);
    }
}
