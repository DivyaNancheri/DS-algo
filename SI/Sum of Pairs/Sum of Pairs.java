import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MergeSort  {
    void ms(int ar[],int low,int high){
        if(low==high)
            return;
            
        int mid=(low+high)/2;
        ms(ar,low,mid);
        ms(ar,mid+1,high);
        merge(ar,low,mid,high);
    }
    
    void merge(int ar[],int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i,j,k;
        for(i=low,j=mid+1,k=0;i<=mid&&j<=high;){
            if(ar[i]<ar[j])
                temp[k++]=ar[i++];
            else
                temp[k++]=ar[j++];

        }
        while(i<=mid)
            temp[k++]=ar[i++];
        while(j<=high)
            temp[k++]=ar[j++];

        for(int p=low;p<=high;p++)
            ar[p]=temp[p-low] ;
        
    }
        
    public static void main(String[] args) throws IOException {
 
        MergeSort mergeSort = new MergeSort();
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int tc=Integer.parseInt(br.readLine());
        for(int t=0;t<tc;t++) {
            int n, k;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            k=Integer.parseInt(inp[1]);
            inp=br.readLine().split(" ");
            int ar[]=new int[n];
            for(int j=0;j<n;j++)
                ar[j]=Integer.parseInt(inp[j]);

            mergeSort.ms(ar, 0, ar.length - 1);
            int sum=0,c=0;
            for(int i=0,j=n-1;i!=j;){
                sum=ar[i]+ar[j];
                if(sum==k){
                    c=1;
                    break;
                }
                else if(sum<k)
                    i++;
                    else
                    j--;
            }
            if(c==1)
                bw.write("True\n");
            else
                bw.write("False\n");
            
        }
        bw.flush(); 
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}