/*
task is in the website below:
https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      
        // create an array with n
        
        int [] a = new int [n];
        
        // add element into the array
        for (int i = 0; i<n ; i++){
          a[i] = scan.nextInt();
            
                    }

    

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
