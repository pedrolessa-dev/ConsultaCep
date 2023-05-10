package br.com.consulta.cep.model;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import br.com.consulta.cep.exception.CepNotFoundException;

public class ConsultaCep {
	public Endereco buscaEndereco(String cep) {
		Endereco endereco = new Endereco();
		String url = "https://viacep.com.br/ws/" + cep.replace(" ", "-") + "/json/";
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

		try {
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			endereco = new Gson().fromJson(response.body(), Endereco.class);
		} catch (Exception e) {
			throw new RuntimeException("Não foi possível obter o endereço com esse cep");
		}
		if (endereco.getCep() == null)
			throw new CepNotFoundException("Este cep não existe");
		return endereco;
	}
}
