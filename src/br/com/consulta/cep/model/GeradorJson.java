package br.com.consulta.cep.model;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeradorJson {
	public void gerarJson(Endereco endereco) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try {
			FileWriter fw = new FileWriter(endereco.getCep() + ".json");
			fw.write(gson.toJson(endereco));
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
