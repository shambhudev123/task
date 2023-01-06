//WAP to print all negative numbers in a sequence of numbers.

package Arrays;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter values in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}
}
