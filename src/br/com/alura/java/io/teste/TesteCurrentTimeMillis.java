package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteCurrentTimeMillis {

    public static void main(String[] args) throws IOException {

        long ini = System.currentTimeMillis();
        System.out.println("Inicio: " + ini);

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        bw.close();

        long fim = System.currentTimeMillis();
        System.out.println("Fim: " + fim);

        System.out.println("Passaram " + (fim - ini) + " milissegundos");

    }
}