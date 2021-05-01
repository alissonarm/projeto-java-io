package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

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
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("LoremSaida3"));
		bw.write("teste FileWriter c/ BufferedWriter");
		bw.newLine();
		bw.write("Outra linha");
		bw.newLine();
		bw.newLine();
		bw.write("teste-3 linhas");
		
		
        bw.close();// fecha o buffer 
		
		
	}

}
