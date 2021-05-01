package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		FileWriter fw = new FileWriter("LoremSaida3");
//		fw.write("teste FileWriter");
//		fw.write(System.lineSeparator());  // pular linha
//		fw.write("teste-2 linha");
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write("teste-3 linha");
		
		
//		FileWriter fw = new FileWriter("LoremSaida3"); 
//		BufferedWriter bw = new BufferedWriter(fw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("LoremSaida3"));

		
//		PrintStream ps = new PrintStream(new File("NovaSaida"));
//		PrintStream ps = new PrintStream("NovaSaida");		
		PrintWriter ps = new PrintWriter("NovaSaida.txt", "UTF-8");
		
		ps.println("Novo testes - xxxxxxxx");
		ps.println();
		ps.print("teste com PrintStream");
		
        ps.close(); 
		
		
	}

}
