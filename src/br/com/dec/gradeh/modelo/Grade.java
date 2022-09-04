package br.com.dec.gradeh.modelo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Grade {
	public static void main(String[] args) {

		Turmas sexto = new Turmas();
		Turmas setimo = new Turmas();
		Turmas oitavo = new Turmas();
		Turmas nono = new Turmas();
		
		Dias seg = new Dias("seg");
		Dias ter = new Dias("ter");
		Dias qua = new Dias("qua");
		Dias qui = new Dias("qui");
		Dias sex = new Dias("sex");
		
		List<Dias> semana = Arrays.asList(seg, ter, qua, qui, sex);

		for (Dias dias : semana) {
			sexto.adicionarDias(dias);
		}
		
		for (Dias dias : semana) {
			setimo.adicionarDias(dias);
		}
		
		for (Dias dias : semana) {
			oitavo.adicionarDias(dias);
		}
		
		for (Dias dias : semana) {
			nono.adicionarDias(dias);
		}
		
		seg.adicionarProib("RELIGIAO E ARTES");
		seg.adicionarProib("HISTORIA");
		seg.adicionarProib("INGLES");
		seg.adicionarProib("ED FISICA");
		
		ter.adicionarProib("MATEMATICA");
		ter.adicionarProib("RELIGIAO");
		ter.adicionarProib("CIENCIAS");
		
		qua.adicionarProib("CIENCIAS");
		
		qui.adicionarProib("RELIGIAO");
		qui.adicionarProib("CIENCIAS");
		qui.adicionarProib("GEOGRAFIA");
		qui.adicionarProib("INGLES");
		
		sex.adicionarProib("RELIGIO");
		sex.adicionarProib("INGLES");
		sex.adicionarProib("ED FISICA");

		
		List<String> materias = Arrays.asList(
				"MATEMATICA","MATEMATICA",
				"PORTUGUES", "PORTUGUES", 
				"HISTORIA","GEOGRAFIA",
				"CIENCIAS", "INGLES",
				"RELIGIAO E ARTES");
		
		var rand = new Random();
		
		while (sexto.dias.stream().anyMatch(i -> (i.m1 == null) || (i.m2 == null))) { 
		sexto.dias.forEach(n -> {
			var nextRandString = rand.nextInt(0, materias.size());
			n.adicionarMateria(materias.get(nextRandString));
			nextRandString = rand.nextInt(0, materias.size());
			n.adicionarMateria(materias.get(nextRandString));
		});
		} 
		
		while (setimo.dias.stream().anyMatch(i -> (i.m1 == null) || (i.m2 == null))) { 
			setimo.dias.forEach(n -> {
				var nextRandString = rand.nextInt(0, materias.size());
				n.adicionarMateria(materias.get(nextRandString));
				nextRandString = rand.nextInt(0, materias.size());
				n.adicionarMateria(materias.get(nextRandString));
			});
		} 
		
		while (oitavo.dias.stream().anyMatch(i -> (i.m1 == null) || (i.m2 == null))) { 
			oitavo.dias.forEach(n -> {
				var nextRandString = rand.nextInt(0, materias.size());
				n.adicionarMateria(materias.get(nextRandString));
				nextRandString = rand.nextInt(0, materias.size());
				n.adicionarMateria(materias.get(nextRandString));
			});
		} 
		
		while (nono.dias.stream().anyMatch(i -> (i.m1 == null) || (i.m2 == null))) { 
			oitavo.dias.forEach(n -> {
				var nextRandString = rand.nextInt(0, materias.size());
				n.adicionarMateria(materias.get(nextRandString));
				nextRandString = rand.nextInt(0, materias.size());
				n.adicionarMateria(materias.get(nextRandString));
			});
		} 
		
		sexto.dias.forEach(n -> System.out.println(n.nome + " " + n.m1 + " " + n.m2));
		System.out.println();
		setimo.dias.forEach(n -> System.out.println(n.nome + " " + n.m1 + " " + n.m2));
		System.out.println();
		oitavo.dias.forEach(n -> System.out.println(n.nome + " " + n.m1 + " " + n.m2));
		System.out.println();
		nono.dias.forEach(n -> System.out.println(n.nome + " " + n.m1 + " " + n.m2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
