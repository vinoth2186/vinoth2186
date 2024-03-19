package epsisode10;

import java.util.Arrays;

public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruits= new  String[5];
		fruits[0]="Apple";
		fruits[1]="Orangle";
		fruits[2]="Kiwi";
		fruits[3]="Graps";
		fruits[4]="Melon";
		int count=fruits.length;
		
		//TO print all the values from Array
		
		System.out.println(Arrays.toString(fruits));
		
		//Count of an Array
		System.out.println(count);
		System.out.println(count-1);
		
	}

}
