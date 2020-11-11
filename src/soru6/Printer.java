package soru6;

public class Printer {
	
	public static void printPDFDocumetn(PDFDocument obj) {
		System.out.println(obj.getBody());
	}
	
	public static void printWordDocument(WordDocument obj) {
		System.out.println(obj.getBody());
	}

}



/* Bu sınıfın içinde Static metod kullandığımızın sebebi;
 * 
 * printPDFDocument ve printWordDocument metodları, sınıfa ait metodlardır,
 * bu metodları kullanmak için Printer sınıfından bir nesne oluşturmamıza gerek yoktur.
 */