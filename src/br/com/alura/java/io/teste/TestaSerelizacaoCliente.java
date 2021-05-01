package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestaSerelizacaoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//	    Cliente cliente = new Cliente();
//	    cliente.setNome("Alisson");
//	    cliente.setProfissao("Desenvolvedor");
//	    cliente.setCpf("71875896344");
//
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cli = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cli.getNome());
		System.out.println(cli.getCpf());
		System.out.println(cli.getProfissao());

	}

}
