/*
 * You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

Example


The maximum height candles are  units high. There are  of them, so return .

Function Description

Complete the function birthdayCakeCandles in the editor below.

birthdayCakeCandles has the following parameter(s):

int candles[n]: the candle heights
Returns

int: the number of candles that are tallest
Input Format

The first line contains a single integer, , the size of .
The second line contains  space-separated integers, where each integer  describes the height of .

Constraints

Sample Input 0

4
3 2 1 3
Sample Output 0

2
 */

package com.keshavpradeep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

import javax.naming.spi.DirStateFactory.Result;

public class BirthdayCakeCandles {
	
	/*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    	
    	public static int birthdayCakeCandles(List<Integer> candles) {
    	    HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
    	            for(Integer i:candles){
    	            if(hash.containsKey(i)){
    	                hash.put(i,hash.get(i)+1);
    	            }
    	            else{
    	                hash.put(i,1);
    	            }
    	        }
    	        
    	        int highestValue=0;
    	        Set<Entry<Integer, Integer>> entrySet = hash.entrySet();
    	        for(Entry<Integer,Integer> e:entrySet)
    	            if(e.getValue()>highestValue){
    	                highestValue=e.getValue();
    	            }
    	                return highestValue;
    	    }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}

// class Solution1 {
//    public static void main(String[] args) throws IOException {
//    	List<Integer> candles= new ArrayList<Integer>(Arrays.asList(1,3,2,3));
////        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
////
////        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());
////
////        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
////            .map(Integer::parseInt)
////            .collect(toList());
//
//        int result = BirthdayCakeCandles.birthdayCakeCandles(candles);
//        System.out.println(result);
//
////        bufferedWriter.write(String.valueOf(result));
////        bufferedWriter.newLine();
////
////        bufferedReader.close();
////        bufferedWriter.close();
//    }

//}
