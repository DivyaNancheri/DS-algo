import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int max = 0;
        for(int i=0; i < n; i++){
            height[i] = in.nextInt();
            if ( height[i] > max){
                max = height[i] ;
            }
        }
        if(k >= max){
            System.out.println("0");
            
        }
        else{
                System.out.println(max-k);
         }
    }

}
