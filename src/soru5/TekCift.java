package soru5;

public class TekCift {
	
	private int[] tek;
	private int[] cift;
	
	
	public TekCift(int[] arr) {
		
		int tekSize = 0;
		int ciftSize = 0;
		int tekCount = 0;
		int ciftCount = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]%2 == 0)
				ciftSize++;
			else
				tekSize++;
		}
		
		tek = new int[tekSize];
		cift = new int[ciftSize];
		
		for(int j = 0 ; j < arr.length ; j++) {
			if(arr[j]%2 == 0) {
				cift[ciftCount] = arr[j];
				ciftCount++;
			}else {
				tek[tekCount] = arr[j];
				tekCount++;
			}
		}
			
	}
	
	
	public int[] getTek() {
		return tek;
	}
	
	public int[] getCift() {
		return cift;
	}
	

}
