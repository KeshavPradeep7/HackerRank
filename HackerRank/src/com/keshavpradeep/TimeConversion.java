/*
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid
Sample Input 0

07:05:45PM
Sample Output 0

19:05:45
 */

package com.keshavpradeep;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
	/*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    	String time=s.substring(s.length()-2, s.length());
        int changedTime=0;
        String correctTime=""; //correct time
        String finalTime="";
        int parseInt = Integer.parseInt(s.split(":")[0]);
        if(time.equals("PM")){
            if(parseInt<12){
                changedTime=parseInt+12;
                correctTime=String.valueOf(changedTime);
                finalTime+=correctTime+s.substring(2, s.length()-2);
            }
            else if(parseInt==12){
                finalTime=s.substring(0,s.length()-2);
            }
        }
        if(time.equals("AM")){
            if(Integer.parseInt(s.split(":")[0])==12 ){
                String hours="00";
                finalTime+=hours+s.substring(2, s.length()-2);
            }
            else{
                finalTime=s.substring(0,s.length()-2);
            }
        }
        return finalTime;
    }

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = scan.nextLine();
        String result = timeConversion(s);
        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
