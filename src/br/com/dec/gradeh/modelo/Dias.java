package br.com.dec.gradeh.modelo;

import java.util.ArrayList;
import java.util.List;

public class Dias extends Turmas{
	String nome;
	List<String> proib = new ArrayList<>();
	String m1, m2;

	public Dias(String nome) {
		this.nome = nome;
	}

	public void adicionarProib(String e) {
		proib.add(e);
	}

	void adicionarMateria(String mat) {
		if (proib.stream().noneMatch(n -> n.equalsIgnoreCase(mat))) {
			if (m1 == null) {
				m1 = mat;
			} else if (m2 == null) {
				m2 = mat;
			}
			adicionarProib(mat);
		}

	}
	
	public boolean ifNull() {
		return true;
	}

	public String getM1() {
		return m1;
	}

	public String getM2() {
		return m2;
	}

	@Override
	public String toString() {
		return "" + nome;
	}
	
	

}
