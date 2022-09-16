package pTwo;

import java.util.Random;

public class SmallestNumber {

	public static void main(String[] args) {
		
	//	smallestNumber();
	System.out.println(multipy(6, 3));

	}
	
	
	public static  void smallestNumber() {
	     Random rnum = new Random();
	      int[] numbers = new int[ 500 ];
	      numbers[0] = rnum.nextInt(1000); 
	      int smallest = numbers[0];
	      for (int counter = 1 ; counter < 500; counter++) 
	      {
	          numbers[counter ] = rnum.nextInt(1000);
	          System.out.println(numbers[counter]);
	          smallest = Math.min( smallest , numbers[counter ] ); 

	      }
	      System.out.println("Smallest number is " + smallest);
	}
	
	public static int multipy(int one , int two) {
		
		return	one*two;
		
	}
}
