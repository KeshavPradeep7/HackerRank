/*
 * A video player plays a game in which the character competes in a hurdle race. Hurdles are of varying heights, and the characters have a maximum height they can jump. There is a magic potion they can take that will increase their maximum jump height by  unit for each dose. How many doses of the potion must the character take to be able to jump all of the hurdles. If the character can already clear all of the hurdles, return .

Example


The character can jump  unit high initially and must take  doses of potion to be able to jump all of the hurdles.

Function Description

Complete the hurdleRace function in the editor below.

hurdleRace has the following parameter(s):

int k: the height the character can jump naturally
int height[n]: the heights of each hurdle
Returns

int: the minimum number of doses required, always  or more
Input Format

The first line contains two space-separated integers  and , the number of hurdles and the maximum height the character can jump naturally.
The second line contains  space-separated integers  where .

Constraints

Sample Input 0

5 4
1 6 3 5 2
Sample Output 0

2
Explanation 0

Dan's character can jump a maximum of  units, but the tallest hurdle has a height of :

image

To be able to jump all the hurdles, Dan must drink  doses.

Sample Input 1

5 7
2 5 4 5 2
Sample Output 1

0
 */
package com.keshavpradeep;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HurdleRace {

	// Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
int highestJump=height[0];
        for(int i=1;i<height.length;i++){
            if(height[i]>highestJump){
                highestJump=height[i];
            }
        }
        if(highestJump<k){
            return 0;
        }
        else{
            return highestJump-k;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
