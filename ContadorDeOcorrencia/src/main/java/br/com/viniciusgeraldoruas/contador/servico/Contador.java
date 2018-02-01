package br.com.viniciusgeraldoruas.contador.servico;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.viniciusgeraldoruas.contador.modelo.TermoETexto;

@Path("/finder")
public class Contador{

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public int search(TermoETexto tt) {
		String texto = tt.getTexto().toLowerCase();
		String termo = tt.getTermo().toLowerCase();
		int cont = 0;
			for (int i = 0; i < texto.length(); i++) {
				if (texto.charAt(i) != termo.charAt(0)) {
					continue;
				}
				if (texto.substring(i, i + termo.length()).equals(termo)) {
					i += termo.length() - 1;
					cont++;
				}
			}
		return cont;
	}

}
