package soru7;

public class DatabaseOperations {
	
	public static void open() {
		System.out.println("Opened..");
	}
	
	public static Report runQuery(String q) {
		System.out.println("\"" + q + "\"" + " ran successfully..");
		return null;
	}
	
}
