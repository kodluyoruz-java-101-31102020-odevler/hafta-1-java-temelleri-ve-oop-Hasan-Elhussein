package soru6;

public class Application {

	public static void main(String[] args) {
		
		PDFDocument pdfObj = new PDFDocument("Merhaba!");
		WordDocument wordObj = new WordDocument("Hello!");
		
		Printer.printPDFDocumetn(pdfObj);
		Printer.printWordDocument(wordObj);
		
	}

}
