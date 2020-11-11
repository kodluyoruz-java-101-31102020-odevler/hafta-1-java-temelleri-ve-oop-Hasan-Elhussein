package soru7;

public class Printer {
	
	public static void print(Report r) {
		System.out.println("Name:        " + r.getName());
		System.out.println("Result:      " + r.getResult());
		System.out.println(("Create Date: " + r.getCreateDate()));
	}

}
