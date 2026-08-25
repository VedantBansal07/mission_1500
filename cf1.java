// 800 rating

import java.util.*;
public class cf1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int[] arr=new int[3];
            arr[0]=sc.nextInt();
            arr[1]=sc.nextInt();
            arr[2]=sc.nextInt();
            boolean flag=true;
            while(flag){
                Arrays.sort(arr);
                int sum=arr[0]+arr[1];
                if(sum<arr[2]){
                    arr[2]=sum;
                }
                else flag=false;
            }
            System.out.println(arr[2]-arr[0]);

        }
    }
}