package CSES;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int[] arr = new int[(int) n];
        long sum =0;
        long total = ((n*(n+1))/2);
        for (int i=0; i<n-1; i++){
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(total-sum);





    }
}
