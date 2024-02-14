package stacksqueue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class egameoftwostacks {
     /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
    // Write your code here
        int[] c=new int[a.size()];
        int[] d=new int[b.size()];;
        // a.size()
        for (int i=0;i<a.size();i++) {
            c[i]=a.get(i);
        }
        for (int i=0;i<b.size();i++) {
            d[i]=b.get(i);
        }
        int x=maxSum;
        return twoStacks(x, c, d,0,0)-1;
    }
    private static int twoStacks(int x,int[] a,int[] b,int sum,int count){
        if (sum>x){
            return count;
        }
        if (a.length==0||b.length==0){
            return count;
        }
        int ans1=twoStacks(x,Arrays.copyOfRange(a,1,a.length), b,sum+a[0],count+1);
        int ans2=twoStacks(x,a,Arrays.copyOfRange(b,1,a.length),sum+b[0],count+1);

        return Math.max(ans1,ans2);
    }

// }

// public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int m = Integer.parseInt(firstMultipleInput[1]);

            int maxSum = Integer.parseInt(firstMultipleInput[2]);

            String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aTemp[i]);
                a.add(aItem);
            }

            String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> b = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                int bItem = Integer.parseInt(bTemp[i]);
                b.add(bItem);
            }

            int result = egameoftwostacks.twoStacks(maxSum, a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}