package soru3;
import java.lang.Math;

public class Application {
	
	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		for(int i = 0 ; i < 100 ; i++)
			arr[i] = (int) (Math.random()*100);
		

		System.out.println("mean = " + mean(arr));
		
	}
	
	public static double mean(int arr[]) {	
		double sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
			sum += arr[i];
		
		return sum/arr.length;
	}

}
