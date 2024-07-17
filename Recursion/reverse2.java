package Recursion;

public class reverse2 {
    //reverse using single pointer
    public static void func(int i,int []arr)
    {
        if(i>=arr.length/2) return;
        swap(i, arr.length-i-1,arr);
        func(i+1,arr);
    }
    public static void swap(int i,int r,int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[r];
        arr[r]=temp;

    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        func(0,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
