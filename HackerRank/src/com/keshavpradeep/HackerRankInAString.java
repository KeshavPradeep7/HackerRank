/*
 * We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank. Remeber that a subsequence maintains the order of characters selected from a sequence.

More formally, let  be the respective indices of h, a, c, k, e, r, r, a, n, k in string . If  is true, then  contains hackerrank.

For each query, print YES on a new line if the string contains hackerrank, otherwise, print NO.

Example

This contains a subsequence of all of the characters in the proper order. Answer YES


This is missing the second 'r'. Answer NO.


There is no 'c' after the first occurrence of an 'a', so answer NO.

Function Description

Complete the hackerrankInString function in the editor below.

hackerrankInString has the following parameter(s):

string s: a string
Returns

string: YES or NO
Input Format

The first line contains an integer , the number of queries.
Each of the next  lines contains a single query string .

Constraints

Sample Input 0

2
hereiamstackerrank
hackerworld
Sample Output 0

YES
NO
Explanation 0

We perform the following  queries:


The characters of hackerrank are bolded in the string above. Because the string contains all the characters in hackerrank in the same exact order as they appear in hackerrank, we return YES.
 does not contain the last three characters of hackerrank, so we return NO.
Sample Input 1

2
hhaacckkekraraannk
rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt
Sample Output 1

YES
NO
 */
package com.keshavpradeep;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class HackerRankInAString {
	// Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
    	String answer="NO";
    	Stack<Character> hackerRank= new Stack<Character>();
    	hackerRank.push('k');
    	hackerRank.push('n');
    	hackerRank.push('a');
    	hackerRank.push('r');
    	hackerRank.push('r');
    	hackerRank.push('e');
    	hackerRank.push('k');
    	hackerRank.push('c');
    	hackerRank.push('a');
    	hackerRank.push('h');
    	
    	for(Character c:s.toCharArray()){
    	if(c==hackerRank.peek()){
    		hackerRank.pop();
    	}
    	if (hackerRank.isEmpty()){
    		answer="YES";
    	}
    	}
    	return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	String s="hacakaeararanaka";
    	String result = hackerrankInString(s);
    	System.out.println(result);
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int qItr = 0; qItr < q; qItr++) {
//            String s = scanner.nextLine();
//
//            String result = hackerrankInString(s);
//
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
