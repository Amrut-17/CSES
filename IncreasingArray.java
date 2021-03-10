package CSES;

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long[] arr = new long[(int) n];
        for (int i=0; i<n; i++){
            arr[i] = s.nextLong();
        }
        long count =0;
        for (int i=1; i<n; i++){
            if (arr[i-1]>arr[i]){
                count = count + (arr[i-1]-arr[i]);
                arr[i] = arr[i-1];
                i--;
            }
        }

        System.out.println(count);
    }
}
