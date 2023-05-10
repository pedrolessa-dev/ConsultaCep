package br.com.consulta.cep.model;

public class Endereco {
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;

	@Override
	public String toString() {
		return "Cep: " + cep + " - Logradouro: " + logradouro + " - Complemento: " + complemento + "\nBairro: " + bairro
				+ " - Localidade: " + localidade + " - Estado: " + uf;
	}

	public String getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public String getUf() {
		return uf;
	}

}
