package epsisode10;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		String[] guns = {"AKM","AUG","AWM","GROZA","MEZ"}; //Arrays indexing 0,1,2,3,4 e.g. 0=AKM
		System.out.println(guns[0]);
		
		//to display all the records in an ARRAY
		
		System.out.println(Arrays.toString(guns));
		
		//To declare array as object
		
		int[] a=new int[4];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		
		
		System.out.println(Arrays.toString(a));
	
		

	}

}
