package com.keshavpradeep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class MigratoryBirds {

	// Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
Map<Integer,Integer> hash= new HashMap<Integer,Integer>();
        for(Integer i:arr){
            if(hash.containsKey(i)){
                hash.put(i, hash.get(i)+1);
            }
            else{
                hash.put(i, 1);
            }
        }
        Integer number=0;
        List<Integer> highestNumbers=new ArrayList<Integer>();
        int smallestNumber=0;
        Set<Entry<Integer, Integer>> entrySet = hash.entrySet();
        for(Entry<Integer,Integer> e:entrySet){
            if(e.getValue()>number){
                number=e.getValue();
            }

          }

        
        for(Entry<Integer,Integer> e:entrySet){
            if(e.getValue().equals(number)){
                highestNumbers.add(e.getKey());
            }
          }

        if(highestNumbers.size()==1){
            return highestNumbers.get(0);
        }
        else{
             smallestNumber=highestNumbers.get(0);
            for(int i=1;i<highestNumbers.size();i++){
                if(highestNumbers.get(i)<smallestNumber){
                    smallestNumber=highestNumbers.get(i);
                }
            }
        }
        
        return smallestNumber;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
