package br.com.viniciusgeraldoruas.contador.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TermoETexto {
	private String termo;
	private String texto;

	public String getTermo() {
		return termo;
	}

	public void setTermo(String termo) {
		this.termo = termo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
