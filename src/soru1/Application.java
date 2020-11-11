package soru1;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String password = "123aBc";
		
		System.out.println("Lütfen şifreyi giriniz: ");
		String input = scan.next();
		
		scan.close();
		
		
		if(input.equals(password))
			System.out.println("Giriş Başarılı!");
		else
			System.out.println("Giriş Başarısız");
		
	}

}
