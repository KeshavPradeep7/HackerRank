package com.keshavpradeep;

import java.util.Scanner;

public class PlusMinus {

	// Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

    	float positives=0,negatives=0,zeroes=0;
        for(int i:arr){
            if(i==0){
                zeroes++;
            }
            else if(i>0){
                positives++;
            }
            else{
                negatives++;
            }
        }
        System.out.println(positives/arr.length);
        System.out.println(negatives/arr.length);
        System.out.println(zeroes/arr.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	int[] arr={1,2,-9,0,-7,-3};
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
////        int[] arr = new int[n];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }

        plusMinus(arr);

        scanner.close();
    }
}
