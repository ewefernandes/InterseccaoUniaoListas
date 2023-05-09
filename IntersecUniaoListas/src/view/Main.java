package view;

import br.edu.fateczl.lista.listaint.Lista;
import controller.IOperacoesListasInterUni;
import controller.OperacoesListasInterUni;

public class Main {

	public static void main(String[] args) throws Exception {
		Lista listA = new Lista();
		Lista listB = new Lista();
		
		listA.addFirst(3);
		listA.add(5, 1);
		listA.add(8, 2);
		listA.add(12, 3);
		listA.add(9, 4);
		listA.add(7, 5);
		listA.addLast(16);
		
		listB.addFirst(9);
		listB.add(6, 1);
		listB.add(2, 2);
		listB.add(3, 3);
		listB.addLast(7);
		
		IOperacoesListasInterUni op = new OperacoesListasInterUni();
		System.out.println(op.interseccaoListas(listA, listB));
		System.out.println(op.uniaoListas(listA, listB));
	}

}
