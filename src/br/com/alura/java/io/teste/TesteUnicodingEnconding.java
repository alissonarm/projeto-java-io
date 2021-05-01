package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodingEnconding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "ç";
		System.out.println(s.codePointAt(0)); // retorna o Unicoding
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset);                  // devolve o Enconding
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes();
		System.out.println(bytes);
		System.out.println(bytes.length);

		byte[] bytes2 = s.getBytes("windows-1252");
		System.out.println(bytes2.length);
	
		byte[] bytes3 = s.getBytes("UTF-8");
		System.out.println(bytes3.length);

		byte[] bytes4 = s.getBytes("UTF-16");
		System.out.println(bytes4.length);

		byte[] bytes5 = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes5.length);
		
		byte[] b7 = s.getBytes("windows-1252");
		System.out.print(b7.length + ", windows-1252, ");
		String var1 = new String(b7, "windows-1252");
		System.out.println(var1);

		b7 = s.getBytes("UTF-16");
		System.out.print(b7.length + ", UTF-16, ");
//		var1 = new String(b7, "windows-1252"); apresenta o caracter inválido
		var1 = new String(b7, "UTF-16");
		System.out.println(var1);

		b7 = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(b7.length + ", US_ASCII, ");
//		var1 = new String(b7, "windows-1252");
		var1 = new String(b7, "US-ASCII");
		System.out.println(var1);
		
	}

}
