package com.parasepearator.interfaces;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class ParaSepearatorImpl {
//	 private static Logger log = Logger.getLogger("ParaSepearator");

	public void readFileData(ArrayList<String> arrayList) throws IOException {
		PdfReader reader = null;
		try {
			reader = new PdfReader("/home/airlap108/pdf/PDF/Ker/1833-2020.pdf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		IdentifyPara(reader , arrayList );
	}

	public void IdentifyPara(PdfReader reader, ArrayList<String> arrayList) throws IOException {
//		PropertyConfigurator.configure("log4j.properties");
		int noOfPages = reader.getNumberOfPages();
		for (int i = 1; i <= noOfPages; i++) {
			String textFromPage = PdfTextExtractor.getTextFromPage(reader, i);
			String lines[] = textFromPage.split("\\r?\\n");
			for (String line : lines) {
				for (String s : arrayList) {
					if (Pattern.compile(s).matcher(line).find()) {
						System.out.println("---------------------------------->>>>>>>>>>>>>>");
//						log.info("------------------------------------>>>>>>>>>>");
					}
				}
				
				System.out.println(line);
//				log.info(line);
			} 
		}
	}

	public void confirmPara() {

	}


}
