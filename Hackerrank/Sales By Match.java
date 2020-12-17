import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//N^2,1
public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] c) {
        int count=0;
        for(int i=0; i<n; i++){
            if(c[i]!=0){
                for(int j=i+1; j<n; j++){
                    if(c[i]==c[j]){
                        count++;
                        c[j]=0;
                        break;
                    }
                }           
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}




// the following is of N,N
static int sockMerchant(int n, int[] c) {
    Set<Integer> colors = new HashSet<>();
    int pairs = 0;

    for (int i = 0; i < n; i++) {
        if (!colors.contains(c[i])) {
            colors.add(c[i]);
        } else {
            pairs++;
            colors.remove(c[i]);
        }
    }

    return pairs;
}