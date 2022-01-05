package com.estudo.gof;

public class Faca {
	private RNFacade rn = new RNFacade();

	public static void main(String[] args) {
		new Faca().trabalhar();
	}

	public void trabalhar() {
		rn.comprar(Categoria.NORMAL);
		rn.alugar(Categoria.NORMAL);
	}
}
