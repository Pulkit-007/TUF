package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequence {
    public static void printF(int ind, List<Integer> lst,int [] arr)
    {
        if(ind==arr.length)
        {
            System.out.println(lst);
            return;

        }
        //take or pick the particular index into the subsequence
        lst.add(arr[ind]);
        printF(ind+1,lst,arr);
        lst.remove(lst.size()-1);
        //not pick or not take condition, this element is not added to your subsequence
        printF(ind+1,lst,arr);
    }

    public static void main(String[] args) {
        int [] arr={3,1,2,4};
        List<Integer> lst=new ArrayList<Integer>();
        printF(0,lst,arr);
    }
}
