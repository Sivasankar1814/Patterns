package Numberpattern;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
//	 Scanner scn = new Scanner(System.in);
//	 System.out.println("Enter number");
//        int n=scn.nextInt();
//        
//    for(int i=1;i<=n;i++){
//    	 for(int j=1;j<=i;j++){
//    		 System.out.print(j);	
//    	    }
//    	 for(int j=i-1;j>=1;j--){
//    	     System.out.print(j);   
//    		}
//    	 System.out.println();
//    }
		
		   
		        int[] numbers = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9,2,4,2};

		        for (int i = 0; i < numbers.length; i++) {
		            for (int j = i + 1; j < numbers.length; j++) {
		                if (numbers[i] == numbers[j]) {
		                    System.out.println("Duplicate number found: " + numbers[i]);
		                    System.out.println("hello");
		                }
		            }
		        }
		    }
		}
		