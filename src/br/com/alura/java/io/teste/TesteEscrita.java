package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
// import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		//Fluxo de saida com arquivo
        FileOutputStream fos = new FileOutputStream("lorem2.txt");
        Writer  osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        
		bw.write("teste");
		bw.newLine();
		bw.write("teste-2 linha");
		bw.newLine();
		bw.newLine();
		bw.write("teste-3 linha");
        
        bw.close();// fecha o buffer 
		
		
	}

}
