package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arr = {"Hello", "How", "Are", "You", "Doing"};
		
		//2. print the third element in the array
		System.out.println(arr[2]);
		
		//3. set the third element to a different value
		arr[2] = "Was";
		
		//4. print the third element again
		System.out.println(arr[2]);
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//6. make an array of 50 integers
		int[] numArr = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < numArr.length; i++) {
			Random ran = new Random();
			int num = ran.nextInt(50);
			numArr[i] = num;
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int leastNum = 100;
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] < leastNum) {
				leastNum = numArr[i];
			}
		}
		System.out.println(leastNum);
		
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		
		//10. print the largest number in the array.
		int largeNum = -10;
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > largeNum) {
				largeNum = numArr[i];
			}
		}
		System.out.println(largeNum);
	}
}
