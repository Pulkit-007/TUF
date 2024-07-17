package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequence2 {
    //technique to print only one answer
    //in the base condition of the function if the condition is satisfied you will return true else you will return false
    //then do if(func()==true) return;  func() return false;         func is boolean
    //technique is simple avoid future recursion calls
    public static boolean printS(int ind, List<Integer> res,int s,int sum,int [] arr,int n)
    {
        if(ind==n)
        {
            //condition satisfied
            if(s==sum)
            {
                System.out.println(res);
                return true;
            }
            //condition not satisfied
            else return false;
        }
        res.add(arr[ind]);
        s+=arr[ind];
        if(printS(ind+1,res,s,sum,arr,n)==true)
        {
            return true;
        }
        s-=arr[ind];
        res.remove(res.size()-1);
        if(printS(ind+1,res,s,sum,arr,n)==true)
        {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int [] arr={1,2,1};
        int n=3;
        int sum=2;
        List<Integer> res=new ArrayList<Integer>();
        printS(0,res,0,sum,arr,n);
    }

}
