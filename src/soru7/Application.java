package soru7;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		
		Date dt = new Date();
		
		Report r = new Report();
		r.setName("initial report");
		r.setResult("successfull");
		r.setCreateDate(dt);
		
		Printer.print(r);
		
	}

}
