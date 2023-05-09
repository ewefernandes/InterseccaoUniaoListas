package controller;

import br.edu.fateczl.lista.listaint.Lista;

public interface IOperacoesListasInterUni {

	public Lista interseccaoListas(Lista a, Lista b) throws Exception;
	public Lista uniaoListas(Lista a, Lista b) throws Exception;
}
