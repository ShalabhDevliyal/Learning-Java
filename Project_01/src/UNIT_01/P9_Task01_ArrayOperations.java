package UNIT_01;

/* Tasks given below:
obj.sortAnArray(array);
obj.findTheDuplicateElements(array);
obj.findSecondLargestAndSecondSmallestElement(array);
obj.leftRotationInAnArray(array); 
obj.removeElementInArray(array);//(Optional)
*/

import java.util.Arrays;  
import java.util.Scanner;
/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Task01_ArrayOperations {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };
		
		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		// write code here!
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("sorted array="+Arrays.toString(arr));
	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		System.out.print("duplicate elements:");
		int count=0;
		int i=0,j=0,temp=0;
		while(i<arr.length-1)
		{
			if(arr[i]==arr[j])
			{
				j++;
				count++;
			}
			else
			{
				if(count>1)
				{
					System.out.print(arr[i]+" ");
					i=j;
					count=0;
					temp=1;
				}
				else {
					i++;
					count=0;
				}
			}
		}
		if(temp==0)
		{
			System.out.print("no duplicate elements");
		}
		System.out.println();	
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!
		if(arr.length<2)
		{
			System.out.println("2nd largest and 2nd smallest element does not exists");
			return;
		}
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]==arr[i+1])
				continue;
			else
			{
				System.out.println("2nd largest element="+arr[i]);
				break;
			}
		}
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==arr[i-1])
				continue;
			else
			{
				System.out.println("2nd smallest element="+arr[i]);
				break;
			}
		}

	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!
		int r;
		System.out.print("how many times you want to rotate:");
		Scanner obj=new Scanner(System.in);
		r=obj.nextInt();
		r%=(arr.length);
		while(r--!=0) 
		{
			int temp=arr[0];
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
		}
		System.out.println("left rotation="+Arrays.toString(arr));
		obj.close();
	}

	void removeElementInArray(int[] arr) {
		// write code here!
		

	}

}