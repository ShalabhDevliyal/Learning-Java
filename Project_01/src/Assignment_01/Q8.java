package Assignment_01;

import java.util.Scanner;
/*
Q8. WAP in java, to delete index=3, element from the given array
	mentioned below.
	Int[] arr = {1,2,3,4,5,6,7,8,9}
	Note: Non relevance places would be filled with zeros.
 */
public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.print("Enter value: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter index: ");
		int ind=sc.nextInt();
		
		for(int i=ind;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[n-1]=0;
		n--;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}