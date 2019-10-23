package br.ucsal.listaEncadeada;

public interface IListaEncadeada {
	
	public void inserir(int valor);
	public void remover(int chave);
	public void buscar(int chave);
	public void atualizar(int chave, int novoValor);
	public void imprimir();
}
