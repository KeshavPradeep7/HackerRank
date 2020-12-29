/*
 * There is a sequence of words in CamelCase as a string of letters, , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , determine the number of words in .

Example

There are  words in the string: 'one', 'Two', 'Three'.

Function Description

Complete the camelcase function in the editor below.

camelcase has the following parameter(s):

string s: the string to analyze
Returns

int: the number of words in 
Input Format

A single line containing string .

Constraints

Sample Input

saveChangesInTheEditor
Sample Output

5
 */
package com.keshavpradeep;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CamelCase {

	// Complete the camelcase function below.
    	static int camelcase(String s) {
    		int wordCount=0;
    		        for(Character c:s.toCharArray()){
    		            if(Character.isUpperCase(c)){
    		                wordCount++;
    		            }
    		        }

    		return wordCount+1;

    		    }

    		    private static final Scanner scanner = new Scanner(System.in);

    		    public static void main(String[] args) throws IOException {
    		        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    		        String s = scanner.nextLine();

    		        int result = camelcase(s);

    		        bufferedWriter.write(String.valueOf(result));
    		        bufferedWriter.newLine();

    		        bufferedWriter.close();

    		        scanner.close();
    		    }
}
