package br.ucsal.listaEncadeada;

public class ListaEncadeada implements IListaEncadeada{
	
	No inicio = null;
	
	@Override
	public void inserir(int valor) {
		No novo = new No();
		novo.valor = valor;
		
		if(inicio == null) {
			inicio = novo;
		} 
		else {
			No aux = inicio;
			while(aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = novo;
		}
	}

	@Override
	public void remover(int chave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscar(int chave) {
		if(inicio == null) {
			System.out.println("Lista Vazia");
		}
		else {
			No aux = inicio;
			while(aux.prox != null && aux.prox.valor != chave) {
				aux = aux.prox;
			}
		}
	}

	@Override
	public void atualizar(int chave, int novoValor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}

}
