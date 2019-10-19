
package daaassignment;

import java.util.Random;
import java.util.Scanner;

public class daaAssign {
    public static Random r=new Random();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[]={10, 7, 8, 9, 1, 5,21,3,44,6};
        int b[]=new int[20];
       
        nd_sort(a,b,a.length);
    }
    public static void nd_sort(int[] a,int[] b,int n)
    { int c=1;
    for(int i=0;i<a.length;i++)
        {
            
            b[i]=0;
        }
        for(int i=0;i<a.length;i++)
        {
            int j=r.nextInt(10);
            if(b[j]!=0)
            {
                i--;
                continue;
            }
            b[j]=a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            if(b[i]>b[i+1])
            {
                //nd_sort(a,b,a.length);
                
                c=0;
                
            }
           
        }
        if(c==1){
        for(int i=0;i<a.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        
        }
        else
        {
            System.out.println("failure");
        }
    }
}
