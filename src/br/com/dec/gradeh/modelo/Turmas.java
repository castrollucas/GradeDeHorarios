package br.com.dec.gradeh.modelo;

import java.util.ArrayList;
import java.util.List;

public class Turmas {
	List<Dias> dias = new ArrayList<>();

	void adicionarDias(Dias d) {
		dias.add(d);
	}

	boolean verificarMat1Pree(Dias d) {
		if(d.m1 == null) {
		return false;
		}
		return true;
	}

	String verificarMat2Pree(Dias d) {
		return d.m2;
	}

}