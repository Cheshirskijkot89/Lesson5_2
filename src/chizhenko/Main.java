package chizhenko;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int arrayLength;
		
		System.out.println("������� ������ �������");
		arrayLength = sc.nextInt();
		
		int[] myArray = new int[arrayLength];
		
		for (int j = 0; j < myArray.length; j++) {
			
			System.out.println("������� ������� � �������� " + j);
			
			myArray[j] = sc.nextInt();
			
		}
		
		sc.close();
		
		System.out.println(Arrays.toString(myArray));
		

	}

}
