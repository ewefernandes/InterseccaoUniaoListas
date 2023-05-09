package controller;

import br.edu.fateczl.lista.listaint.Lista;

public class OperacoesListasInterUni implements IOperacoesListasInterUni {

	@Override
	public Lista interseccaoListas(Lista a, Lista b) throws Exception {
		int sizeB = b.size();
		int sizeA = a.size();
		int [] vetor = new int[sizeB];
		Lista i = new Lista();
		
		for (int j = 0; j < sizeB; j ++) {
			vetor[j] = b.get(j);
		}
		
		for (int cta = 0; cta < sizeB; cta ++) {
			for (int contA = 0; contA < sizeA; contA++) {
				if (vetor[cta] == a.get(contA)) {
					if (i.isEmpty()) {
						i.addFirst(vetor[cta]);
					} else {
						i.add(vetor[cta], i.size()-1);
					}
				}
			}
		}
		
		i.toString();
		return i;
	}

	@Override
	public Lista uniaoListas(Lista a, Lista b) throws Exception {
		Lista u = new Lista();
		int sizeA = a.size();
		int sizeB = b.size();
		int [] vetor = new int[sizeA+sizeB];
		
		for (int i = 0; i < sizeA; i ++) {
			vetor[i] = a.get(i);
		}
		
		for (int c = 0; c < sizeB; c ++) {
			vetor[sizeA + c] = b.get(c);
		}
		
		for (int i = 0; i < (sizeA + sizeB); i ++) {
			if (u.isEmpty()) {
				u.addFirst(vetor[i]);
			} else {
				u.add(vetor[i], i);
			}
		}
		
		u.toString();
		return u;
	}
}
