package com.parasepearator.interfaces;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class ParaSepearator {

	public static void main(String[] args) throws IOException {
		ParaSepearatorImpl psImpl = new ParaSepearatorImpl();
		ArrayList<String> Madras = new ArrayList<String>();
		Madras.add("^\\d+\\.\\s+");
		Madras.add("^\\d+\\.\\d+\\.\\s|^\\d+\\.\\d+\\s|^\\d+\\.[a-zA-Z]");
		Madras.add("^[\\“\"]\\w+[\\s\\.]");
		Madras.add("^\\“\\([a-zA-Z]\\)\\s+");
		Madras.add("^\\([a-zA-Z\\d]+\\)\\s+|^\\s\\([a-z\\d]+\\)\\s+");
		Madras.add("^[a-z]+\\)\\s+");
		Madras.add("^\\s\\d+\\.\\s");

		ArrayList<String> Allahabad = new ArrayList<String>();
		Allahabad.add("^\\d+\\.\\s+.");
		Allahabad.add("^[\\“\"]\\w+[\\s\\.]");
//		Allahabad.add("^\\(\\d+\\)\\s+");
//		Allahabad.add("^[IVXLM]+\\s\\D");
		Allahabad.add("^\\([a-zA-Z\\d]+\\)\\s+|^\\s\\([a-z\\d]+\\)\\s+");
		Allahabad.add("^\\d+\\)\\s+");
		Allahabad.add("^[ivxlm]+\\([a-z]\\)\\s+");

		ArrayList<String> Bombay = new ArrayList<String>();
		Bombay.add("^\\d+\\.\\s+.");
		Bombay.add("^[\\“\"]\\w+[\\s\\.]");
//		Bombay.add("^\\(\\d+\\)\\s+");
		Bombay.add("^\\w{1,4}\\]\\s+\\D");
		Bombay.add("^[IVXLM]+\\s\\D");
		Bombay.add("^\\([a-zA-Z\\d]+\\)\\s+|^\\s\\([a-z\\d]+\\)\\s+");
		Bombay.add("^[a-z]+\\)\\s+");
		Bombay.add("^[ivxlm]+\\([a-z]\\)\\s+");

		ArrayList<String> Delhi = new ArrayList<String>();
		Delhi.add("^\\d+\\.\\s+.");
		Delhi.add("^[\\“\"]\\w+\\s+|^[\\“\"]\\w+\\.\\s+");
		Delhi.add("^\\(\\w+\\)\\s+\\D");
		Delhi.add("^[a-z]+\\)\\s+");
		Delhi.add("^\\d+\\.\\d+\\.\\s+");
		Delhi.add("^[\\“\"]\\.\\D");

		ArrayList<String> Gujarat = new ArrayList<String>();
		Gujarat.add("^\\d+\\.[\\sA-Za-z]+");
		Gujarat.add("^\\d+\\.\\d+\\s");
		Gujarat.add("^[\\“\"]\\w+[\\s+\\.\\,]|^[\\“\"]\\s+\\w+");
		Gujarat.add("^[\\“\"]\\w+[\\s\\.]");
		Gujarat.add("^[\\“\"]\\(\\w+\\)\\s+");
		Gujarat.add("^\\(\\w+\\)[\\s+\\D]|^\\s+\\(\\w+\\)");
		Gujarat.add("^[\\“\"]\\d+\\(\\D+\\)");
		Gujarat.add("^\\d+\\.\\d+\\.\\s+");

		ArrayList<String> Karnatak = new ArrayList<String>();
		Karnatak.add("^\\d+\\.\\s+");
//		Karnatak.add("^\\d+\\.\\d+\\.\\s|^\\d+\\.\\d+\\s|^\\d+\\.[a-zA-Z]");
		Karnatak.add("^[“\"]\\w+[\\s\\.]|^\\s[“\"][a-zA-Z]");
		Karnatak.add("^[“\"]\\d+\\(\\d+\\)\\s+");
//		Karnatak.add("^\\“\\([a-zA-Z]\\)\\s+|^[a-zA-Z]\\)\\s+");
//		Karnatak.add("^\\([a-zA-Z\\d]+\\)\\s+|^\\s\\([a-z\\d]+\\)\\s+");
		Karnatak.add("^\\([a-zA-Z\\d]+\\)\\s+|^\\s+\\([a-zA-Z\\d]+\\)\\s+|^[a-zA-Z]+\\)\\s+");
//		Karnatak.add("^[ivlmx]+[\\. )]+");
		Karnatak.add("^\\s\\d+\\.\\s");
		Karnatak.add("^[“\"]\\[ivlmx]+\\)\\s+");

		ArrayList<String> Patna = new ArrayList<String>();
		Patna.add("^\\d+\\.\\s+");
//		Patna.add("^\\d+\\.\\d+\\.\\s|^\\d+\\.\\d+\\s|^\\d+\\.[a-zA-Z]");
		Patna.add("^[“\"]\\w+[\\s\\.]|^\\s[“\"][a-zA-Z]");
		Patna.add("^[“\"]\\d+\\(\\d+\\)\\s+");
		Patna.add("^\\“\\([a-zA-Z]\\)\\s+|^[a-zA-Z]\\)\\s+");
		Patna.add("^\\([a-zA-Z\\d]+\\)\\s+|^\\s\\([a-z\\d]+\\)\\s+");
		Patna.add("^\\([a-zA-Z]\\)\\([a-zA-Z]\\)");
		Patna.add("^[ivlmx]+\\.+");
		Patna.add("^\\s\\d+\\.\\s");

		ArrayList<String> Chhattisgrah = new ArrayList<String>();
		Chhattisgrah.add("^\\d+\\.\\s+");
		Chhattisgrah.add("^[“\"]\\d+\\.\\s+");
		Chhattisgrah.add("^[“\"]\\w+\\s+");
		Chhattisgrah.add("^\\(\\w+\\)\\s+"); // (2009)
		Chhattisgrah.add("^\\s+\\d+\\.\\s+");
		Chhattisgrah.add("^\\w+\\)\\s+");

		ArrayList<String> HimachalPradesh = new ArrayList<String>();// conditions not detect. 
		HimachalPradesh.add("^\\([A-Za-z]+\\)\\s+|^\\([ivxlm]+\\)\\s+");
		HimachalPradesh.add("^\\s+\\(\\w+\\)\\s+");
		HimachalPradesh.add("^\\d+\\.\\s+");
		HimachalPradesh.add("^[“\"]\\d+\\.\\s+");
		HimachalPradesh.add("^\\w+\\)\\.\\s+");
		
		
		ArrayList<String> Jharkhand = new ArrayList<String>();
		Jharkhand.add("^\\w+\\)\\s+");
		Jharkhand.add("^\\d+\\.\\s+|^\\s+\\d+\\.\\s+");
		Jharkhand.add("^\\(\\w+\\)\\s+|^\\s+\\(\\w+\\)\\s+");
		Jharkhand.add("^\\d+\\s+\\(\\w+\\)\\s+");
		Jharkhand.add("^[“\"]+\\d+\\.\\s+|^\\s+[“\"]\\w+[\\.\\s+]");
		Jharkhand.add("^[\\s]\\(\\d+\\)\\(\\w+\\)");
		Jharkhand.add("^\\d+\\(\\w+\\)\\s+");
		Jharkhand.add("^[“\"\\s]\\d+\\-\\s+");
		Jharkhand.add("^\\d+\\.\\d+\\.\\s+");
		
		ArrayList<String> JammuKashmir = new ArrayList<String>();
		JammuKashmir.add("^\\d\\s+[A-Za-z]+");
		JammuKashmir.add("^\\d+\\.\\s+|^\\s+\\d+\\.\\s+");
		JammuKashmir.add("^[“\"][a-zA-Z]+\\s+|[“\"][a-zA-Z]+\\,\\s+");
		JammuKashmir.add("^\\w+\\)\\s+");
		
		
		ArrayList<String> Kerla = new ArrayList<String>();
		Kerla.add("^\\d+\\.\\s+|^\\s+\\d+\\.\\s+");
		Kerla.add("^\\s+[“\"]\\w+[\\.\\s+]");
		Kerla.add("^\\w+\\)[A-Za-z]+\\s+");
		Kerla.add("^\\(\\w+\\)\\s+");
	
		
		
		Map<String, ArrayList<String>> table = new Hashtable();
		table.put("Mad", Madras);
		table.put("All", Allahabad);
		table.put("Bom", Bombay);
		table.put("Del", Delhi);
		table.put("Guj", Gujarat);
		table.put("Kar", Karnatak);
		table.put("Pat", Patna);
		table.put("Chh", Chhattisgrah);
		table.put("Hp", HimachalPradesh);
		table.put("Jhar", Jharkhand);
		table.put("J&K", JammuKashmir);
		table.put("Kerla", Kerla);
		psImpl.readFileData(table.get("Kerla"));
	}

}
