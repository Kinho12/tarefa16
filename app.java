package br.com.eapg.mod16;

public class app {
	
	public static void main (String args []) {
		
		ListaDeCarros listaDeCarros = new ListaDeCarros();
		
		listaDeCarros.adicionarCarros(new Honda());
		listaDeCarros.adicionarCarros(new Fiat());
		listaDeCarros.adicionarCarros(new Volkswagen());
		listaDeCarros.adicionarCarros(new Toyota());
		listaDeCarros.adicionarCarros(new Bmw());
		
		listaDeCarros.mostrarCarros();
	}

}
  
