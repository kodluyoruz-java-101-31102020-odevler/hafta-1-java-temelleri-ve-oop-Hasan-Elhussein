package soru5;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		for(int i = 0 ; i < 100 ; i++)
			arr[i] = (int) (Math.random()*100);
		
		TekCift tekCift = new TekCift(arr);
		
		//System.out.println(tekCift.getTek().length + tekCift.getCift().length);
		
		System.out.println("Tek sayılar :\n" + Arrays.toString(tekCift.getTek()));
		System.out.println("Çift sayılar:\n" + Arrays.toString(tekCift.getCift()));
		
	}

}
