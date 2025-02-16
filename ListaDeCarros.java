package br.com.eapg.mod16;

import java.util.ArrayList;

public class ListaDeCarros {
	
	private ArrayList<Carro> carros;
	
	public ListaDeCarros() {
		carros = new ArrayList<>();
	}

	
	public void adicionarCarros(Carro carro) {
		carros.add(carro);
		
	}
	
	
	public void mostrarCarros() {
		for(Carro carro : carros) {
			System.out.println("Nome: " + carro.nome() + ", Tipo: " + carro.tipo());
		}
	}
	
}
