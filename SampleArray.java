package array;

import java.util.*;
public class SampleArray {
	
	public static void main(String args[]) {
		
	int[] arr1= new int[5];
	
			arr1[0]=1;
			arr1[1]=2;
			arr1[2]=3;
			arr1[3]=4;
			arr1[4]=5;
			
			System.out.println("Array elemnets in the list are as below");
			for(int i=0; i<=arr1.length;i++)
			{
				System.out.println(i);
			}
			
			//Calling a private method from the public method to display the arralist
			ArrayList a = arrayList();
			System.out.println(a);
	}
	
	private static ArrayList arrayList(){
		
		//Creaton of a new ArrayList
		
		ArrayList<String> arrList= new ArrayList<String>();
		arrList.add("apple");
		arrList.add(1, "ball");
		
		System.out.println("Output is"+arrList.get(0));
		
		return arrList;
	}

}
