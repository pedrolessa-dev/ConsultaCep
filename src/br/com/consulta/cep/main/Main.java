package br.com.consulta.cep.main;

import java.util.Scanner;

import br.com.consulta.cep.model.ConsultaCep;
import br.com.consulta.cep.model.Endereco;
import br.com.consulta.cep.model.GeradorJson;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cep = "";
		ConsultaCep consulta = new ConsultaCep();
		boolean fim = false;

		do {
			try {
				System.out.print("Digite um cep para busca: ");
				cep = sc.nextLine();
				Endereco endereco = consulta.buscaEndereco(cep);
				System.out.println(endereco);
				GeradorJson gerador = new GeradorJson();
				gerador.gerarJson(endereco);
				fim = true;
			} catch (RuntimeException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		} while (!fim);
		sc.close();
	}
}
