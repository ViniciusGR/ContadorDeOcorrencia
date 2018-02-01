package br.com.viniciusgeraldoruas.contador.publicador;

import java.net.URI;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Publicador {
	public static void main(String[] args) {
		ResourceConfig rc = new ResourceConfig().packages(new String[] { "br.com.viniciusgeraldoruas.finder.service" });
		JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
	}
}
