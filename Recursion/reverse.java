package Recursion;

public class reverse {
    public static void func(int l,int r,int [] arr)
    {
        if(l>=r) return;
        swap(l,r,arr);
        func(l+1,r-1,arr);
    }
    public static void swap(int l ,int r,int [] arr)
    {
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        func(0,arr.length-1,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
