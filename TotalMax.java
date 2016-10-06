package hola;
import java.util.*;
public class TotalMax {
	public static void main(String[] args) {
		int[] myList = {2,1,0,6,1,4,3};
	
	//for loop, print all numbers in the array	
	for (int i=0; i <= myList.length-1; i++ ) {
		System.out.println("Array[" + i + "]: " + myList[i]);
	}
	//add all numbers
	int total = 0;
	for (int i=0; i <= myList.length-1 ; i++ ){
	total = total + myList[i];
	}
	double average = total / myList.length;
	System.out.println("");
	System.out.println("Total = " + total);
	System.out.println("Average = " + average);
	//find the largest number
	//compare first number to next, then assign as max
	int max = myList[0];
	for (int i=0; i <= myList.length-1 ; i++ )
		if (myList[i] > max)
			max = myList[i];
	
	System.out.println("Max = " + max);

	}
	}


