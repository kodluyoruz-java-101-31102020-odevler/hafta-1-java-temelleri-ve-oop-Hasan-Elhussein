package soru2;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num1 = 0, num2 = 0;
		int status = 0;
		
		
		System.out.println("Lütfen yapmak istediğiniz işlemin (numarasını) giriniz:\n1. Toplama\n2. Cıkarma\n3. Çarpma\n4. Bölme");
		status = scan.nextInt();
		
		System.out.println("Birinci sayi giriniz:");
		num1 = scan.nextDouble();
		
		System.out.println("İkinci sayi giriniz:");
		num2 = scan.nextDouble();
		scan.close();
		
		
		switch (status) {
		case 1: {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		}
		case 2: {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		}
		case 3: {
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			break;
		}
		case 4: {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			break;
		}
		default:
			System.out.println("Hatalı giriş.");
			throw new IllegalArgumentException("Unexpected value: " + status);
		}
		

	}
	
}
