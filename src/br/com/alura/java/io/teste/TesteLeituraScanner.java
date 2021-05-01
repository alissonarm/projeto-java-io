package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(new File("contas.csv"));
 		
		// hasNextLine() -> retorna um valor boolean indicando se a proxima linha tem conteudo.
		while (s.hasNextLine()) {
			String linha = s.nextLine();
//			System.out.println(linha);
			
			String[] valores = linha.split(",");
//			System.out.println(valores);
//			System.out.println(Arrays.toString(valores));
//			System.out.println(valores[3]);
			
			Scanner s2 = new Scanner(linha);
			s2.useLocale(Locale.US); // indica o padrão americano para o separador de decimal
			s2.useDelimiter(",");
		
			String tipo = s2.next();
			int agencia = s2.nextInt();
			int conta = s2.nextInt();
			String titular = s2.next();
			double saldo = s2.nextDouble();

//			System.out.println(tipo + " - " + agencia + " - " + conta + " - " + titular + " - " + saldo );

//			String valorFormatado = String.format("%s %s %s %s %s", v1, v2, v3, v4, v5);
//			String valorFormatado = String.format("%s -  %s-%s, %s: %s", v1, v2, v3, v4, v5);
//			String valorFormatado = String.format("%s -  %d-%d, %s: %f", v1, v2, v3, v4, v5);
//			String valorFormatado = String.format("%s -  %04d-%05d, %s: %f", tipo, agencia, conta, titular, saldo);
//			String valorFormatado = String.format("%s -  %04d-%05d, %20s: %08.2f", tipo, agencia, conta, titular, saldo);
//			String valorFormatado = String.format(Locale.GERMANY, "%s -  %04d-%05d, %20s: %08.2f", tipo, agencia, conta, titular, saldo);			
//			String valorFormatado = String.format(new Locale("pt"), "%s -  %04d-%05d, %20s: %08.2f", tipo, agencia, conta, titular, saldo);			
//			String valorFormatado = String.format(new Locale("pt","BR"), "%s -  %04d-%05d, %20s: %08.2f", tipo, agencia, conta, titular, saldo);			
//			System.out.println(valorFormatado);
			
//			System.out.format(new Locale("pt","BR"), "%s -  %04d-%05d, %20s: %08.2f", tipo, agencia, conta, titular, saldo);
			System.out.format(new Locale("pt","BR"), "%s -  %04d-%05d, %20s: %08.2f %n", tipo, agencia, conta, titular, saldo);
			
			s2.close();
		}	
		
		s.close();
		
	}

}
